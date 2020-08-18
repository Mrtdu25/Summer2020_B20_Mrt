package Day29_CustomMethods;

public class test {
    public static void main(String[] args) {
        printHollowRect();
    }

    public static void printHollowRect() {
        // write your codes here
        int a = 0;
        int b = 0;
        for (int i = 0; i <= a; i++) {
            System.out.println();
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }


        }


    }
}

