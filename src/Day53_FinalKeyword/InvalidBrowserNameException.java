package Day53_FinalKeyword;



public class InvalidBrowserNameException extends RuntimeException {

public InvalidBrowserNameException(){
    super("Invalid browser name");
}

public InvalidBrowserNameException(String str){
    super(str);
}


}

class Test2{
    public static void main(String[] args) {

        String name="cybertek";

        switch (name.toLowerCase()){
            case "chrome":
                System.out.println("Chrome browser is selected");
                break;
            case "Firefox":
                System.out.println("Firefox browser is selected");
                break;
            case "Safari":
                System.out.println("Safari browser is selected");
                break;
            default:
                throw new InvalidBrowserNameException("Please enter a valid browser name");

        }

    }
}
