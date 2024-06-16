import java.util.Scanner;

public class SegitigaLat3 {
    double alas;
    double tinggi;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        tinggi = scanner.nextDouble();
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public void tampil() {
        System.out.println();
        System.out.println("Luas: " + hitungLuas());
    }

    public static void main(String[] args) {
        SegitigaLat3 segitiga2 = new SegitigaLat3();
        segitiga2.input();
        segitiga2.tampil();
    }
}
