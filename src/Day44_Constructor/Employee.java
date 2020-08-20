package Day44_Constructor;

public class Employee {

    String name;
    int id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    static boolean isEmployed=true;
    static boolean hasSalary=true;

    public void setEmployeeInfo(String name,int id,int ssn,String jobTitle,double salary,char gender){
         this.name=name;
         this.id=id;
         this.ssn=ssn;
         this.jobTitle=jobTitle;
         this.salary=salary;
         this.gender=gender;
    }

    static {     // for static we need to initialize int the static bloc
         boolean isEmployed=true;
         boolean hasSalary=true;
    }

    public String toString(){
        return "Name: "+name+"\nGender: "+gender+"\nID: "+id+"\nSSN: "+ssn+"\nJobTitle: "+jobTitle+
                "\nSalary: "+salary;
    }

}
