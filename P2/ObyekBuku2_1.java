class Buku {
    String judul;
    int harga;
    int halaman;
    String pengarang;
    String penerbit;
    // Atribut Baru //
    int tahunTerbit;
    String ISBN;

    public void setBuku(String judul, int harga, int halaman, String pengarang, String penerbit, int tahunTerbit,
            String ISBN) {
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.ISBN = ISBN;
    }

    public void tampil() {
        System.out.println("Judul buku: " + judul);
        System.out.println("Harga buku: Rp " + harga);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Nama Pengarang: " + pengarang);
        System.out.println("Nama Penerbit: " + penerbit);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("ISBN: " + ISBN);
    }
}

public class ObyekBuku2_1 {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.setBuku("FUNICULA", 79000, 224, "Toshikazu", "Gramedia", 2021, "9786020651927");
        buku1.tampil();
    }
}
