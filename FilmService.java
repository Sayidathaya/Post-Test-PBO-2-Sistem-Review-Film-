package service;

import model.Film;
import java.util.ArrayList;

public class FilmService {
    private ArrayList<Film> daftarFilm = new ArrayList<>();

    // CREATE
    public void tambahFilm(Film film) {
        daftarFilm.add(film);
        System.out.println("Film berhasil ditambahkan!");
    }

    // READ
    public void tampilkanFilm() {
        if (daftarFilm.isEmpty()) {
            System.out.println("Belum ada film.");
        } else {
            System.out.println("\nDaftar Film:");
            for (int i = 0; i < daftarFilm.size(); i++) {
                Film f = daftarFilm.get(i);
                System.out.println((i+1) + ". " + f.getJudul() + " | Sutradara: " + f.getSutradara() + " | Rating: " + f.getRating());
            }
        }
    }

    // UPDATE
    public boolean updateFilm(String judul, double ratingBaru) {
        for (Film f : daftarFilm) {
            if (f.getJudul().equalsIgnoreCase(judul)) {
                f.setRating(ratingBaru);
                System.out.println("Rating film berhasil diperbarui!");
                return true;
            }
        }
        System.out.println("Film tidak ditemukan!");
        return false;
    }

    // DELETE
    public boolean hapusFilm(String judul) {
        for (Film f : daftarFilm) {
            if (f.getJudul().equalsIgnoreCase(judul)) {
                daftarFilm.remove(f);
                System.out.println("Film berhasil dihapus!");
                return true;
            }
        }
        System.out.println("Film tidak ditemukan!");
        return false;
    }

    // SEARCH
    public Film cariFilm(String judul) {
        for (Film f : daftarFilm) {
            if (f.getJudul().equalsIgnoreCase(judul)) {
                return f;
            }
        }
        return null;
    }
}