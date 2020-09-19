package Day54_Abstraction.EmployeeTask;

import java.time.LocalDate;
import java.time.LocalDateTime;

/*1.create a class named Employee (meant to be super class):
            Attributes:
                    name, gender(final), DOfB(final), jobTitle, Salary
                    create constructor that can initialize lal those attributes
                        (even final variable you should initialize them within constructor)
*/
public class Employee {
    public String name;
    final public char gender;
    final public  LocalDate DOfB;
    public String jobTitle;
    public final double salary;

    public Employee(String name, char gender, LocalDate DOfB, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOfB = DOfB;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

  public String toString(){
        return "Name: "+name+", Gender: "+gender+", DOfB: "+DOfB+", JobTitle: "+jobTitle+", Salary: "+salary;
  }


}
