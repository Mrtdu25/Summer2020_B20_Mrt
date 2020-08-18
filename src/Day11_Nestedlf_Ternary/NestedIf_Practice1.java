package Day11_Nestedlf_Ternary;

public class NestedIf_Practice1 {
    public static void main(String[] args) {
                /*
            precondition: minimum salary of 30k
                sub condition: minimum 2 years of job history

         */

        double minSalary=29999;
        double yearOnJob=20;
        String result="";

        if (minSalary>=30000){
            if (yearOnJob>=2){
                System.out.println("You are qualified");
            }else {
                System.out.println("You must have been on job at leat 2 years");
            }

        }else
            System.out.println("You must earn at least $30k");

        System.out.println("+++++++++++++++++++++++++++++++++++");











    }
}
