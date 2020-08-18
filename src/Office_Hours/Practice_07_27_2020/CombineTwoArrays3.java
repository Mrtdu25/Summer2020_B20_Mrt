package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArrays3 {
    public static void main(String[] args) {

        char[] a1={'M','U','R','A','T','-'};
        char[] a2={'H','A','M','I','D'};

        char[] a3=new char[a1.length+a2.length]; // we will combine a1 and a2 in a3 array
/*
        a3[0]=a1[0];
        a3[1]=a1[1];
        a3[2]=a1[a1.length-1];

        a3[3]=a2[0];
        a3[4]=a2[1];
        a3[a3.length-1]=a2[a2.length-1]; */


        for (int i=0; i<=a1.length-1; i++){
            a3[i]=a1[i];

        }
        for(int j=0; j<=a2.length-1; j++){
            a3[j+a1.length]=a2[j];

        }

        System.out.println(Arrays.toString(a3));



    }

    }
