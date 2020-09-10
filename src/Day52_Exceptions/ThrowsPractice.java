package Day52_Exceptions;

public class ThrowsPractice {
    public static void main(String[] args)throws InterruptedException {
                                         // fixed temporarily
        m1();

        m2();




    }

        public static void m1()throws InterruptedException{
            Thread.sleep(3000);
        }

    public static void m2()throws InterruptedException{
        m1();
    }

    public static void m3(){   // throw fix temporarily and Try and catch fix the issue permanently
            try {
                m2();
            }catch (Exception e){
                e.getMessage();
            }
    }

    public static void m4(){
            m3();
    }





}
