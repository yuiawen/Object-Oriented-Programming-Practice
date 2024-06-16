// class Hewan {
//    public void move() {
//       System.out.println("Hewan dapat move");
//    }
// }

// class Kucing extends Hewan {
//    public void move() {
//       System.out.println("Kucing dapat walk dan run");
//    }

//    public void Meong() {
//       System.out.println("Kucing dapat Meong");
//    }
// }

// public class TestKucing2 {
//    public static void main(String args[]) {
//       Hewan a = new Hewan();
//       Kucing b = new Kucing();

//       a.move();
//       b.move();
//       b.Meong();
//    }
// }

class Hewan {
   public void move() {
      System.out.println("Hewans dapat move");
   }
}

class Kucing extends Hewan {
   public void move() {
      System.out.println("Kucings dapat walk dan run");
   }

   public void Meong() {
      System.out.println("Kucings dapat Meong");
   }
}

public class TestKucing2 {
   public static void main(String args[]) {
      Hewan a = new Hewan();
      Kucing b = new Kucing();
      a.move();
      b.move();
      b.Meong();
   }
}