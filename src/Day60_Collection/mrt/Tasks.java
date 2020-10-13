package Day60_Collection.mrt;

import java.util.*;

public class Tasks {
    public static void main(String[] args) {

        String[] words={"Java","level","Nalan","Murat","ana","Mihtar"};

        List<String> list = new ArrayList<>(Arrays.asList(words));

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String each = it.next();
            String reversed="";
            for (int i=each.length()-1; i>=0; i--){
                reversed+=each.charAt(i);
            }
            if (each.equalsIgnoreCase(reversed)){
                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("=================================================");

        Integer[] num={111,245,74,96,854,23,64,1,745,1111,3322,3322,54,145};

        LinkedHashSet<Integer> set=new LinkedHashSet<>(Arrays.asList(num));

        Iterator<Integer> it1 = set.iterator();
        while (it1.hasNext()){
            Integer each = it1.next();
            if (each%2==0){
                it1.remove();
            }
        }

        System.out.println(set);

        System.out.println("=================================");

        List<Integer> list2=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,9,9,9,8));

        LinkedHashSet<Integer> set2=new LinkedHashSet<>(list2);
        System.out.println(set2);

        list2.clear();
        System.out.println(list2);
        list2.addAll(set2);
        System.out.println(list2);

        System.out.println("=========================================");

        String[] words1={"Java","level","Nalan","Murat","ana","Mihtar","Java","level","Nalan","Murat","ana","Mihtar"};

        LinkedList<String> list3=new LinkedList<>(Arrays.asList(words1));

        TreeSet<String > set3=new TreeSet<>(list3);
        System.out.println("TreeSet: "+set3);
        list3.clear();
        list3.addAll(set3);
        System.out.println("NonDup ArrayList: "+list3);


    }

}
