package Day09_IfStatement;

public class Alcohol {
    public static void main(String[] args) {

        //write a java program that can identify if a person is eligible to buy alcohol

        String Fullname= "Murat Degirmenci";
        int age=31;
        Boolean hasID=true;
        boolean Eligible = age>21 && hasID; // true && false==>false

        String result="";

       if (Eligible==true){
           //System.out.println("eligible to buy alcohol");
           result="is eligible to buy alcohol";
       }

       if(Eligible==false){
           //System.out.println("NOT eligible to buy alcohol");
           result ="is not eligible to buy alcohol";

       }

        System.out.println(Fullname+" "+result);



    }
}
