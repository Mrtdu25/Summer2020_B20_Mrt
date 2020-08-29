package Day47_Encapsulations;


public class CapitalOneObjects {

    public static void main(String[] args) {

     CapitalOneEmployees employee1=new CapitalOneEmployees("Murat",31,"SDET");



        employee1.setID(1540202321);
        employee1.setSalary(110000);
        employee1.setAddress("Vienna,VA");

        System.out.println("CompanyName: "+CapitalOneEmployees.companyName+"ID: "+employee1.getID()+
                "\n Salary: $"+employee1.getSalary()+"\nAddress: "+employee1.getAddress());






    }
}
