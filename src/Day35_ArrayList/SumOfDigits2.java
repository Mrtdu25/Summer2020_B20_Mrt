package Day35_ArrayList;

public class SumOfDigits2 {
    public static void main(String[] args) {

        String str="a1b2c3";
        int sum=0;

        for (char each:str.toCharArray()){
            if (Character.isDigit(each)){
               sum+=Integer.parseInt(each+"");
            }
        }

        System.out.println(sum);

        System.out.println("========================");

        String mrt="a1b2c3g9h8t7";
        int sum2=0;

        for (char each:mrt.toCharArray()){
            if (Character.isDigit(each)){
                sum2+=Integer.parseInt(each+"");
            }
        }
        System.out.println(sum2);

         /*
Character:
    isDigit(char): verifies if the char is digit, returns boolean
    isLtter(char): verifies if the char is letter, returns boolean
     */

    }
}
