package Day13_Scanner;

import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your building number");
        int buildingNumber=scan.nextInt(); /// 1453

        scan.nextLine();//Enter

        System.out.println("Enter your street name");
        String streetName =scan.nextLine();//street name

        System.out.println("Building Number: "+buildingNumber+" Street Name: "+streetName);

        scan.close();


    }
}

