public class AbstractHewan {
    public static void main(String[] args) {

        Kucing kucing = new Kucing("Haruki", "Jalan Kucing No. 8", 123, "Anggora");

        System.out.println("Panggil method tidur pada kucing");
        kucing.tidur();

        System.out.println("\nPanggil method makan pada kucing");
        kucing.makan();

        System.out.println("\nPanggil method getInfo pada kucing");
        kucing.getInfo();

        System.out.println("\nPanggil method aktivitas pada kucing");
        kucing.aktivitas();
    }
}

// Error //
// public class AbstractHewan {
// public static void main(String[] args) {
// Hewan hewan = new Hewan("Fluffy", "Jalan Hewan No. 1", 123);

// System.out.println("\nPanggil method getInfo pada hewan");
// hewan.getInfo();
// }
// }