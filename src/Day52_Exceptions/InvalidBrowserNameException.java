package Day52_Exceptions;

public class InvalidBrowserNameException extends RuntimeException {

    public InvalidBrowserNameException() {
        super();
    }

    public InvalidBrowserNameException(String str) {
        super(str);
    }


}

class Test{
    public static void main(String[] args) {
            String driverName="ch2rome";

            if (driverName.equals("chrome")){
                System.out.println("set up chrome");
            }else if (driverName.equals("firefox")){
                System.out.println("set up firefox");
            }else if (driverName.equals("opera")){
                System.out.println("set up opera");
            }else {
                throw new InvalidBrowserNameException("Please select different browser");
            }


    }
}


