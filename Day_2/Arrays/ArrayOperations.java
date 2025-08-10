package Day_2.Arrays;

import java.util.Scanner;

public class ArrayOperations {
    public void number_exists(int[] a, int n){
        boolean flag = false;
        for(int i=0; i<a.length;i++){
            if(a[i]==n){
                flag= true;
                break;
            }
        }
        if (flag) {
            System.out.println("Number " + n + " exists in the array.");
        } else {
            System.out.println("Number " + n + " does NOT exist in the array.");
        }
        
    }
    public void reverse_array(int[] a){
            int[] reverse= new int[10];
            System.out.println("The reversed array is:");
            for (int i = 0; i < reverse.length; i++) {
                reverse[i]=a[a.length -1 -i];
                System.out.print(reverse[i]);
                }
    }

            
    public static void main(String[] args) {
        ArrayOperations a1 = new ArrayOperations();
        int[] arr = new int[10];
        int a;
        Scanner d = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for(int i= 0;i<arr.length;i++){
            arr[i]=d.nextInt();
        }
        System.out.println("Enter a number you want to find:");
        a= d.nextInt();
        a1.number_exists(arr,a);
        System.out.print("Original array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        a1.reverse_array(arr);
        
    }
}
