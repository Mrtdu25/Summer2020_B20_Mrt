package Day09_IfStatement;

public class Minimum {
    public static void main(String[] args) {

        //write a java program that accepts three numbers and return the minimum number
        //                (assume that none of them are equal)

        double a=500;
        double b=800;
        double c=1500;

        boolean aIsMin= a<b && a<c;
        boolean bIsMin=!aIsMin && b<c;
        boolean cIsMin=!aIsMin &&!bIsMin;

        double min =0;

        if (aIsMin){
            min=a;
        }

        if (bIsMin){
          min=min;
        }

        if (cIsMin){
            min=c;

        }

        System.out.println(min+" is the minumum number");




    }
}
