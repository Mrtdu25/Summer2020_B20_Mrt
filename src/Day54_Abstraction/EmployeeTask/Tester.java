package Day54_Abstraction.EmployeeTask;
//2. create a sub class of Employee named Tester(meant to be subClass ONLY)
import java.time.LocalDate;

final public class Tester extends Employee {
    public Tester(String name, char gender, LocalDate DOfB, String jobTitle, double salary) {
        super(name, gender, DOfB, jobTitle, salary);
    }

    public void findBug(){
        System.out.println(name+" find a bug");
    }


}
