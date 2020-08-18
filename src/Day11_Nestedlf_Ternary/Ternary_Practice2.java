package Day11_Nestedlf_Ternary;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        int num = 100;
        String result = "";
//if
        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }

        System.out.println(result);

        //ternary
       String result2=(num > 0)? "Positive":(num < 0)?"Negative" :"Zero";
        System.out.println(result2);


        System.out.println("==========================");

        /*
     write a program that can compare two number
                a = 10, b= 20
               output:  b is greater
               a = 30, b = 10;
               output: a is greater
               a = 20; b= 20;
               output: a is equal to b
       */
//1
     int a=10;
     int b=20;
     String R1= (a>b)? "a is greater" :(b>a)?"b is greater" :"a is equal to b ";
        System.out.println(R1);

//2
        int A=30;
        int B=10;
        String R2=(A>B)? "A is greater" :(A>B)? "B is greater":"a is equal to b ";
        System.out.println(R2);

//3
        int A1=20;
        int B1=20;
        String r3=(A1>B1)?"A1 is greater" : (A1<B1)? " B1 is greater": "A1 Equal to B1";
        System.out.println(r3);




    }
}
