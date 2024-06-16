class Handphone {
    String brand;
    String os;
    int ram;
    Long harga;

    public void setHandphone(String brand, String os, int ram, long harga) {
        this.brand = brand;
        this.os = os;
        this.ram = ram;
        this.harga = harga;
    }

    public void TampilHandphone() {
        System.out.println("Nama Handphone : " + brand);
        System.out.println("Sistem Operasi : " + os);
        System.out.println("RAM : " + ram + " GB");
        System.out.println("Harga : Rp" + harga);
    }
}

public class ObyekHandphone {
    public static void main(String[] args) {
        Handphone handphone1 = new Handphone();
        handphone1.setHandphone("Samsung S24", "Android", 16, 14999999L);
        handphone1.TampilHandphone();
    }
}
