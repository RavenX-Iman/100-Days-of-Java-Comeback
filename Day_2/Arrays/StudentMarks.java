package Day_2.Arrays;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects:");
        int[] marks= new int[5];
        for(int i=0;i<marks.length;i++){
            marks[i]=ar.nextInt();
        }
        int highest=marks[0];
        int lowest=marks[0];
        int sum=0;
        int count=0;
        for(int i=0;i<marks.length;i++){
            if (marks[i]>highest) {
                highest=marks[i];
            }
            if (marks[i]<lowest) {
                lowest= marks[i];
                
            }
            if (marks[i]<=50) {
                count++;
                
            }
            sum= sum+marks[i];
        }
        int average= sum/marks.length;
        System.out.println("Highest:"+highest);
        System.out.println("Lowest:"+lowest);
        System.out.println("Average:"+average);
        System.out.println("No. of students failed:"+count);
        


    }
    
}
