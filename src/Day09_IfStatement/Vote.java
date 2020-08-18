package Day09_IfStatement;

public class Vote {

    public static void main(String[] args) {


        String firtsName ="Murat";
        String lastName ="Degirmenci";
        String fullName=firtsName+" "+lastName;

        int age =31;
        boolean UScitizen=true;
        if (age>= 18&& UScitizen){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Is not eligible to vote");
        }




    }

}
