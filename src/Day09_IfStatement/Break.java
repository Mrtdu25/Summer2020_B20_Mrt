package Day09_IfStatement;

public class Break {
    public static void main(String[] args) {

        String ItIsBreakTime="yes";

        if (ItIsBreakTime=="yes"){
            System.out.println("Take 15 minutes of break");
        }else
            System.out.println("Keep studying ");

        System.out.println("======================================");

        int a=200;
        int b=300;

        if (a>b){
            System.out.println(a+" is the greater number");
        }else
            System.out.println(b+" is the greater number");

    }

}
