package Office_Hours.Practice_10_07_2020;

import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {

        Set<Integer> st=new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Iterator<Integer> it = st.iterator();

        while (it.hasNext()){
            Integer each = it.next();

            if (each %2!=0){
                it.remove();
            }
        }

        System.out.println(st);

        System.out.println("=====================================================");


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 14, 5, 6, 7, 8, 9, 1, 12, 3, 4, 15));

        Iterator<Integer> it2=list.iterator();

        while (it2.hasNext()){
            if (it2.next() <5){
                it2.remove();
            }
        }
        System.out.println(list);

        System.out.println("=============================================================================");

        String[] names={"Murat","Gokhan","Ziiadin","Beslan","Meerim","Murat","Murat","Murat"};

        Set<String> set=new LinkedHashSet<>(Arrays.asList(names));

        Iterator<String> itr=set.iterator();
        String each = itr.next();
        while (itr.hasNext()){
            if (each.contains("i")){
                it.remove();
            }
        }

        System.out.println(set);












    }
}
