package Day14_Recap;
/*
    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry
            MUST use Scanner and nested IF
 */

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade");
        double score = scan.nextDouble();
        scan.close();

        String result = "";

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                result = "Excellent";
            } else if (score >= 80){
                result = "Great";
        } else if (score >= 70) {
                result = "Good";
        } else if (score >= 60) {
                result = "passed";
        } else
                 result = "Failed";

        }else
            System.out.println("Invalid");

        System.out.println(result);






    }
}
