public class MainLatihan {
    public static void main(String[] args) {
        SepedaMotor sepedaMotor = new SepedaMotor();

        sepedaMotor.setMerk("Honda");
        sepedaMotor.setWarna("Merah");
        sepedaMotor.setHarga(20000000);
        sepedaMotor.setJenis("Matic");
        sepedaMotor.setNamaPemilik("Yuki");

        System.out.println("\n## Informasi Sepeda Motor ##");
        System.out.println("========================================");
        System.out.println("\nMerk Sepeda Motor : " + sepedaMotor.getMerk());
        System.out.println("Warna Sepeda Motor : " + sepedaMotor.getWarna());
        System.out.println("Harga Sepeda Motor : Rp " + sepedaMotor.getHarga());
        System.out.println("Jenis Sepeda Motor : " + sepedaMotor.getJenis());
        System.out.println("Nama Pemilik Sepeda Motor : " + sepedaMotor.getNamaPemilik());
    }
}
