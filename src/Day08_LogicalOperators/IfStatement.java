package Day08_LogicalOperators;

public class IfStatement {
    public static void main(String[] args) {

        int a=20;
        int b=20;

        if(a>b ) {
            System.out.println(a + " is the maximum number");
        }

        if(b>a){
            System.out.println(b + " is the maximum number");
        }

       if(a==b){

           System.out.println(b+" Both are equal");
       }

        System.out.println("=============================");

       boolean BreakTime =true;
       if(BreakTime) {

           System.out.println("take 15 minutes break!");
       }

           if (BreakTime) {

               System.out.println("Keep studying");
           }

               System.out.println(BreakTime);
        System.out.println("==============================");

        boolean Corona=true;
        if(Corona==true){
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more hand sanitizers");
            System.out.println("Social distance");
            System.out.println("Stay at home");
        }

        System.out.println("===================================");












       }






}
