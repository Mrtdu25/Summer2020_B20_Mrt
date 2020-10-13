package Day60_Collection.mrt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Iterable {
    public static void main(String[] args) {

        ArrayList<Character> list=new ArrayList<>(Arrays.asList('F','F','F','M','M'));

        Iterator<Character> it=list.iterator();
        while (it.hasNext()){
            if (it.next().equals('M')){
                it.remove();
            }
        }
        System.out.println(list);
        System.out.println("===================================");
        LinkedList<Integer> list2=new LinkedList(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,32));

        Iterator<Integer> it2=list2.iterator();
        while (it2.hasNext()){
            Integer each = it2.next();
            if (each>10){
                it2.remove();
            }
        }
        System.out.println(list2);

        System.out.println("=========================================");









    }
}
