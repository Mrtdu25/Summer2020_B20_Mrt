package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;

public class Array_desc2 {
    public static void main(String[] args) {
        int[] arr={1905,1903,1453,1960,1989,2016,1991,1990,1071};

        Arrays.sort(arr); //[55, 68, 97, 98, 100, 200]

        System.out.println(Arrays.toString(arr));

        int[] descArr = new int[arr.length];

        int k= arr.length-1;
        for( int each: arr){ // 55, 68, 97, 98, 100, 200
            descArr[k] = each;
            k--;
        }

        System.out.println(Arrays.toString(descArr));
    }
}
