public class ObyekBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku("PBO", 75000, 200);

        System.out.println("Informasi buku awal:");
        buku1.tampil();

        buku1.setJudul("Pemrograman Java Lanjutan");
        buku1.setHarga(80000);
        buku1.setHalaman(250);

        System.out.println("\nInformasi buku setelah perubahan:");
        buku1.tampil();
    }
}