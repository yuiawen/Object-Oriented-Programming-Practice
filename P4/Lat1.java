class Buku {
    String judul;
    int harga;
    int halaman;
    String pengarang;
    String penerbit;

    public Buku(String judul, int harga, int halaman, String pengarang, String penerbit) {
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }

    public void tampil() {
        System.out.println("Judulbuku :" + judul);
        System.out.println("Harga buku : " + harga);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Nama Pengarang : " + pengarang);
        System.out.println("Nama Penerbit : " + penerbit);
    }
}

public class Lat1 {
    public static void main(String[] args) {
        Buku buku1 = new Buku("PBO", 75000, 200, "Rowling", "Bloomsbury");
        buku1.tampil();
    }
}
