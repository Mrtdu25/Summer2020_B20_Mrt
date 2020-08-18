package Day13_Scanner;

import Day12_Switch_Scanner.Switch;

public class Browsers {
    public static void main(String[] args) {

        String browserName="Opera";

        switch (browserName){

            case "Chrome":
                System.out.println("Chrome is selected");

            case "Firefox":
                System.out.println("Firefox is selected");

            case "Opera":
                System.out.println("Opera is selected");

            case "Safari":
                System.out.println("Safari is selected");

            case "Edge":
                System.out.println("Edge is selected");

            default:
                System.out.println("Invalid");

        }





    }
}
