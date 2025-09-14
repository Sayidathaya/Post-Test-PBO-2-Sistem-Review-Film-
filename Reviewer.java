package model;

import java.util.ArrayList;

public class Reviewer {
    private String nama;
    private String id;
    private ArrayList<Film> filmDireview;

    public Reviewer(String nama, String id) {
        this.nama = nama;
        this.id = id;
        this.filmDireview = new ArrayList<>();
    }

    public void reviewFilm(Film film) {
        filmDireview.add(film);
        System.out.println(nama + " memberikan review pada film " + film.getJudul());
    }

    public void infoReviewer() {
        System.out.println("\nNama Reviewer : " + nama);
        System.out.println("ID Reviewer   : " + id);
        System.out.println("Film yang direview: ");
        if (filmDireview.isEmpty()) {
            System.out.println("Belum ada review.");
        } else {
            for (Film f : filmDireview) {
                f.infoFilm();
            }
        }
        System.out.println("======================");
    }
}