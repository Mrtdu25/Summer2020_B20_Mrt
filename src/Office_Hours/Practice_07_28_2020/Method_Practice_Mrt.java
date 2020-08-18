package Office_Hours.Practice_07_28_2020;

public class Method_Practice_Mrt {

    public static void main(String[] args) {

        String myName="Murat";
        String result= reverseStr(myName);
        System.out.println(result);
        System.out.println("===============================");
        String str="LeVeL";
        String reversed= reverseStr(str);
//Single if statement
       if (str.equalsIgnoreCase(reversed)){
           System.out.println("Palindrome");
       }else {
           System.out.println("Not Palindrome");
       }
//Ternary
      String result2=(str.equalsIgnoreCase(reversed))? "Palindrome": "Not Palindrome";
        System.out.println(result2);

    }

    public static String reverseStr(String str){
        String result="";

        for (int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }

        return result;
    }


}
