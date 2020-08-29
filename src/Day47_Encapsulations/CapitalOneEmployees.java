package Day47_Encapsulations;
/* instance variables:
                        employeeName
                        employeeAge
                        jobTitle
                    private ID
                    private salary
                    private address
                    company name = "Capital One"
                    generate getters & setters for private variables*/
public class CapitalOneEmployees {

    public String employeeName;
    public int age;
    public String jobTitle;

    private int ID;
    private double salary;
    private String address;

    public static String companyName;
    static {
        companyName="Capital One";
    }


    public CapitalOneEmployees(String employeeName, int age, String jobTitle) {
        this.employeeName = employeeName;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    public int getID (){
        return ID;
    }

    public void setID(int ID){
        this.ID=ID;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
       this.salary=salary;

    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address=address;
    }


    public String toString() {
        return "employeeName='" + employeeName + '\'' +
                ", age=" + age +
                ", jobTitle='" + jobTitle+"ID: "+getID()+",Salary: "+getSalary()+",Address: "+getAddress();
    }
}
