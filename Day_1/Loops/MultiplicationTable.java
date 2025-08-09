package Day_1.Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
         int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find it4s multiples:");
    n= sc.nextInt();
    System.out.println("Multiplication Table for " + n + ":");
    for(int i = 1; i<=10; i++){
        System.out.println(n+" x "+i+" = "+(n*i));
    }
    }
   
}
