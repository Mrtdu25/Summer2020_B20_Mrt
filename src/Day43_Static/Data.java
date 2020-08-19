package Day43_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class Data {

    static int[] arr=new int[3];

    static ArrayList<Integer> list=new ArrayList();

    static {
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;                // if we don't initialize in th static blocks we wont be able to print from dif class

        list.addAll(Arrays.asList(4,5,6,7));
        System.out.println("School Name");


    }

}
