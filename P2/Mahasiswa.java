public class Mahasiswa {
    String nama;
    String universitas;
    String jurusan;
    String nim;
    double ipk;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    public String getUniversitas() {
        return universitas;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return nim;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public double getIPK() {
        return ipk;
    }

    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Universitas: " + universitas);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Robert");
        mhs1.setUniversitas("Harvard");
        mhs1.setJurusan("Informatika");
        mhs1.setNIM("1234567890");
        mhs1.setIPK(3.85);
        mhs1.tampil();
    }
}
