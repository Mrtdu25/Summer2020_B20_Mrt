package Day47_Encapsulations;

import java.util.ArrayList;

public class StaticBlock {

    static String companyName;

    static ArrayList<Integer> list=new ArrayList<>();

    static {
        companyName="Bank of America";

        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {
        System.out.println(list);
        System.out.println(companyName);
    }

}
