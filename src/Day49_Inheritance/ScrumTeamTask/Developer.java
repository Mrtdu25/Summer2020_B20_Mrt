package Day49_Inheritance.ScrumTeamTask;
/*
reate a subclass of Employee called called Developer
                    Attributes:
                        ame, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), coding(),  fixBug(), toString()

 */
public class Developer extends Employee {

    public Developer(String name,int age,char gender,double salary,int id,String jobTitle){
        setInfo(name,age,gender,salary,id,jobTitle);
    }

   public void coding(){
       System.out.println(name+" is developing code,while hitting his head to the wall");
   }

   public void fixBug(){
       System.out.println(name+" fixing bug while murmuring");
   }


}
