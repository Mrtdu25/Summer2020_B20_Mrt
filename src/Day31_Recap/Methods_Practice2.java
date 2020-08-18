package Day31_Recap;

public class Methods_Practice2 {
    public static void main(String[] args) {
        String name ="madam";

        reverse1(name);
        //   System.out.println( reverse1(name));                          we cant because void

        //   System.out.println( name.equalsIgnoreCase(reverse1(name)) );  we cant because void




        String rev = reverse2(name);
        System.out.println( reverse2(name) );
        System.out.println( name.equalsIgnoreCase( reverse2(name) ));

    }

// void methods
    public static void reverse1(String str){
        String expectedResult = "";
        for(int i = str.length()-1; i >= 0; i--){
            expectedResult += str.charAt(i);
        }

        System.out.println(expectedResult);
    }

//return methods
    public static String reverse2(String str){
        String expectedResult = "";
        for(int i = str.length()-1; i >= 0; i--){
            expectedResult += str.charAt(i);
        }

        return expectedResult;
    }


}