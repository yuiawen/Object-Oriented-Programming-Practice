// import java.util.Scanner;

// abstract class BangunDatar {
//     abstract float luas();

//     abstract float keliling();
// }

// class Persegi extends BangunDatar {
//     float sisi;

//     public Persegi(float sisi) {
//         this.sisi = sisi;
//     }

//     @Override
//     float luas() {
//         return sisi * sisi;
//     }

//     @Override
//     float keliling() {
//         return 4 * sisi;
//     }
// }

// class Lingkaran extends BangunDatar {
//     float r;

//     public Lingkaran(float r) {
//         this.r = r;
//     }

//     @Override
//     float luas() {
//         return (float) (Math.PI * r * r);
//     }

//     @Override
//     float keliling() {
//         return (float) (2 * Math.PI * r);
//     }
// }

// class PersegiPanjang extends BangunDatar {
//     float panjang, lebar;

//     public PersegiPanjang(float panjang, float lebar) {
//         this.panjang = panjang;
//         this.lebar = lebar;
//     }

//     @Override
//     float luas() {
//         return panjang * lebar;
//     }

//     @Override
//     float keliling() {
//         return 2 * (panjang + lebar);
//     }
// }

// class Segitiga extends BangunDatar {
//     float alas, tinggi;

//     public Segitiga(float alas, float tinggi) {
//         this.alas = alas;
//         this.tinggi = tinggi;
//     }

//     @Override
//     float luas() {
//         return (alas * tinggi) / 2;
//     }

//     @Override
//     float keliling() {
//         // Assuming it's a right-angled triangle for simplicity
//         return alas + tinggi + (float) Math.sqrt(alas * alas + tinggi * tinggi);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Pilih jenis bangun datar:");
//         System.out.println("1. Persegi");
//         System.out.println("2. Lingkaran");
//         System.out.println("3. Persegi Panjang");
//         System.out.println("4. Segitiga");
//         System.out.print("Masukkan pilihan Anda: ");

//         int pilihan = scanner.nextInt();
//         BangunDatar bangunDatar = null;

//         switch (pilihan) {
//             case 1:
//                 System.out.print("Masukkan panjang sisi: ");
//                 float sisiPersegi = scanner.nextFloat();
//                 bangunDatar = new Persegi(sisiPersegi);
//                 break;
//             case 2:
//                 System.out.print("Masukkan jari-jari lingkaran: ");
//                 float jariJari = scanner.nextFloat();
//                 bangunDatar = new Lingkaran(jariJari);
//                 break;
//             case 3:
//                 System.out.print("Masukkan panjang: ");
//                 float panjangPersegiPanjang = scanner.nextFloat();
//                 System.out.print("Masukkan lebar: ");
//                 float lebarPersegiPanjang = scanner.nextFloat();
//                 bangunDatar = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
//                 break;
//             case 4:
//                 System.out.print("Masukkan alas: ");
//                 float alasSegitiga = scanner.nextFloat();
//                 System.out.print("Masukkan tinggi: ");
//                 float tinggiSegitiga = scanner.nextFloat();
//                 bangunDatar = new Segitiga(alasSegitiga, tinggiSegitiga);
//                 break;
//             default:
//                 System.out.println("Pilihan tidak valid!");
//                 return;
//         }

//         hitungBangunDatar(bangunDatar);

//         scanner.close();
//     }

//     private static void hitungBangunDatar(BangunDatar bangunDatar) {
//         if (bangunDatar != null) {
//             System.out.println("=== " + bangunDatar.getClass().getSimpleName() + " ===");
//             System.out.println("Luas: " + bangunDatar.luas());
//             System.out.println("Keliling: " + bangunDatar.keliling());
//         }
//     }
// }

import java.util.Scanner;

abstract class BangunDatar {
    abstract float luas();

    abstract float keliling();
}

class Persegi extends BangunDatar {
    float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    float luas() {
        return sisi * sisi;
    }

    @Override
    float keliling() {
        return 4 * sisi;
    }
}

class Lingkaran extends BangunDatar {
    float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    float luas() {
        return (float) (Math.PI * r * r);
    }

    @Override
    float keliling() {
        return (float) (2 * Math.PI * r);
    }
}

class PersegiPanjang extends BangunDatar {
    float panjang, lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    float luas() {
        return panjang * lebar;
    }

    @Override
    float keliling() {
        return 2 * (panjang + lebar);
    }
}

class Segitiga extends BangunDatar {
    float alas, tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    float luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    float keliling() {
        // Assuming it's a right-angled triangle for simplicity
        return alas + tinggi + (float) Math.sqrt(alas * alas + tinggi * tinggi);
    }
}

public class MainTugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Segitiga");
        System.out.print("Masukkan pilihan Anda: ");

        int pilihan = scanner.nextInt();
        BangunDatar bangunDatar = null;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi: ");
                float sisiPersegi = scanner.nextFloat();
                bangunDatar = new Persegi(sisiPersegi);
                break;
            case 2:
                System.out.print("Masukkan jari-jari lingkaran: ");
                float jariJari = scanner.nextFloat();
                bangunDatar = new Lingkaran(jariJari);
                break;
            case 3:
                System.out.print("Masukkan panjang: ");
                float panjangPersegiPanjang = scanner.nextFloat();
                System.out.print("Masukkan lebar: ");
                float lebarPersegiPanjang = scanner.nextFloat();
                bangunDatar = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                break;
            case 4:
                System.out.print("Masukkan alas: ");
                float alasSegitiga = scanner.nextFloat();
                System.out.print("Masukkan tinggi: ");
                float tinggiSegitiga = scanner.nextFloat();
                bangunDatar = new Segitiga(alasSegitiga, tinggiSegitiga);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                scanner.close();
                return;
        }
        System.out.println("=== " + bangunDatar.getClass().getSimpleName() + " ===");
        System.out.println("Luas: " + bangunDatar.luas());
        System.out.println("Keliling: " + bangunDatar.keliling());

        scanner.close();
    }
}
