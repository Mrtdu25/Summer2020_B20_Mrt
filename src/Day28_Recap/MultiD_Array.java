package Day28_Recap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {

int[][] arr2D={{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};
        System.out.println(Arrays.toString(arr2D[0])); //Each array
        System.out.println(Arrays.toString(arr2D[1]));//Each array
        System.out.println(Arrays.toString(arr2D[2]));//Each array
        System.out.println(Arrays.deepToString(arr2D));// multi array (whole thing)

        System.out.println(arr2D[1][3]); //if its 2 braket you can get the element no need for toSting method

        System.out.println("===================================");
//nested loop
        for (int i=0; i<=arr2D.length-1; i++){
            int[] each1DArray=arr2D[i];
            //System.out.println(Arrays.toString(each1DArray));
            for (int j=0; j<=each1DArray.length-1; j++){
                int eachNum=each1DArray[j];
                if (eachNum%2==0) {
                    System.out.print(eachNum + " ");
                }

            }
            System.out.println();
        }
        System.out.println("=====================================================");
// for each loop
        for(int[] each1D  : arr2D ){
            for( int eachElement :  each1D ){
                if(eachElement % 2 != 0) {
                    System.out.print(eachElement + " ");
                }
            }

            System.out.println();
        }


    }
}
