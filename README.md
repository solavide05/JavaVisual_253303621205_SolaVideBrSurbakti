# Character Manager — TP3 (Java Visual SIH-6406)

## Deskripsi

Character Manager adalah program sederhana berbasis Java yang digunakan untuk mengelola karakter dalam sebuah permainan. Program ini dibuat untuk menerapkan konsep Object-Oriented Programming (OOP), seperti class, object, constructor, encapsulation, dan enum.

Pada TP3 ini, program dikembangkan dengan menambahkan atribut mana dan method isAlive() untuk memeriksa apakah karakter masih hidup berdasarkan jumlah Hit Points (HP).

## Identitas Mahasiswa

- Nama: Sola Vide Br Surbakti
- NIM: 253303621205
- Program Studi: Sistem Informasi
- Fakultas: Sains dan Teknologi
- Universitas: Universitas Prima Indonesia

## Fitur Program

1. Membuat karakter menggunakan constructor.
2. Menentukan jenis karakter menggunakan enum.
3. Menghitung HP berdasarkan level.
4. Menghitung attack power berdasarkan level.
5. Menaikkan level karakter.
6. Menambahkan atribut mana.
7. Memeriksa kondisi karakter menggunakan method isAlive().

## Teknologi yang Digunakan

- Java
- JDK 17
- Visual Studio Code

## Struktur Folder

```text
CharacterManager/
├── src/
│   ├── Main.java
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               └── model/
│                   ├── Character.java
│                   └── CharacterType.java
├── README.md
└── screenshots/
```

## Cara Menjalankan Program

1. Buka folder CharacterManager di Visual Studio Code.
2. Pastikan JDK sudah terpasang.
3. Buka terminal pada folder proyek.
4. Kompilasi program menggunakan perintah javac.
5. Jalankan program menggunakan perintah java.

## Screenshot

![alt text](image.png)

## Dokumentasi Analisis

Link Google Docs: [Buka Dokumen Analisis TP3](https://docs.google.com/document/d/1Jjr5A3Dr1VPlgejzR-SG9cW_Cz2kvX7g8jsl-LsBraU/edit?usp=sharing)

## TP5/AP6 – Character Manager Sprint #2

### 1. Deskripsi

TP5/AP6 merupakan pengembangan dari proyek Character Manager pada TP3. Pada tugas ini, program dikembangkan dengan menerapkan konsep Object Reference, Encapsulation, Method Overriding, ArrayList, dan Defensive Copy.

### 2. Fitur yang Dikembangkan

Fitur utama yang ditambahkan:

- **equals()**: Membandingkan dua objek Character berdasarkan nama karakter.
- **addCharacter()**: Menambahkan karakter baru dan menolak nama duplikat.
- **findByName()**: Mencari karakter berdasarkan nama.
- **removeCharacter()**: Menghapus karakter berdasarkan nama.
- **getTotalCharacters()**: Menghitung jumlah karakter.
- **getAllCharacters()**: Mengembalikan salinan daftar karakter menggunakan Defensive Copy.
- **getAverageLevel()**: Menghitung rata-rata level karakter. Mengembalikan 0 jika daftar kosong.
- **findByType()**: Mencari karakter berdasarkan tipe karakter.

### 3. Fitur Tambahan (Mini Challenge)

Fitur tambahan yang saya buat adalah `countByType(CharacterType type)`.

Method ini digunakan untuk menghitung jumlah karakter berdasarkan tipe tertentu, seperti WARRIOR, MAGE, ARCHER, dan HEALER.

Fitur ini dibuat agar pengguna dapat mengetahui jumlah karakter dari setiap tipe dengan lebih mudah tanpa harus menghitung secara manual.

### 4. Pengujian Program

Pengujian dilakukan melalui `Main.java` dengan skenario berikut:

1. Menambahkan karakter Arjuna, Merlin, dan Athena.
2. Menguji penolakan nama karakter duplikat.
3. Mencari karakter berdasarkan nama.
4. Menghapus karakter Athena.
5. Menghitung total karakter dan rata-rata level.
6. Mencari karakter berdasarkan tipe.
7. Menguji object reference.
8. Menguji Defensive Copy.
9. Menguji method `equals()`.
10. Menguji fitur tambahan `countByType()`.

### 5. Screenshot Hasil Program

### A. Screenshot CRUD Character Manager

Menampilkan proses penambahan, pencarian, dan penghapusan karakter.

[![alt text](image.png)]

### B. Screenshot Pengujian Object Reference

Menampilkan pengujian dua variabel yang menunjuk objek yang sama dan perubahan level melalui referensi.

[![alt text](image.png)]

### 6. Dokumentasi Analisis Google Docs

Dokumen analisis TP5/AP6 berisi pembahasan mengenai:

- Object Reference dan perubahan objek.
- Perbedaan Reference dan Primitive Value.
- Penggunaan atribut Static.
- Perbandingan `equals()` dan `==`.
- Risiko mengembalikan ArrayList asli dan manfaat Defensive Copy.

**Link Google Docs:**

[https://docs.google.com/document/d/1OR8Iw0I7PfjQT95g8IR0lSJ3PPqhL6cYVMWz4BBr2Ic/edit?usp=sharing]
