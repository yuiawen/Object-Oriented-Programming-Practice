import java.util.Scanner;

public class MainTugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SepedaMotor sepedaMotor = new SepedaMotor();

        System.out.print("Masukkan Merk Sepeda Motor : ");
        sepedaMotor.setMerk(input.nextLine());

        System.out.print("Masukkan Warna Sepeda Motor : ");
        sepedaMotor.setWarna(input.nextLine());

        System.out.print("Masukkan Harga Sepeda Motor : ");
        sepedaMotor.setHarga(input.nextInt());
        input.nextLine();

        System.out.print("Masukkan Jenis Sepeda Motor (Matic/non matic) : ");
        sepedaMotor.setJenis(input.nextLine());

        System.out.print("Masukkan Nama Pemilik Sepeda Motor : ");
        sepedaMotor.setNamaPemilik(input.nextLine());

        System.out.println("\n## Informasi Sepeda Motor ##");
        System.out.println("================================");
        System.out.println("Merk Sepeda Motor : " + sepedaMotor.getMerk());
        System.out.println("Warna Sepeda Motor : " + sepedaMotor.getWarna());
        System.out.println("Harga Sepeda Motor : Rp " + sepedaMotor.getHarga());
        System.out.println("Jenis Sepeda Motor : " + sepedaMotor.getJenis());
        System.out.println("Nama Pemilik Sepeda Motor : " + sepedaMotor.getNamaPemilik());
    }
}
