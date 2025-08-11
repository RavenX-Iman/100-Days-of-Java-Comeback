package Day_2.Overloading;

import java.util.Arrays;

public class PrintUtility {
    public void print(int num) {
        System.out.println(num);
    }
    public void print(String str) {
        System.out.println(str);
    }
    public void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public void print(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        PrintUtility printer = new PrintUtility();

        printer.print(42); // int
        printer.print("Hello World"); // String
        printer.print(new int[]{1, 2, 3, 4}); // int array
        printer.print("Repeat this!", 3); // String repeated
    }
}
