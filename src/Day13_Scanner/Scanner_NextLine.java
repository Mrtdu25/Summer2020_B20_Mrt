package Day13_Scanner;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your fullname");
        String fullName=scan.nextLine();

        System.out.println("Enter your company name");
        String companyName=scan.nextLine();

        System.out.println("Enter your address");
        String address=scan.nextLine();

        System.out.println("Enter your phone number");
        long phoneNumber=scan.nextLong();

        String customerInfo="Full name: "+fullName+""+"Company Name: "+companyName +"Address "+address+" Phone Number: "+phoneNumber;
        System.out.println("New customer informations: "+customerInfo);

        scan.close();


    }
}
