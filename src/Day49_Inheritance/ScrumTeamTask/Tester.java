package Day49_Inheritance.ScrumTeamTask;



/*
 create a subclass of Employee called Testers
                    Attributes:
                        ame, age, gender, Salary, ID, jobTitle
 */
public class Tester extends Employee {

    public Tester(String name,int age,char gender,double salary,int id,String jobTitle){
        setInfo(name,age,gender,salary,id,jobTitle);
    }

    public void smokeTesting(){
        System.out.println(name+" is performing smoke test,while drinking coffe");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket,while drinking coffee");
    }

     Tester tester1=new Tester("Murat",30,'M',110_000,10711453,"SDET");

}
