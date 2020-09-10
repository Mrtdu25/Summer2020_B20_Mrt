package Day53_FinalKeyword;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException(){
        super("Its time for a break");
        System.out.println("Time to take 15 minutes break");
    }


}


class Test{
    public static void main(String[] args) {


        //throw  new RuntimeException();
        throw  new BreakTimeException();


    }
}