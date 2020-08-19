package Day43_Static;
class A{
    static int  a = 200;
}

public class CybertekStudent {
    // for the advantages of static

    String studentName;
    int age;
    char gender;
    static  String schoolName = "Cybertek School";

    public void getInfo(){
        System.out.println("Name: "+studentName); // instance bc we have too many different student name
    }

    public static void printSchool(){
        System.out.println("School Name: "+schoolName); // school name is static bc only one
    }


}
