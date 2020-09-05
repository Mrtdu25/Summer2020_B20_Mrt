package Day51_Exceptions;

public class ExceptionsIntro {
    public static void main(String[] args) {

        int[] arr={1,2,3};

        System.out.println(arr[100]); // unchecked exceptions

        //Thread.sleep(3000);  // checked exceptions

        System.out.println(arr[75]);   /* unchecked during compile time no errors after runtime it gives
                                      exceptions error */

        //Thread.sleep();  it give compile error without running the code

        String str="Cybertek";
        System.out.println(str.charAt(-1)); // there is no -1 that's why unchecked exception occur running time

        // how to fix exceptions try and catch



    }
}
