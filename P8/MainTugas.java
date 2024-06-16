// Kelas induk HewanPeliharaan
class HewanPeliharaan {
    // Metode suara yang akan di-override oleh subclass
    void suara() {
        System.out.println("Hewan ini membuat suara.");
    }
}

// Kelas Kucing yang mewarisi dari HewanPeliharaan
class Kucing extends HewanPeliharaan {
    @Override
    void suara() {
        System.out.println("Meong!");
    }
}

// Kelas Hamster yang mewarisi dari HewanPeliharaan
class Hamster extends HewanPeliharaan {
    @Override
    void suara() {
        System.out.println("Cik cik!");
    }
}

// Kelas Burung yang mewarisi dari HewanPeliharaan
class Burung extends HewanPeliharaan {
    @Override
    void suara() {
        System.out.println("Cuit cuit!");
    }
}

public class MainTugas {
    public static void main(String[] args) {
        HewanPeliharaan kucing = new Kucing();
        HewanPeliharaan hamster = new Hamster();
        HewanPeliharaan burung = new Burung();

        // Memanggil metode suara untuk setiap objek
        System.out.print("Suara kucing = ");
        kucing.suara();

        System.out.print("Suara hamster = ");
        hamster.suara();

        System.out.print("Suara burung = ");
        burung.suara();
    }
}
