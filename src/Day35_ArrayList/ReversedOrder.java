package Day35_ArrayList;
/*
 1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
 */
import java.util.ArrayList;

public class ReversedOrder {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);
       list.add(50);
       list.add(0,05);
       for (int i=list.size()-1; i>=0; i--){
        System.out.println(list.get(i));
      }
        System.out.print(list);






    }
}
