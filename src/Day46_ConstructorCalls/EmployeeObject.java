package Day46_ConstructorCalls;

import javax.jws.soap.SOAPBinding;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1=new Employee("Murat");
        System.out.println(employee1);
        System.out.println("============================");

        Employee employee2=new Employee("Hamid","SDET");
        System.out.println(employee2);

        Employee employee3=new Employee("Cemal","SDET",12563425);
        System.out.println(employee3);

        Employee employee4=new Employee("Kemal","Lead SDET",12585525,150000);

        System.out.println("===============================");



    }
}
