package Day09_IfStatement;

public class Practice {
    public static void main(String[] args) {

        /*TASK 1
        Task01:
     write a program that can check if number is positive negative or equals to zero.
        for example:
            num  = 1
            prints:
                1 is positive number
            num = -6
            print:
                6 is negative number
            num = 0
            print:
                zero

         */
        int num1=1;
        boolean Positive= num1>0;
        int num2=-6;
        boolean Negatif=num2 <0;
        int num3=0;
        boolean Zero=num3==0;

        if (Positive) {
            System.out.println("1 is positive number");
        }
        if (Negatif) {
            System.out.println("-6 is negative number");
        }

        if (Zero) {
            System.out.println("Zero");
        }

        System.out.println("================================");

        /*TASK-2
            write a program that can calculate the grade.
        1. if grade is bigger then 90 output "Excellent"
        2. if the grade is bigger then 70 and smaller then 90 output "Good"
        3. if grade is bigger then 60 and smaller then 70 output "Pass"
        4. if grade is smaller then 60 output "Fail"
        ex: score = 75
            output:
                Good
        HINT: you will need && logic

         */

        int Num =75;
        boolean Excellent= Num >90;
        boolean Good=Num >70 && Num<90;
        boolean Pass= Num >60 && Num <70;
        boolean Fail=Num < 60;
        if (Good){
            System.out.println("Good");
        }

        System.out.println("===============================");

        /* TASK-3
     Task03:
    Write a program that can calcuate the grade based on the score
        if score is between 90 to 100 ==> A
        if score is between 80 to 90 ==> B
        if score is between 70 to 80 ==> C
        if score is between 60 to 70 ==> D
        if score is below 60 ==> F
        Ex: score = 85;
            output:
                Your grade is B
      */

        int score=85;

        boolean A= score >90 && score <=100;
        boolean B= score >80 && score <=90;
        boolean C= score >70 && score <=80;
        boolean D= score >60 && score <=70;
        boolean F= score ==60;
        if (B){
            System.out.println("Your grade is B");

        }
        System.out.println("==============================================");




    }
}
