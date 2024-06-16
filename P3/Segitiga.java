import java.util.Scanner;

public class Segitiga {
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

    public double hitungKeliling() {
        return alas + alas + alas;
    }

    public void tampil() {
        System.out.println();
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());

    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        segitiga.input();
        segitiga.tampil();
    }
}

// import java.util.Scanner;

// public class Segitiga {
// double alas;
// double tinggi;

// public void setAlas(double alas) {
// this.alas = alas;
// }

// public double getAlas() {
// return alas;
// }

// public void setTinggi(double tinggi) {
// this.tinggi = tinggi;
// }

// public double getTinggi() {
// return tinggi;
// }

// public void input() {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Masukkan alas: ");
// alas = scanner.nextDouble();
// System.out.print("Masukkan tinggi: ");
// tinggi = scanner.nextDouble();
// }

// public double hitung() {
// return 0.5 * alas * tinggi;
// }

// public void tampil() {
// System.out.println("Alas: " + alas);
// System.out.println("Tinggi: " + tinggi);
// System.out.println("Luas: " + hitung());
// }
// }

// class HitungSegitiga {
// public static void main(String[] args) {
// Segitiga segitiga = new Segitiga();
// segitiga.input();
// segitiga.tampil();
// }
// }
