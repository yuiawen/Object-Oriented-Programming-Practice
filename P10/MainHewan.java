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
        System.out.println("Meow Meow");
    }
}

class Anjing extends Hewan {

    Anjing(String nama) {
        super(nama);
    }

    @Override
    void suara() {
        System.out.println("Guk Guk");
    }
}

public class MainHewan {
    public static void main(String[] args) {
        Hewan kucing = new Kucing("Kitty");
        Hewan anjing = new Anjing("Buddy");

        kucing.suara();
        anjing.suara();
    }
}
