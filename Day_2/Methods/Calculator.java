package Day_2.Methods;

import java.util.Scanner;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
         if (b==0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }else{
        return a/b;
    }
    }
    public double add(double a, double b){
        return a+b;
    }
    public double subtract(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        if (b==0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }else{
        return a/b;
    }
    }
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Scanner w = new Scanner(System.in);
        System.out.println("Enter 2 numbers to perform calculations:");
        System.out.println("Enter first number:");
        String input1 = w.next();
        System.out.println("Enter second number:");
        String input2 = w.next();

        boolean isDouble = (input1.contains(".") || input2.contains("."));

        System.out.println("Choose operation: ");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        int choice = w.nextInt();

        if (isDouble) {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);
            switch (choice) {
                case 1:
                 System.out.println("Result: " + c1.add(num1, num2)); 
                 break;
                case 2:
                 System.out.println("Result: " + c1.subtract(num1, num2));
                 break;
                case 3:
                 System.out.println("Result: " + c1.multiply(num1, num2)); 
                 break;
                case 4: 
                System.out.println("Result: " + c1.divide(num1, num2)); 
                break;
                default: 
                System.out.println("Invalid choice");
            }
        } else {
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);
            switch (choice) {
                case 1:
                 System.out.println("Result: " + c1.add(num1, num2)); 
                 break;
                case 2: 
                System.out.println("Result: " + c1.subtract(num1, num2)); 
                break;
                case 3:
                 System.out.println("Result: " + c1.multiply(num1, num2));
                  break;
                case 4: 
                System.out.println("Result: " + c1.divide(num1, num2));
                 break;
                default:
                 System.out.println("Invalid choice");
            }
        }

        w.close();
        
    }
    
}
