package Day11_Nestedlf_Ternary;
/*
 // second task: "can vote" or "Cannot vote"

        // third task: write a program that can check if two numbers are equal or not.
 */

public class Ternary_Practice1 {
    public static void main(String[] args) {
// if to ternary
        int age=18;
        String citizen="USA";
        String result ="";

        if (age>=21 && citizen=="USA"){
            result="Can vote";
        }else
            result="can not vote";

        String result2=(age>=21 && citizen=="USA")? "Can vote" : "can not vote";
        System.out.println(result2);


        System.out.println("===============================");
//Ternary
        int num=25;
        int num2=36;

        String equalOrNot= num==num2?"Equal" :"Not equal";

        System.out.println(equalOrNot);


    }
}
