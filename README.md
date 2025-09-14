# Post Test PBO 2 Sistem Review Film
## Sayid Rafi A'thaya
## 2409116036
## SI Kelas A Akt 24


# 🎬 Sistem Manajemen Rating Film

<img width="1679" height="744" alt="Image" src="https://github.com/user-attachments/assets/8b6ec046-1a9b-4b53-abef-7460614d64d6" />

<img width="1678" height="723" alt="Image" src="https://github.com/user-attachments/assets/3ff644e4-4f68-478c-8c60-b1ee847da17d" />

<img width="1673" height="252" alt="Image" src="https://github.com/user-attachments/assets/f3491add-bcb7-4918-8a53-5addbae36e93" />

## 📌 Deskripsi Singkat

Program ini adalah aplikasi sederhana berbasis **Java Console** untuk mengelola data film beserta ratingnya.
Fitur utama program:

* Menambahkan film beserta ratingnya
* Menampilkan daftar semua film dan rating
* Memperbarui rating film yang sudah ada
* Keluar dari program

Program dibuat menggunakan **ArrayList**, **percabangan (switch-case)**, dan **perulangan** sesuai dengan materi **Basic Java**.

---

## 🔄 Alur Program

1. **Menu Utama**
   Saat program dijalankan, user akan melihat menu:

   ```
   === Sistem Manajemen Rating Film ===
   1. Tambah Film
   2. Tampilkan Semua Film
   3. Update Rating Film
   4. Keluar
   ```

   User memilih menu dengan memasukkan angka (1–4).

3. **Tambah Film**

   * User diminta memasukkan **judul film**.
   * User diminta memasukkan **rating film (0.0 – 10.0)** (Note: hanya bisa 0-10).
   * Data film disimpan ke dalam `ArrayList`.

     <img width="348" height="193" alt="Image" src="https://github.com/user-attachments/assets/0afa838f-40b3-462c-b40d-10cf030d4fe7" />

4. **Tampilkan Semua Film**

   * Jika belum ada data, akan muncul pesan **"Belum ada data film."**
   * Jika ada data, semua film ditampilkan dengan format:

     ```
     1. Judul Film | Rating: 8.0
     2. Judul Film Lain | Rating: 9.0
     ```
     <img width="424" height="236" alt="Image" src="https://github.com/user-attachments/assets/14985984-c8f9-4ae1-82d9-eacff42e57cc" />

5. **Update Rating Film**

   * User memasukkan **judul film** yang ingin diupdate.
   * Jika judul ditemukan, user diminta memasukkan **rating baru**, lalu data diperbarui.
   * Jika judul tidak ditemukan, muncul pesan **"Film tidak ditemukan."**
  
     <img width="428" height="171" alt="Image" src="https://github.com/user-attachments/assets/25c537c4-6c04-4653-aa52-dd15f63993bb" />

     <img width="637" height="448" alt="Image" src="https://github.com/user-attachments/assets/4cb96ec8-4ae6-4606-80c0-e04d422e5d11" />

6. **Keluar Program**

   * Program berhenti saat user memilih menu **4**.
  
     <img width="667" height="273" alt="Image" src="https://github.com/user-attachments/assets/ddfd46ca-512f-4df1-84a4-6ec1bd9e87be" />

---

## ⚙️ Teknologi yang Digunakan

* Java (Basic)
* ArrayList, Scanner, Percabangan, dan Perulangan
