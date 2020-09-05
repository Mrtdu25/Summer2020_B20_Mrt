package Day51_Exceptions.BrowserTask;

public class OperaBrowser extends WebDriver {

    public void get(String URL){
        System.out.println("Opening the "+URL+" in the opera browser");
    }

    public void close(){
        System.out.println("Closing the opera browser");
    }



}
