package Office_Hours.Practice_07_08_2020;
import java.util.Scanner;
public class Minimum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 2147483647;

        for (int i=0; i<5; i+=1){
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if (n<min){
                min=n;
            }
        }

        System.out.println("Minimum number is: "+min);
    }
}
