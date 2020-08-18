package Day23_Arrays;
/*  int[] arr = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
write a program that can return the min and maximum number from the array

 */

public class MaxAndMin_Mrt {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;

        int[] arr = {10, 20, 3, 4, 5, 6, 7, -10, -100, 300, 400};
       for (int i = 0; i <=arr.length-1; i++){

            if (arr[i] > max) {
                max=arr[i];
            }

            if (arr[i] < min) {
                min=arr[i];

            }
        }

        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);

    }
}