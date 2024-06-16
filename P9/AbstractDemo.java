// public class AbstractDemo {
//     public static void main(String[] args) {
//         Karyawan e = new Karyawan("George W.", "Houston, TX", 43);

//         System.out.println("\n Panggil mailCheck pakai Karyawan");
//         e.mailCheck();
//     }
// }

// 2 //
public class AbstractDemo {
    public static void main(String[] args) {
        Gaji s = new Gaji("Mohd Mohtashim", "Ambehta, UP", 3,
                3600.00);
        Karyawan e = new Gaji("John Adams", "Boston, MA", 2,
                2400.00);

        System.out.println("Panggil mailCheck pakai Gaji");
        s.mailCheck();

        System.out.println("\n Panggil mailCheck pakai Karyawan");
        e.mailCheck();
    }
}