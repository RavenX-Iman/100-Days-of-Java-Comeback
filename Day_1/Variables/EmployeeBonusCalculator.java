package Day_1.Variables;

import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        String name; 
        double base_salary; 
        int years_of_service;
        double bonus_percentage;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name, years of service and base salary");
        name=s.nextLine();
        years_of_service = s.nextInt();
        base_salary= s.nextDouble();
        if (years_of_service<2){
           bonus_percentage= 0.05;
        }else if (years_of_service>=2  && years_of_service<=5) {
            bonus_percentage= 0.10;
        }else{
            bonus_percentage= 0.15;
        }
         double bonus_amount= bonus_percentage*base_salary;
         double total_salary= bonus_amount+ base_salary;

        
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + base_salary);
        System.out.println("Years of Service: " + years_of_service);
        System.out.println("Bonus Percentage: " + (bonus_percentage * 100) + "%");
        System.out.println("Bonus Amount: " + bonus_amount);
        System.out.println("Total Salary: " + total_salary);
                
    }
    
}
