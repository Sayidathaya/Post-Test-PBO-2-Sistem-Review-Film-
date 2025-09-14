# 🎬 Sistem Review Film

## 📌 Deskripsi Singkat Program

Program ini adalah sistem sederhana untuk **mengelola review film** menggunakan bahasa Java.
Fitur yang tersedia mencakup **CRUD (Create, Read, Update, Delete)** data film, pencarian film berdasarkan judul, serta validasi input agar data yang dimasukkan benar. Program dijalankan melalui **menu interaktif** di console.

Struktur project menggunakan **pola MVC (Model-View-Controller)** dengan pembagian packages:

* `model` → menyimpan struktur data (Film, Reviewer)
* `service` → berisi logika CRUD (FilmService)
* `main` → entry point (Main.java, menu interaktif untuk user)

---

## 📂 Struktur Package

<img width="288" height="292" alt="Image" src="https://github.com/user-attachments/assets/83de7089-1ce9-400c-acd2-a0a8a7d9585e" />

---

## 📝 Dokumentasi Class

### 1. `model.Film.java`

**Tujuan:** Merepresentasikan entitas film.

<img width="867" height="850" alt="Image" src="https://github.com/user-attachments/assets/2ecf3837-edd0-4137-a2b4-7241f364ace9" />

<img width="865" height="268" alt="Image" src="https://github.com/user-attachments/assets/aa766597-588a-4851-98d7-4c1ffaf6c953" />

* **Properties:**

  * `private String judul` → judul film
  * `private String sutradara` → sutradara film
  * `private double rating` → rating film

* **Constructor:**

  ```java
  public Film(String judul, String sutradara, double rating)
  ```

  digunakan untuk menginisialisasi objek film dengan data lengkap.

* **Getter & Setter:**
  Digunakan untuk mengakses (getter) dan mengubah (setter) nilai atribut dengan prinsip enkapsulasi.

---

### 2. `model.Reviewer.java`

**Tujuan:** Merepresentasikan entitas reviewer/pengulas film.

<img width="925" height="840" alt="Image" src="https://github.com/user-attachments/assets/cc5c9e9e-2958-4338-8864-23f8e7c0dc6c" />

* **Properties:**

  * `private String nama` → nama reviewer
  * `private String email` → email reviewer

* **Constructor:**

  ```java
  public Reviewer(String nama, String email)
  ```

* **Getter & Setter:**
  Digunakan untuk mengatur dan mengambil data reviewer.
  (Opsional: bisa dikembangkan untuk menghubungkan reviewer dengan film yang direview.)

---

### 3. `service.FilmService.java`

**Tujuan:** Menyediakan logika CRUD untuk objek `Film`.

<img width="1413" height="649" alt="Image" src="https://github.com/user-attachments/assets/f5fca0f5-6705-4923-abb5-ae3fd373f442" />

<img width="804" height="637" alt="Image" src="https://github.com/user-attachments/assets/61d36cbd-8cc5-41ba-86d9-57f279fd87f6" />

<img width="635" height="219" alt="Image" src="https://github.com/user-attachments/assets/8377ae69-f602-45f5-b100-60ddab782ab8" />

* **Properties:**

  * `private ArrayList<Film> daftarFilm` → menyimpan daftar film

* **Method utama:**

  * `tambahFilm(Film film)` → menambah film ke daftar
  * `tampilkanFilm()` → menampilkan semua film
  * `updateFilm(String judul, double ratingBaru)` → update rating film berdasarkan judul
  * `hapusFilm(String judul)` → menghapus film berdasarkan judul
  * `cariFilm(String judul)` → mencari film berdasarkan judul (fitur **Search**)

---

### 4. `main.Main.java`

**Tujuan:** Entry point program yang menampilkan menu interaktif.

<img width="863" height="786" alt="Image" src="https://github.com/user-attachments/assets/4160b27d-91d2-4ef1-a7db-b85ccd059bdb" />

<img width="863" height="786" alt="Image" src="https://github.com/user-attachments/assets/ab30dd70-79f5-4a4c-b1c3-166ab7b8853f" />

