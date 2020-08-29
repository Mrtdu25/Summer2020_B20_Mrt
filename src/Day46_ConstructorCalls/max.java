package Day46_ConstructorCalls;

public class max {
    public static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    public static double findMax(double[] arr){
        double max=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }


}
