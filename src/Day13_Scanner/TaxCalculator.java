package Day13_Scanner;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your annual salary");
        int annualSalary= input.nextInt();

        System.out.println("Enter the state tax rate");
        double stateTaxRate= input.nextDouble();
        double stateTax= annualSalary*stateTaxRate;

        System.out.println("Enter the federal tax rate");
        double federalTaxRate= input.nextDouble();
        double federalTax= annualSalary*federalTaxRate;

       double salaryAfterTax=annualSalary-federalTax-stateTax;

        System.out.println("Your annual salary : $"+annualSalary);
        System.out.println("Your State tax$"+stateTax);
        System.out.println("Your federal tax$"+federalTax);
        System.out.println("your salary after tax $"+salaryAfterTax);






    }

}
