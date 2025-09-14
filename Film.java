package model;

public class Film {
    // Properties (private sesuai encapsulation)
    private String judul;
    private String sutradara;
    private double rating;

    // Constructor
    public Film(String judul, String sutradara, double rating) {
        this.judul = judul;
        this.sutradara = sutradara;
        this.rating = rating;
    }

    // Getter & Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Info film (seperti infoBuku di praktikum)
    public void infoFilm() {
        System.out.println("======================");
        System.out.println("Judul Film    : " + judul);
        System.out.println("Sutradara     : " + sutradara);
        System.out.println("Rating        : " + rating);
    }
}
