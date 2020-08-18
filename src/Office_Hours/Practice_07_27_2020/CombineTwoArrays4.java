package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArrays4 {
    public static void main(String[] args) {

        String[] a1={"Murat","Hamid","Duaa"};
        String[] a2={"Ibrahim","Gulsun","Melih"};

        String[] Family=new String[a1.length+a2.length];

        for (int i=0; i<=a1.length-1;i++){
            Family[i]=a1[i];
        }

        for (int i=0; i<=a2.length-1;i++){
            Family[i+a1.length]=a2[i];
        }

        System.out.println(Arrays.toString(Family));
    }
}
