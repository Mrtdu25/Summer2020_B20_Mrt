package Day06_ComparisonOperators;

/*task04:
            Create a class called SalaryCalculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
                ex:
                    if: rate = 55;
                        stateTaxRate = 0.04;
                        federalTaxRate =0.22;
                        weeklyHours = 40;
                    then output will be:
                            your salary is: 105600 USD
                            your total tax is: 27456 USD
                            your income after tax is: 78144 USD
 */

public class SalaryCalculator {
    public static void main(String[] args) {

    double rate=50;
    double stateTaxRate=0.04;
    double federalTaxRate=.2;
    int weeklyHour=45;

    double salary=rate *weeklyHour*52;// 52 #of week each year
    double totalTax = salary *(stateTaxRate +federalTaxRate);
    double salaryAfterTax =salary -totalTax;

        System.out.println("Salary before tax :"+"$"+salary);
        System.out.println("Totaltax : " + "$"+totalTax);
        System.out.println("Take home salary :"+"$"+salaryAfterTax);












    }




}
