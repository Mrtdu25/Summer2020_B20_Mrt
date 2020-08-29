package Day47_Encapsulations;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class Encapsulation {

    private long ssn=123456789;
    private String userName="mrtdu25";
    private String password="m25t63p96";

   public long getSsn(){
        return ssn;
    }

    public void setSsn(long ssn){
       this.ssn=ssn;
    }

    public String getUserName(){
       return userName;
    }

    public void setUserName(String userName){
       this.userName=userName;
    }

    public String getPassword(){
       return password;
    }

    public void setPassword(String password){
        this.password=password;
    }





}
