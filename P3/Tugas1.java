import java.util.Scanner;

class Pangkat {
    double bilangan;
    int pangkat;

    public void setBilangan(double bilangan) {
        this.bilangan = bilangan;
    }

    public void setPangkat(int pangkat) {
        this.pangkat = pangkat;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        bilangan = scanner.nextDouble();
        System.out.print("Masukkan pangkat: ");
        pangkat = scanner.nextInt();
    }

    public double hitungPangkat() {
        return Math.pow(bilangan, pangkat);
    }

    public void tampil() {
        System.out.println();
        System.out.println("Hasil pangkat: " + hitungPangkat());
    }
}

class Tugas1 {
    public static void main(String[] args) {
        Pangkat pangkat = new Pangkat();
        pangkat.input();
        pangkat.tampil();
    }

}
