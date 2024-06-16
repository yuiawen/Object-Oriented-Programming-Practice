// public class Komputer {
// // Atribut
// private String merk;
// private String processor;
// private int ram;
// private int storage;

// // Konstruktor
// public Komputer(String merk, String processor, int ram, int storage) {
// this.merk = merk;
// this.processor = processor;
// this.ram = ram;
// this.storage = storage;
// }

// // Method untuk menampilkan spesifikasi komputer
// public void tampilkanSpesifikasi() {
// System.out.println("Merk: " + merk);
// System.out.println("Processor: " + processor);
// System.out.println("RAM: " + ram + " GB");
// System.out.println("Storage: " + storage + " GB");
// }

// public static void main(String[] args) {
// Komputer komputerSaya = new Komputer("Lenovo", "Intel Core i7", 16, 512);

// komputerSaya.tampilkanSpesifikasi();
// }
// }

/*
 * public class Komputer {
 * // Atribut
 * private String merk;
 * private String processor;
 * private int ram;
 * private int storage;
 * 
 * // Konstruktor pertama dengan parameter
 * public Komputer(String merk, String processor, int ram, int storage) {
 * this.merk = merk;
 * this.processor = processor;
 * this.ram = ram;
 * this.storage = storage;
 * }
 * 
 * // Konstruktor kedua tanpa parameter
 * public Komputer() {
 * // Inisialisasi dengan nilai default
 * this.merk = "Unknown";
 * this.processor = "Unknown";
 * this.ram = 0;
 * this.storage = 0;
 * }
 * 
 * // Method untuk menampilkan spesifikasi komputer
 * public void tampilkanSpesifikasi() {
 * System.out.println("Merk: " + merk);
 * System.out.println("Processor: " + processor);
 * System.out.println("RAM: " + ram + " GB");
 * System.out.println("Storage: " + storage + " GB");
 * }
 * 
 * // Main method untuk demonstrasi
 * public static void main(String[] args) {
 * // Membuat objek Komputer dengan konstruktor pertama
 * Komputer komputerSaya = new Komputer("Lenovo", "Intel Core i7", 16, 512);
 * komputerSaya.tampilkanSpesifikasi();
 * 
 * // Membuat objek Komputer dengan konstruktor kedua
 * Komputer komputerDefault = new Komputer();
 * komputerDefault.tampilkanSpesifikasi();
 * }
 * }
 * 
 */

// public class Komputer {
// private String merek;
// private int ram;

// // Konstruktor pertama tanpa parameter
// public Komputer() {
// merek = "Tidak Diketahui";
// ram = 2;
// }

// // Konstruktor kedua dengan parameter merek dan ram
// public Komputer(String merek, int ram) {
// this.merek = merek;
// this.ram = ram;
// }

// // Method untuk menampilkan informasi komputer
// public String cekInfo() {
// return "Merek : " + merek + ", RAM : " + ram + "GB";
// }

// public static void main(String[] args) {
// // Membuat objek menggunakan konstruktor tanpa parameter
// Komputer komputer1 = new Komputer();
// System.out.println("Informasi Komputer 1. " + komputer1.cekInfo());
// // Membuat objek menggunakan konstruktor dengan parameter
// Komputer komputer2 = new Komputer("Lenovo", 8);
// System.out.println("Informasi Komputer 2." + komputer2.cekInfo());
// }
// }

public class Komputer {
    private String merk;
    private String processor;
    private int ram;
    private int storage;

    // Konstruktor pertama tanpa parameter
    public Komputer() {
        merk = "Tidak Diketahui";
        processor = "Tidak Diketahui";
        ram = 2;
        storage = 256;
    }

    // Konstruktor kedua dengan parameter merk, processor, ram, dan storage
    public Komputer(String merk, String processor, int ram, int storage) {
        this.merk = merk;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    // Method untuk menampilkan spesifikasi komputer
    public void tampilData() {
        System.out.println();
        System.out.println("Merk: " + merk);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
    }

    public static void main(String[] args) {

        Komputer komputer1 = new Komputer();
        komputer1.tampilData();

        Komputer komputer2 = new Komputer("Lenovo", "Intel Core i7", 16, 512);
        komputer2.tampilData();
    }
}
