package Day11_Nestedlf_Ternary;
/*
warmup task:
    1. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".


 */

public class NumberToWords {
    public static void main(String[] args) {

        int num=7;

        String words="";

        if (num==1){
            words= "One";
        }else if (num==2){
            words="Two";
        }else if (num==3){
            words="Three";
        }else if (num==4){
            words="Four";
        }else if (num==5){
            words="Five";
        }else if (num==6){
            words="Six";
        }else if (num==7){
            words="Seven";
        }else if (num==8){
            words="Eight";
        }else if (num==9){
            words="Nine";
        }else if (num==0){
            words="Zero";
        }else
            words="Invalid";


        System.out.println(words);











    }
}
