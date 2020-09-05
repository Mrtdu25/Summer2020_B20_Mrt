package Day51_Exceptions.BrowserTask;

public class BrowserObject {
    public static void main(String[] args) {


    ChromeBrowser chromeDriver = new ChromeBrowser();
    chromeDriver.get("https://www.google.com");
    chromeDriver.close();

    FireFoxBrowser foxBrowser=new FireFoxBrowser();
    foxBrowser.get("https://www.google.com");
    foxBrowser.close();

    OperaBrowser opera=new OperaBrowser();
    opera.get("https://www.google.com");
    opera.close();


    }
}
