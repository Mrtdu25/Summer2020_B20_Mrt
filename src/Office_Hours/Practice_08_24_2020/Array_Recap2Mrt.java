package Office_Hours.Practice_08_24_2020;

import Day44_Constructor.Employee;

import java.util.Arrays;

public class Array_Recap2Mrt {
    public static void main(String[] args) {

        int[] numbers={9,15,1400,-6000,-42,-300,80,750,456,74569,525,7415,63,14,78,96,-96};

       // Arrays.sort(numbers); once you short it first index min last index max
        //System.out.println(Arrays.toString(numbers));

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int each:numbers){
            if (each>max){
               max=each;
            }else if (each<min){
                min=each;
            }


        }
        System.out.println("Max number= "+max+"\nMin number= "+min);
        System.out.println("=======================================");

        int[] nums={1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20};

        int k=0;
        for (int i=nums.length; i>0; i--){
            nums[k]=i;
            k++;
           // System.out.print(nums[i]+" ");
        }
        System.out.println(Arrays.toString(nums));


    }
}
