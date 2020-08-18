package Day21_Loops;
// 1. write a program that asks user to enter 5 numbers and returns the maximum number
import java.util.Scanner;
public class MaxNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int max =-2147483648;
        for (int i=10; i<=50; i+=10){
            System.out.println("Enter a number");
            int num= scan.nextInt();

            if (num>max){
                max=num;
            }
            System.out.println("Maxnumber: "+max);

        }





    }
}
