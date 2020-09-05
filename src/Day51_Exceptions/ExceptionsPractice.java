package Day51_Exceptions;

public class ExceptionsPractice {
    public static void main(String[] args) {
        System.out.println("Hello");


        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){

        }
        System.out.println("World");


      try {
    Thread.sleep(3000);
       }catch (InterruptedException e){

      }
        System.out.println("How are you?");

      sleep(5);
        System.out.println("Murat");

     sleep(5);
        System.out.println("Good bye");








    }

    public static void sleep(double second){

        try {
            Thread.sleep((long)second*1000);
        }catch (InterruptedException e){

        }

    }

}
