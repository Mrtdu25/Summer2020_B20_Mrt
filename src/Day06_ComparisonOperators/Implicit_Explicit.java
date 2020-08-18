package Day06_ComparisonOperators;

public class Implicit_Explicit {
    public static void main(String[] args) {

        // 1-IMPLICIT CASTING

        short s1=100; // smaller primitive to larger primitive called IMPLICIT CASTING (AUTO DONE)
        long l1=s1;

        // how to do manually
        long l2 =(long)s1; // you dont have to do manually smaller primitive we can always assign to larger

        int i1 =300;   //another example
        double d1 =i1;

        System.out.println(l1);
        System.out.println(d1);

        //==================================================

        //EXPLICIT CASTING -IT IS NOT AUTOMATICALLY
        // Assigning larger to smaller- must done manually

        double num1=100.5;
        int num2=(int)num1;

        System.out.println(num2);
//exp1
       double gs1=1905.5;
       int gs2 = (int)gs1;
        System.out.println(gs2);

   //exp 2

        long fb1=4400;
        short fb2= (short)fb1;
        System.out.println(fb2);
    //exp 3

    double m1=34.5;
    float f1=(float)m1;
        System.out.println(f1);

     //exp 4
        long r1=-500;
        int p1= (int)r1;
        System.out.println(p1);




    }
}
