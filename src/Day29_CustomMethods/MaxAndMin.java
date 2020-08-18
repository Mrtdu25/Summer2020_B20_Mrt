package Day29_CustomMethods;



public class MaxAndMin {
    public static void main(String[] args) {
        int[] numbers={100,-500,2500,-4000,1600,1905,300,1453};
        maxNum(numbers);
    }
    public static void maxNum(int[] arr){
       int max=arr[0];
       for (int each:arr){
           if (each>max){
               max=each;
           }
       }
        System.out.println("Max: "+max);
    }

    public static void minNum(int[] arr){
        int min=arr[0];
        for (int each:arr){
            if (each>min){
                min=each;

            }
        }
    }

}
