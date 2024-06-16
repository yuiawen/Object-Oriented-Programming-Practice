public abstract class Hewan {
    private String nama;
    private String alamat;
    private int nomor;

    public Hewan(String nama, String alamat, int nomor) {
        System.out.println("Membangun Hewan");
        this.nama = nama;
        this.alamat = alamat;
        this.nomor = nomor;
    }

    public abstract void tidur();

    public abstract void makan();

    public abstract void bergerak();

    public abstract void berkembangBiak();

    public abstract void bersuara();

    public abstract void getInfo();

    public abstract void aktivitas();

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamatBaru) {
        alamat = alamatBaru;
    }

    public int getNomor() {
        return nomor;
    }
}