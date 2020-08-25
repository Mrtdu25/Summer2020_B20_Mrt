package Office_Hours.Practice_08_24_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_RecapMrt {
    /*
    Array-Fixed size not dynamic
    Collection
    Map
     */
    public static void main(String[] args) {

        int[] arr=new int[5];
        System.out.println(Arrays.toString(arr));// we get default value because its empty [0, 0, 0, 0, 0]
        arr[0]=101;
        arr[1]=202;
        arr[2]=303;
        arr[3]=404;
        arr[4]=505;
        System.out.println(Arrays.toString(arr));
        System.out.println("============================================");

        double[] mrt=new double[25];

        for (int i=0; i<25;i++){
            mrt[i]=i+1;
        }
        System.out.println(Arrays.toString(mrt));

        for (int i=0; i<=mrt.length-1; i++){
            if (mrt[i]%2==0){
                System.out.print(mrt[i]+" ");
            }

        }
        System.out.println();

        System.out.println("===================================");

        String[] dua={"Ali","Duaa","Huseyin"};
        String[] mrt2={"Ibrahim","Gulsun","Murat","Hamid"};

        String[] family=new String[dua.length+mrt2.length];

        int k=0;
        for (String A:mrt2){
            family[k]=A;
            k++;
        }

        for (String B:dua){
            family[k]=B;
            k++;
        }

        System.out.println(Arrays.toString(family));

        System.out.println("================================================");
        Scanner scan =new Scanner(System.in);


        String[] names=new String[family.length];
        for (int h=0; h<=names.length-1; h++){
            System.out.println("Enter your "+(h+1)+". name");
            names[h]=scan.next();
        }

        System.out.println(Arrays.toString(names));

        System.out.println("===================================================");



    }
}
