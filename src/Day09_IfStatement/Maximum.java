package Day09_IfStatement;
/*write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)

 */

public class Maximum {
    public static void main(String[] args) {

    double a=500;
    double b=200;
    double c=3000;

    boolean aIsMax= a>b && a>c; //true && true ==> true
    boolean bIsMax=b>a && b>c;// false && false==>false
    boolean cIsMax=c>a &&c>b;// false && false==>false

       double max=0; // we want to assign to max number

     if (aIsMax){

         //System.out.println(a+" is the maximum number");
         max=a;
     }

     if (bIsMax){
         //System.out.println(b+" ");
         max=b;
     }

     if (cIsMax){

        // System.out.println(c+" ");
         max=c;
     }

        System.out.println(max+" is the maximum number");




    }
}
