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

## TP8 – AP10: Character Manager Sprint #3

**Nama:** Sola Vide Br Surbakti  
**NIM:** 253303621205  
**Program Studi:** Sistem Informasi  

### 1. Deskripsi Tugas

Pada TP8 ini, proyek Character Manager dikembangkan dengan menambahkan tampilan GUI (Graphical User Interface) menggunakan Java Swing. Program menampilkan daftar karakter secara dinamis dan menghitung rata-rata level karakter.

### 2. Fitur yang Dibuat

- Menampilkan daftar karakter menggunakan `JFrame` dan `JPanel`.
- Menampilkan data karakter secara dinamis menggunakan perulangan.
- Menampilkan nama, tipe, level, HP, dan Attack Power.
- Menghitung dan menampilkan rata-rata level karakter.
- Menggunakan `SwingUtilities.invokeLater()` untuk menjalankan GUI pada Event Dispatch Thread.
- Memisahkan Model dan View sesuai konsep MVC.

### 3. Karakter yang Ditambahkan

| Bagian | Sebelum TP8 | Sesudah TP8 |
| --- | --- | --- |
| Tampilan | Console | GUI Swing |
| Jumlah karakter | 3 | 5 |
| Tampilan data | Teks console | JLabel |
| Statistik | Console | Rata-rata level |

**Jumlah karakter:** 5  
**Rata-rata level:** 5.0

### 4. Screenshot Program

### Screenshot Sebelum TP8

Tambahkan screenshot `![alt text](image-1.png)` di bagian ini.

### Screenshot Sesudah TP8

Tambahkan screenshot `![alt text](image.png)` di bagian ini.

### 5. Alur Program dan Konsep MVC

Program dimulai dari `Main.java` yang membuat objek `CharacterManager` dan menambahkan data karakter. Selanjutnya, `CharacterManager` mengelola data karakter dan menyediakan daftar karakter serta rata-rata level. Data tersebut kemudian dikirim ke `MainWindow` untuk ditampilkan menggunakan Java Swing. Dengan demikian, Model bertugas mengelola data, sedangkan View bertugas menampilkan data kepada pengguna.

### 6. Google Docs

Link dokumentasi analisis TP8:

