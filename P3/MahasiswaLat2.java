public class MahasiswaLat2 {
    private String nim, nama;

    // method mutator
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // method acessor
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanData() {
        System.out.println("==Data==");
        System.out.println("Nim : " + getNim());
        System.out.println("Nama : " + getNama());
    }

    public static void main(String args[]) {
        MahasiswaLat2 obj = new MahasiswaLat2();
        obj.setNim("175410001");
        obj.setNama("Azkiya");
        obj.tampilkanData();

    }
}