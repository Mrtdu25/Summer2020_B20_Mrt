package Day49_Inheritance.ScrumTeamTask;

/*
 create a subclass of Person called Employee
                attributes: name, age, gender, Salary, ID, jobTitle
                methods: work, setEmployeeInfo

 */
public class Employee extends Person {

    public double salary;
    public int id;
    public String jobTitle;

 public void setInfo(String name,int age,char gender,double salary,int id,String jobTitle){
     setInfo(name,age,gender);
     this.salary=salary;
     this.id=id;
     this.jobTitle=jobTitle;

 }

 public void work(){
     System.out.println(name+" is working");
 }

    public String toString(){
        return "Name : "+name+", Age: "+age+", Gender: "+gender+
                ", Salary: "+salary+", Id: "+id+", Job title: "+jobTitle;
    }

}
