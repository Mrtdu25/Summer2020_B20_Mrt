package Day13_Scanner;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

public class NextLine_VS_NextMethods {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your salary");
        double salary=scan.nextDouble(); ///120000
        scan.nextLine();//Enter
        System.out.println("Enter your fullname");
        String fullname =scan.nextLine();//fullname


        System.out.println("Salary: "+salary);
        System.out.println("full name: "+fullname);

        System.out.println("===============================");




    }
}
