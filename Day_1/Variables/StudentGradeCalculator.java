package Day_1.Variables;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        int[] marks= new int[5];;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects");
        int total = 0;
        for(int i = 0; i< marks.length;i++){
            marks[i]=s.nextInt();
            total= total +marks[i];
        }
        double percentage = (total / 500.0) * 100;
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        System.out.printf("Total Marks: %d\n", total);
        System.out.printf("Percentage: %.2f%%\n", percentage);
   
        


    }
}
