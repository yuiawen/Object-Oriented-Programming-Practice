import lat2.mengurutkanArray;
import java.util.Arrays;

public class cobaLatihan {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 9, 1, 6 };
        System.out.println("Array sebelum diurutkan: " + Arrays.toString(numbers));
        mengurutkanArray.sortIntArray(numbers);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(numbers));
    }
}
