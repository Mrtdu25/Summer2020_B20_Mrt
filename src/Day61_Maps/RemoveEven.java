package Day61_Maps;

import Day20_WhileLoops.WhileLoop;

import java.util.*;

public class RemoveEven {
    public static void main(String[] args) {

        Integer[] num={100,200,15,14,17,171,197,234,663,1453};

        Set<Integer> set=new LinkedHashSet<>(Arrays.asList(num));

        Iterator<Integer> it=set.iterator();

        while (it.hasNext()){
            Integer each = it.next();
            if (each%2==0){
                it.remove();
            }
        }

        System.out.println(set);



    }
}
