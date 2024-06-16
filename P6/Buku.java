public class Buku {
    private String judul;
    private int harga;
    private int halaman;

    public Buku(String judul, int harga, int halaman) {
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    public void tampil() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Harga Buku: " + harga);
        System.out.println("Jumlah Halaman: " + halaman);
    }
}
