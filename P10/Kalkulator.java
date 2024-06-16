public class Kalkulator {

    public int hitung(int a, int b) {
        return a + b;
    }

    public int hitung(int a, int b, char operasi) {
        if (operasi == '-') {
            return a - b;
        } else if (operasi == '*') {
            return a * b;
        }
        return 0;
    }

    public double hitung(double a, double b) {
        return a + b;
    }

    public double hitung(double a, double b, char operasi) {
        if (operasi == '-') {
            return a - b;
        } else if (operasi == '*') {
            return a * b;
        }
        return 0.0;
    }
}

class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        int hasilIntPenjumlahan = kalkulator.hitung(8, 3);
        int hasilIntPengurangan = kalkulator.hitung(8, 3, '-');
        int hasilIntPerkalian = kalkulator.hitung(8, 3, '*');

        double hasilDoublePenjumlahan = kalkulator.hitung(9.5, 3.4);
        double hasilDoublePengurangan = kalkulator.hitung(9.5, 3.4, '-');
        double hasilDoublePerkalian = kalkulator.hitung(9.5, 3.4, '*');

        System.out.println("Penjumlahan bilangan bulat: " + hasilIntPenjumlahan);
        System.out.println("Pengurangan bilangan bulat: " + hasilIntPengurangan);
        System.out.println("Perkalian bilangan bulat: " + hasilIntPerkalian);
        System.out.println("Penjumlahan bilangan desimal: " + hasilDoublePenjumlahan);
        System.out.println("Pengurangan bilangan desimal: " + hasilDoublePengurangan);
        System.out.println("Perkalian bilangan desimal: " + hasilDoublePerkalian);
    }
}
