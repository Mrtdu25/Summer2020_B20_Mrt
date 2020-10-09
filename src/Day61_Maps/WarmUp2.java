package Day61_Maps;

import java.util.*;

/*
      write a program that can remove the duplicated Integers from a List of Integer
          Do Not change the insertion order
       */
public class WarmUp2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6));

        LinkedHashSet<Integer> set = new LinkedHashSet<>();// contains the unique objects
        set.addAll(list);
        list.clear();
        list.addAll( set );

        System.out.println(list);




    }


}
