public class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, String alamat, int nomor, String ras) {
        super(nama, alamat, nomor);
        this.ras = ras;
    }

    public void tidur() {
        System.out.println("Kucing " + getNama() + " tidur di kasurnya.");
    }

    public void makan() {
        System.out.println("Kucing " + getNama() + " sedang makan ikan.");
    }

    public void bergerak() {
        System.out.println("Kucing " + getNama() + " berjalan dengan lincah.");
    }

    public void berkembangBiak() {
        System.out.println("Kucing " + getNama() + " sedang hamil.");
    }

    public void bersuara() {
        System.out.println("Kucing " + getNama() + " mengeluarkan suara meong-meong.");
    }

    public void getInfo() {
        System.out.println(
                "Nama: " + getNama() + ", Alamat: " + getAlamat() + ", Nomor: " + getNomor()
                        + ", Ras: " + ras);
    }

    public void aktivitas() {
        System.out.println("Kucing " + getNama() + " sedang bermain bola.");
    }
}