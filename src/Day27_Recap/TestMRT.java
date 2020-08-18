package Day27_Recap;
import java.util.*;
public class TestMRT {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
       if(email.indexOf("@")==-1 || email.indexOf("@" )!=email.indexOf("@")){
           System.out.println("invalid email");
       }else{
           System.out.println("Email id: "+email.substring(0,email.indexOf('@')));
           System.out.println("Email domain: "+email.substring(email.indexOf('@')+1));
       }
    }
}

