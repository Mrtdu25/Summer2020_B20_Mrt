package Office_Hours.Practice_07_08_2020;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int max=-2147483648;
        int min=2147483647;

        for (int i=1; i<=5; i++){

            System.out.println("Enter a number");
            int num=scan.nextInt();

            if (num>max){
                max=num;
            }

            if (num<min){
                min=num;
            }
        }

        System.out.println("Maximum number:"+max);
        System.out.println("Minumum number:"+min);

    }
}
