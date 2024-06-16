abstract class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    abstract void suara();
}

class Kucing extends Hewan {

    Kucing(String nama) {
        super(nama);
    }

    @Override
    void suara() {
        System.out.println(nama + " Bersuara: Meow Meow");
    }
}

class Anjing extends Hewan {

    Anjing(String nama) {
        super(nama);
    }

    @Override
    void suara() {
        System.out.println(nama + " Bersuara : Guk Guk");
    }
}

public class Lat1Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing("Kucing Persia");
        Hewan anjing = new Anjing("Anjing Bulldog");

        kucing.suara();
        anjing.suara();
    }
}
