package Day34_WrapperClasses;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        Double[] mrt=new Double[1];
        mrt[0]=1905.0;
        Long[]   mrt1=new Long[2];
        Integer[] mrt2=new Integer[3];
        Short[] mrt3=new Short[4];
        Boolean[] mrt4=new Boolean[5];
        Float[] mrt5=new Float[6];

        System.out.println(Arrays.toString(mrt));
        System.out.println(Arrays.toString(mrt1));
        System.out.println(Arrays.toString(mrt2));
        System.out.println(Arrays.toString(mrt3));
        System.out.println(Arrays.toString(mrt4));
        System.out.println(Arrays.toString(mrt5));
    }
}
