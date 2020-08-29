package Day47_Encapsulations;

public class Credentials {
    public String name;
    public int  age;
    private String username="hummer25";
    private String password="CnnBbc123";

    public static String companyName;

    static {
        companyName="Facebook";
    }

    public Credentials(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String toString(){
        return "Name: "+name+", Age: "+age;
    }

}
