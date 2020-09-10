package Day0;

import java.util.Arrays;

class Main
{
    public static void main(String[] args) {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,3,4}, //sum = 6
                {4,4,5}, //sum = 11
                {5,5,6}  //sum = 3
        };

        int[] sums = rowSums(a);

        for(int sum : sums)
            System.out.println(sum);
        //this should print 4 6 11 3
    }

    public static int[] rowSums(int[][] nums){
        // write your codes here

        int[] mrt=new int[nums.length];
        int i=0;

        for (int[] each1DArray:nums){
           int sum=0;
           for (int eachElement:each1DArray){
               sum+=eachElement;
           }
          mrt[i]=sum;
           i++;
        }

          return mrt;
    }
}