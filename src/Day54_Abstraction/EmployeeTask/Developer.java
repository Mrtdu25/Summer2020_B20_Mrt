package Day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

final public class Developer extends Employee {
    public Developer(String name, char gender, LocalDate DOfB, String jobTitle, double salary) {
        super(name, gender, DOfB, jobTitle, salary);
    }
}
