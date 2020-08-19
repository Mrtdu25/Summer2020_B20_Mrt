package Day43_Static;

public class StudentObjects {
    public static void main(String[] args) {
        CybertekStudent obj1=new CybertekStudent();
        obj1.studentName="Murat";

        CybertekStudent obj2=new CybertekStudent();
        obj2.studentName="Uros";

        System.out.println(obj1.studentName);
        System.out.println(obj2.studentName);

        System.out.println(obj1.schoolName);
        System.out.println(obj2.schoolName);

        System.out.println(CybertekStudent.schoolName);




    }
}
