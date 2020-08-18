package Day11_Nestedlf_Ternary;

public class Ternary {
    public static void main(String[] args) {

        int num=99;
        String result="";

        if(num%2==0){
            result="even";
        }else
            result="odd";
        System.out.println(result);

        System.out.println("=============================");
        String R1=(num%2==0) ? "even" : "odd";
        System.out.println(R1);

        System.out.println("======================");

        int num1=10;
        int num2=20;
        int max1=0;

        if (num1>num2){
            max1=num1;
        }else
            max1=num2;
        System.out.println(max1);

        int max2= (num1>num2) ? num1 : num2;
        System.out.println(max2);

        System.out.println("=====================================");
// first task: convert the if statements above to ternary
        int age=20;
        boolean eligible=false;

        if (age>=21){
            eligible=true;
        }else
            eligible=false;

        System.out.println(eligible);

        System.out.println("========================");

        boolean eligible2= (age>=21)? true :false;
        System.out.println(eligible2);



    }
}
