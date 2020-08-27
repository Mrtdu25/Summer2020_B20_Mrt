package Day46_ConstructorCalls;

public class Employee {

    String name;
    String jobTitle;
    int ID;
    double salary;

    public Employee(String name) {
        this.name = name;

    }

    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, int ID) {
        this(name, jobTitle);
        this.ID = ID;

    }

    public Employee(String name, String jobTitle, int ID, double salary) {
        this(name,jobTitle,ID);
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary;
    }
}
