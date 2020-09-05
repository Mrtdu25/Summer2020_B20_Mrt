package Day51_Exceptions;

public class ExceptionHandling2 {
    public static void main(String[] args) {

        String exceptionsMessage="";
        try {
            System.out.println(10/0);  //exception
        }catch (ArithmeticException e){
            exceptionsMessage=e.getMessage();
        }

        System.out.println(exceptionsMessage);

    }
}
