package Day51_Exceptions.BrowserTask;

public class FireFoxBrowser extends WebDriver{

    public void get(String URL){
        System.out.println("Opening the "+URL+"in fireFox browser");
    }

    public void close(){
        System.out.println("Closing to fireFox browser");
    }


}
