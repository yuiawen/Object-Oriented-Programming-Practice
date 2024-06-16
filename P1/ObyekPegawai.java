class Pegawai {
    String nama;
    long no_hp;

    public void setPegawai(String nama, long no_hp) {
        this.nama = nama;
        this.no_hp = no_hp;
    }

    public void tampilPegawai() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Nomor Telepon Pegawai: " + no_hp);
    }
}

public class ObyekPegawai {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setPegawai("Johan", 6281380292150L);
        pegawai1.tampilPegawai();
    }
}
