package Day57_Polymorphism.EmployeeTask;

public class Tester extends Employee {
    public Tester(String name, int id, String jobTitle, double salary, char gender) {
        super(name, id, jobTitle, salary, gender);
        if (salary<90000){
            throw new RuntimeException("You need to ask your boss to raise your salary");
        }
    }

    @Override
    public void work() {
        System.out.println("Tester "+name+" is working");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", gender=" + gender +
                '}';
    }
}
