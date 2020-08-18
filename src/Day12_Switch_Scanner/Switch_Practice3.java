package Day12_Switch_Scanner;

public class Switch_Practice3 {
    public static void main(String[] args) {

        String productName="Ipad";

        switch (productName){

            case "Galaxy":
                System.out.println("Samsung");
                break;

            case "Iphone":
            case "MacBook":
            case "Ipad":
                System.out.println("Apple");
                break;

            default:
                System.out.println("Invalid Product Name");
        }

  ////Task 2



    }
}