**[https://docs.google.com/document/d/1ct5SbuOqSsYrn_hertWTJ1UMrrBfuYeYlrg1OF0CHOM/edit?usp=sharing]**

---

## TP10 AP13 – Character Manager Sprint #4

## Theming, Properti Komponen & Analisis MVC

**Nama:** Sola Vide Br Surbakti  
**NIM:** 253303621205  

## 1. Deskripsi Pengembangan

Pada TP10 AP13, proyek Character Manager dikembangkan dengan menambahkan pengaturan tema atau *theming* menggunakan Java Swing.

Pengembangan ini bertujuan membuat tampilan aplikasi lebih menarik, rapi, dan konsisten. Pengaturan warna, font, dan border dipisahkan ke dalam class `AppTheme`, sedangkan class `MainWindow` bertugas menerapkan pengaturan tersebut pada komponen GUI.

Tugas ini merupakan lanjutan dari pengembangan Character Manager pada tugas sebelumnya.

## 2. Fitur yang Ditambahkan

Beberapa fitur yang dikembangkan pada tugas ini adalah:

1. **AppTheme:** Mengatur warna, font, dan border aplikasi secara terpusat.
2. **Role-Based Color:** Setiap karakter memiliki warna kartu berdasarkan role.
3. **High Level Highlight:** Karakter dengan level minimal 5 mendapatkan teks berwarna emas dan tebal.
4. **Tooltip:** Menampilkan informasi tambahan karakter ketika kursor diarahkan ke kartu.
5. **Cursor:** Mengubah bentuk kursor menjadi tangan ketika diarahkan ke kartu karakter.
6. **Pengaturan Ukuran Window:** Menggunakan `pack()` dan `setMinimumSize()` agar ukuran jendela menyesuaikan isi aplikasi.

## 3. Implementasi AppTheme

Class `AppTheme` dibuat pada package:

`com.unpri.charactermanager.view`

Class ini berfungsi sebagai pusat pengaturan tampilan aplikasi.

### A. Pengaturan Warna

| Komponen | Warna |
| --- | --- |
| Background utama | Gelap (#13131f) |
| Teks utama | Abu-abu terang (#dfe6e9) |
| Teks putih | Putih (#FFFFFF) |
| Highlight level tinggi | Emas (#fdcb6e) |
| Warrior | Merah (#d63031) |
| Mage | Biru (#0984e3) |
| Archer | Hijau (#00b894) |
| Healer | Ungu (#7950a1) |

### B. Pengaturan Font

AppTheme menyediakan tiga jenis font:

- `FONT_TITLE`: Untuk judul aplikasi.
- `FONT_BODY`: Untuk informasi karakter.
- `FONT_MONO`: Untuk informasi rata-rata level.

### C. Pengaturan Border

Terdapat dua jenis border yang digunakan:

- `CARD_BORDER`: Memberikan jarak pada bagian dalam kartu karakter.
- `MAIN_PANEL_BORDER`: Memberikan jarak pada panel utama aplikasi.

### D. Method colorFor()

Method `colorFor()` digunakan untuk menentukan warna kartu berdasarkan jenis karakter atau `CharacterType`.

Dengan method ini, setiap role memiliki warna yang berbeda sehingga pengguna lebih mudah mengenali jenis karakter.

## 4. Highlight Level Tinggi

Pada tugas ini ditambahkan konstanta `HIGH_LEVEL_THRESHOLD = 5`.

Konstanta tersebut digunakan sebagai batas untuk menentukan karakter dengan level tinggi.

Ketentuannya:

- **Level 5 atau lebih:** teks berwarna emas dan tebal.
- **Level di bawah 5:** teks berwarna putih dengan font normal.

Penggunaan konstanta membuat program lebih mudah diatur karena batas level dapat diubah dari satu tempat.

## 5. Properti Komponen Tambahan

Dua properti tambahan yang diterapkan pada komponen `JLabel` adalah:

### A. `setToolTipText()`

Properti ini digunakan untuk menampilkan informasi tambahan ketika kursor diarahkan ke kartu karakter.

Informasi yang ditampilkan berupa deskripsi role, HP, dan Attack Power.

### B. `setCursor()`

Properti ini digunakan untuk mengubah bentuk kursor menjadi tangan ketika diarahkan ke kartu karakter.

Tujuannya adalah memberikan tampilan yang lebih interaktif dan memberikan petunjuk visual kepada pengguna.

## 6. Screenshot Hasil Pengembangan

### A. Tampilan Sebelum Theming – Versi 0.3

Masukkan screenshot aplikasi sebelum menggunakan pengaturan tema AppTheme.

**Screenshot:** `![alt text](image.png)`

### B. Tampilan Setelah Theming – Versi 0.4

Masukkan screenshot aplikasi setelah menerapkan pengaturan warna, font, border, dan highlight level tinggi.

**Screenshot:** `![alt text](image-1.png)`

## 7. Analisis MVC

Dalam pengembangan ini, pengaturan warna dan tampilan aplikasi diletakkan pada package `view`, bukan pada package `model`.

Hal tersebut dilakukan karena warna dan font merupakan bagian dari tampilan aplikasi, sedangkan Model bertugas mengelola data karakter seperti nama, role, level, HP, dan Attack Power.

Jika pengaturan tampilan dimasukkan ke dalam Model, beberapa masalah dapat muncul:

1. Model menjadi bergantung pada komponen tampilan sehingga pemisahan tanggung jawab tidak berjalan dengan baik.
2. Perubahan desain aplikasi dapat mengharuskan perubahan pada class Model.
3. Kode menjadi lebih sulit dipelihara dan dikembangkan.

Dengan memisahkan pengaturan tema ke dalam `AppTheme`, struktur program menjadi lebih rapi dan sesuai dengan prinsip MVC.

## 8. Kesimpulan

Melalui TP10 AP13, aplikasi Character Manager dikembangkan dengan menerapkan pengaturan tema menggunakan class `AppTheme`.

Penggunaan pengaturan warna, font, dan border secara terpusat membuat tampilan aplikasi lebih konsisten. Penambahan warna berdasarkan role, highlight level tinggi, tooltip, dan perubahan cursor juga membuat aplikasi lebih informatif dan interaktif.

Dari tugas ini, saya memahami pentingnya pemisahan tanggung jawab antara Model dan View serta cara mengatur tampilan komponen menggunakan Java Swing.

## 9. Dokumentasi Google Docs

**Link Google Docs Analisis TP10 AP13:**

[https://docs.google.com/document/d/1f0AGbX5CmvIExIArvPiFdHsDTVPT0gQypivJVb7lwlg/edit?usp=sharing]

## 10. Repository GitHub

**Link Repository:**

[https://github.com/solavide05/JavaVisual_253303621205_SolaVideBrSurbakti.git]

---
TP12 – Character Manager Sprint #5

Layout, UI Responsif & Analisis MVC

Mata Kuliah: Java Visual
Nama: Sola Vide Br Surbakti
NIM: 253303621205

1. Deskripsi Proyek

Pada TP12/AP16, aplikasi Character Manager dikembangkan dari versi sebelumnya, yaitu v0.4 menjadi v0.5. Pengembangan ini berfokus pada pengaturan tata letak menggunakan Layout Manager pada Java Swing.

Pada versi sebelumnya, seluruh komponen ditampilkan menggunakan satu GridLayout. Pada versi terbaru, tampilan dibagi menjadi beberapa bagian agar lebih terstruktur dan mudah digunakan ketika ukuran jendela berubah.

Aplikasi ini menampilkan delapan karakter dengan role yang berbeda, yaitu Warrior, Mage, Archer, dan Healer.

### 2. Wireframe / Rancangan Tampilan

Rancangan susunan komponen aplikasi:

```text
+------------------------------------------------------+
|                    HEADER                            |
| DAFTAR KARAKTER                    Total: 8 karakter |
|------------------------------------------------------|
| PANEL STATISTIK                                      |
| Jumlah karakter | Jumlah role                        |
| Level tertinggi | Rata-rata level                    |
|------------------------------------------------------|
|                                      |               |
|              DAFTAR                  |   LEGENDA     |
|              KARAKTER                |   ROLE        |
|                                      |               |
|  Arjuna - WARRIOR                    |   WARRIOR     |
|  Merlin - MAGE                       |   MAGE        |
|  Athena - ARCHER                     |   ARCHER      |
|  Lancelot - WARRIOR                  |   HEALER      |
|  Freya - HEALER                      |               |
|  Gandalf - MAGE                      |               |
|  Robin - ARCHER                      |               |
|  Leonidas - WARRIOR                  |               |
|                                      |               |
|------------------------------------------------------|
| STATUS: 8 karakter | Siap                      v0.5 |
+------------------------------------------------------+
```

### 3. Implementasi Layout Manager

Aplikasi menggunakan beberapa Layout Manager dengan fungsi berbeda:

| Komponen | Layout Manager | Fungsi |
| --- | --- | --- |
| MainWindow | BorderLayout | Membagi tampilan utama |
| Header | BorderLayout | Mengatur judul |
| Panel Statistik | GridLayout | Menampilkan statistik |
| Daftar Karakter | GridLayout | Menyusun kartu |
| JScrollPane | JScrollPane | Menggulir daftar |
| Legenda | BoxLayout Y_AXIS | Menyusun role |
| Status Bar | BorderLayout | Menampilkan status |

### 4. Penjelasan Nested Panels

Aplikasi menggunakan beberapa panel yang disusun secara bertingkat atau nested panels. Panel utama menggunakan BorderLayout untuk mengatur header, daftar karakter, legenda, dan status bar. Di dalam header terdapat panel judul dan panel statistik yang memiliki layout masing-masing. Daftar karakter juga ditempatkan di dalam panel pembungkus sebelum dimasukkan ke JScrollPane. Susunan bertingkat ini membuat setiap bagian dapat diatur secara terpisah tanpa membuat kode tampilan menjadi berantakan.

### 5. Panel Tambahan

Panel statistik menampilkan:

- Jumlah karakter.
- Jumlah role.
- Level tertinggi.
- Rata-rata level.

GridLayout dipilih karena empat informasi statistik perlu disusun secara teratur dalam dua baris dan dua kolom. Alternatif seperti FlowLayout tidak dipilih karena susunan komponen dapat berubah mengikuti ruang yang tersedia sehingga tampilan statistik kurang konsisten.

### 6. Penggunaan JScrollPane

Daftar karakter ditempatkan di dalam JScrollPane agar pengguna tetap dapat melihat seluruh karakter meskipun ukuran jendela diperkecil.

Kartu karakter ditambahkan ke JPanel, bukan langsung ke JScrollPane. JPanel tersebut kemudian dimasukkan ke dalam JScrollPane. Cara ini memudahkan pengaturan susunan kartu dan memungkinkan pengguna menggulir daftar ketika ruang tampilan tidak mencukupi.

### 5. Pengujian Responsif

Pengujian dilakukan dengan mengubah ukuran jendela aplikasi menjadi tiga kondisi.

| Ukuran | Hasil | Keterangan |
| --- | --- | --- |
| Awal | Normal | Tampilan awal |
| Lebar | Normal | Tampilan lebih luas |
| Kecil | Scrollbar muncul | Daftar dapat digulir |

### 8. Dokumentasi Screenshot

### Screenshot 1 – Ukuran Awal

![Screenshot ukuran awal](![alt text](image.png))

### Screenshot 2 – Ukuran Lebar

![Screenshot jendela diperlebar](![alt text](image.png))

### Screenshot 3 – Ukuran Kecil

![Screenshot jendela diperkecil](![alt text](image-1.png))

### 9. Analisis MVC

Penerapan MVC tetap dipertahankan dalam proyek ini.

- **Model:** Menyimpan dan mengelola data karakter melalui Character, CharacterType, dan CharacterManager.
- **View:** Menampilkan data karakter melalui MainWindow dan mengatur tampilan menggunakan Java Swing.
- **Controller:** Main.java menjadi titik awal aplikasi yang mengambil data dari CharacterManager dan meneruskannya ke MainWindow.

Kode pengaturan tampilan ditempatkan pada package view agar Model tidak bergantung pada komponen antarmuka Java Swing.

### 10. Kesimpulan

Melalui TP12/AP16, aplikasi Character Manager berhasil dikembangkan dengan menggunakan beberapa Layout Manager. BorderLayout digunakan sebagai susunan utama, GridLayout untuk daftar karakter dan statistik, BoxLayout untuk legenda, serta JScrollPane untuk mendukung daftar yang dapat digulir.

Penggunaan layout manager membuat tampilan lebih terstruktur dan lebih mudah menyesuaikan ukuran jendela. Pemisahan Model dan View juga membantu menjaga struktur program agar lebih mudah dikembangkan.

### 11. Link Google Docs

**Dokumen Analisis TP12/AP16:**  
[https://docs.google.com/document/d/1-Ig-e7cagGknA0k38II8yDf719_S-oiAABWh1lH1Ovk/edit?usp=sharing]

---

**Repository GitHub:**  
[Repository GitHub Character Manager](https://github.com/solavide05/JavaVisual_253303621205_SolaVideBrSurbakti.git)
