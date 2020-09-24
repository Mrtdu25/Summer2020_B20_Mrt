package Day57_Polymorphism.EmployeeTask;

import org.omg.CORBA.MARSHAL;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {
    public static void main(String[] args) {

    Employee tester1=new Tester("Murat",123456,"SDET",150000,'M');
    Employee tester2=new Tester("Hamid",654123,"Junior Tester",90000,'M');

    Employee developer1=new Developer("Cemal",14789,"Senior Developer",200000,'M');
    Employee developer2 = new Developer("Abdul",123456789,"QA",110000,'M');
    Employee scrumMaster1 = new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M');

        //   scrumTeam
        ArrayList<Employee> scrumTeam = new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1, tester2, developer1, developer2,scrumMaster1) );

        for( Employee each  : scrumTeam ){
            System.out.println(each);
        }

    }
}
