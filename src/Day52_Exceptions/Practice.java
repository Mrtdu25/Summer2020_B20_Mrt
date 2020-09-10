package Day52_Exceptions;

public class Practice {
    public static void main(String[] args) {


        try {
            System.out.println(9/0);
        }catch (java.lang.ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println();


        try {
            Thread.sleep(2);
        }catch (InterruptedException d){
            System.out.println(d.getMessage());
        }

        System.out.println("Test Completed");


    }
}
