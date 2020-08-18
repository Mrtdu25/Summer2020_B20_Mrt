package Day36_Array_List;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(40);

        int a=list.indexOf(40);
        System.out.println(a);

        System.out.println(list.indexOf(60)); // 60 is notexist in the list therefore it will print -1

        System.out.println(list.lastIndexOf(40)); // gets the last 40

        boolean r1=list.contains(100);
        System.out.println(r1);









    }
}
