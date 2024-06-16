public class Calculation2Lat1 {
    private int a, b;
    private double c, d;
    private String s1, s2;

    void sum(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }

    void sum(double c, double d) {
        System.out.println("Sum of doubles: " + (c + d));
    }

    void sum(String s1, String s2) {
        System.out.println("Concatenation of strings: " + s1 + s2);
    }

    public static void main(String args[]) {
        Calculation2Lat1 obj = new Calculation2Lat1();
        obj.sum(10.5, 10.5);
        obj.sum(20, 20);
        obj.sum("Hello, ", "World!");
    }
}