<img width="889" height="699" alt="Image" src="https://github.com/user-attachments/assets/b9d0846b-3ce5-4d74-a2ea-8d084f9f4d87" />

* Menggunakan **Scanner** untuk input user

* Menyediakan menu pilihan:

  1. Tambah Film
  2. Tampilkan Film
  3. Update Film
  4. Hapus Film
  5. Cari Film
  6. Keluar

* Menggunakan **perulangan `do-while`** agar program berjalan terus sampai user memilih keluar.

* Menyediakan **validasi input** agar nilai rating yang dimasukkan berada pada rentang `0.0 – 10.0`.

---

## 🧩 Penerapan MVC

1. **Model (Data Layer)** → `Film.java`, `Reviewer.java`

   * Menyimpan struktur data dan constructor.
   * Mewakili entitas nyata di sistem (film & reviewer).

2. **Service (Business Logic Layer)** → `FilmService.java`

   * Berisi logika CRUD untuk memanipulasi data.
   * Terpisah dari Main agar kode lebih rapi dan terstruktur.

3. **Main (Controller / View Layer)** → `Main.java`

   * Menjadi antarmuka pengguna (menu CLI).
   * Menghubungkan input user dengan logika dari `FilmService`.

Dengan struktur ini, program lebih modular, mudah dipahami, dan lebih gampang dikembangkan ke depannya.

---

## ✅ Penerapan Validasi Input

Validasi ada di `Main.java` saat user memasukkan rating film:

```java
double rating;
do {
    System.out.print("Masukkan rating film (0.0 - 10.0): ");
    rating = input.nextDouble();
    if (rating < 0.0 || rating > 10.0) {
        System.out.println("Rating harus antara 0.0 hingga 10.0!");
    }
} while (rating < 0.0 || rating > 10.0);
```

🔹 Program hanya menerima nilai antara **0.0 sampai 10.0**, jika tidak, user diminta input ulang.

---

## 🔍 Penerapan Fitur Search

Search diimplementasikan di `FilmService.java` melalui method:

```java
public Film cariFilm(String judul) {
    for (Film f : daftarFilm) {
        if (f.getJudul().equalsIgnoreCase(judul)) {
            return f;
        }
    }
    return null;
}
```

Lalu dipanggil di `Main.java` saat user memilih menu **5. Cari Film**.
Jika ditemukan → tampil detail film.
Jika tidak ditemukan → muncul pesan *"Film tidak ditemukan."*

---

## ✅ Penerapan Dalam Output

<img width="436" height="540" alt="Image" src="https://github.com/user-attachments/assets/2c2fdbe2-3f13-49e3-a896-426b9ef9aa45" />

<img width="422" height="259" alt="Image" src="https://github.com/user-attachments/assets/27be75f3-faed-4260-8429-caed45e22182" />

<img width="532" height="304" alt="Image" src="https://github.com/user-attachments/assets/008f3adb-2f4c-48d2-abec-860af54b2563" />

<img width="399" height="322" alt="Image" src="https://github.com/user-attachments/assets/cd7bd876-8427-4405-9201-e13a549f920e" />

<img width="449" height="260" alt="Image" src="https://github.com/user-attachments/assets/f391cfbe-844b-4853-b925-d31f211b3003" />

<img width="337" height="553" alt="Image" src="https://github.com/user-attachments/assets/4cd55246-e340-4182-88d3-3ff357ab4d4a" />

<img width="585" height="578" alt="Image" src="https://github.com/user-attachments/assets/937a0fda-8f1a-42b3-bbe1-8dd42b49b80d" />

---

## 🎯 Alur Program

1. Program dimulai dengan menampilkan menu utama.
2. User memilih menu (1–6).
3. Setiap pilihan menu akan menjalankan method di `FilmService`.

   * Tambah Film → membuat objek `Film` baru, dimasukkan ke `ArrayList`.
   * Tampilkan Film → mencetak seluruh isi `ArrayList`.
   * Update Film → mencari film berdasarkan judul, lalu mengubah rating.
   * Hapus Film → menghapus film berdasarkan judul.
   * Cari Film → menampilkan detail film tertentu berdasarkan input judul.
4. Program terus berjalan hingga user memilih menu keluar (6).

---
