package Day_3.Conditionals;
import java.util.Scanner;

public class AgeCategoryClassifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = scan.nextInt();
        if (age<0) {
            System.out.println("Age cannot be negative!");
        }
        else if (age>=0 && age<13) {
            System.out.println("Child!");
            if (age>0 && age<4) {
                System.out.println("Toddler");
            }else if (age>3 && age<6) {
                System.out.println("Pre-schooler!");
            }else if (age>9 && age<13) {
                System.out.println("Pre-teen!");
            }
        }else if (age>=13 && age<20) {
            System.out.println("Teen");
        }else if (age>=20 && age<60) {
            System.out.println("Adult");
        }else if (age>=60 && age<150){
            System.out.println("Senior");
        }else{
            System.out.println("Age too big!");
        }
        scan.close();
        
    }
}
