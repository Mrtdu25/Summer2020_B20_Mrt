package Day36_Array_List;
import java.util.ArrayList;
import java.util.Collections;
public class Collection_Utility {
/*
     Arrays: utility class for array
     Collections: utility for collection
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(15);
        list.add(10);
        list.add(40);
        list.add(30);

        Collections.sort(list);  // sort method for arraylist

        System.out.println(list);

        System.out.println("Maximum number: "+list.get( list.size()-1 )  );
        System.out.println("Minimum number: "+list.get(0));



    }
}
