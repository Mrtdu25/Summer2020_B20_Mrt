package Day51_Exceptions.BrowserTask;

public class ChromeBrowser extends WebDriver {

    // we have get and close method bc we extended
    @Override
    public void get(String URL){
        System.out.println("Opening the "+URL+"in chrome browser");
    }
    @Override
    public void close(){
        System.out.println("Closing to chrome browser");
    }


}
