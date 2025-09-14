package main;

import model.Film;
import model.Reviewer;
import service.FilmService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FilmService service = new FilmService();
        Reviewer reviewer = new Reviewer("Sayid", "RV001");
        int pilihan;

        do {
            System.out.println("\n=== Sistem Review Film (CRUD) ===");
            System.out.println("1. Tambah Film");
            System.out.println("2. Tampilkan Semua Film");
            System.out.println("3. Update Rating Film");
            System.out.println("4. Hapus Film");
            System.out.println("5. Cari Film");
            System.out.println("6. Info Reviewer");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");

            while (!input.hasNextInt()) { // validasi angka
                System.out.println("Input harus angka!");
                input.next();
                System.out.print("Pilih menu: ");
            }
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul film: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan sutradara film: ");
                    String sutradara = input.nextLine();
                    System.out.print("Masukkan rating (0.0-10.0): ");
                    double rating = input.nextDouble();
                    input.nextLine();
                    Film filmBaru = new Film(judul, sutradara, rating);
                    service.tambahFilm(filmBaru);
                    reviewer.reviewFilm(filmBaru);
                    break;

                case 2:
                    service.tampilkanFilm();
                    break;

                case 3:
                    System.out.print("Masukkan judul film yang ingin diupdate: ");
                    String judulUpdate = input.nextLine();
                    System.out.print("Masukkan rating baru: ");
                    double ratingBaru = input.nextDouble();
                    input.nextLine();
                    if (!service.updateFilm(judulUpdate, ratingBaru)) {
                        System.out.println("Film tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan judul film yang ingin dihapus: ");
                    String judulHapus = input.nextLine();
                    if (!service.hapusFilm(judulHapus)) {
                        System.out.println("Film tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.print("Masukkan judul film yang dicari: ");
                    String judulCari = input.nextLine();
                    Film hasil = service.cariFilm(judulCari);
                    if (hasil != null) {
                        System.out.println("Film ditemukan:");
                        hasil.infoFilm();
                    } else {
                        System.out.println("Film tidak ditemukan.");
                    }
                    break;

                case 6:
                    reviewer.infoReviewer();
                    break;

                case 7:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 7);

        input.close();
    }
}