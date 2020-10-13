package Day60_Collection.mrt;

import javax.jws.soap.SOAPBinding;
import java.lang.reflect.Array;
import java.util.*;

public class ListInterface {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>(Arrays.asList("Murat","Hamid","Duaa","Hassuni"));
        list.remove("Hassuni");
        System.out.println(list);

        List<String> list2=new LinkedList<>(Arrays.asList("Murat","Hamid","Duaa","Hassuni"));
        list2.set(3,"Hussein");
        System.out.println(list2);
        list2.removeIf(each->each.startsWith("H"));
        System.out.println(list2);

        List<String> list3=new Vector<>(Arrays.asList("Murat","Murat","Hamid","Duaa","Hassuni"));
        System.out.print("Size : "+list3.size());
        list3.retainAll(Arrays.asList("Murat","Duaa"));
        System.out.println(list3);
        list3.remove(0);
        System.out.println(list3);

        List<String> list4=new Stack<>();
        list4.addAll(Arrays.asList("Hamid","Hassuni"));
        list4.addAll(list3);
        System.out.println(list4);

        System.out.println("===========================================");


        Stack<Integer> stackList=new Stack();
        stackList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        stackList.pop(); //Last In Last Out   LILO
        stackList.pop();
        System.out.println(stackList);  //LILO

        System.out.println("==============================================");


        ArrayList<ArrayList<Integer>> l1=new ArrayList<>();

        l1.add(new ArrayList<>(Arrays.asList(1,2,3,4,5)));
        l1.add(new ArrayList<>(Arrays.asList(6,7,8,9,10)));
        System.out.println(l1);
        l1.add(new ArrayList<>(Arrays.asList(5,10,15,20,25,30)));
        System.out.println(l1.get(1));

        System.out.println("==============================================");

        ArrayList<ArrayList<String>> groups=new ArrayList<>();
        groups.addAll(Arrays.asList(new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),new ArrayList<>()));
        groups.get(0).addAll(Arrays.asList("Murat","Duaa","Hamid"));
        groups.get(1).addAll(Arrays.asList("Ibrahim","Gulsun"));
        groups.get(2).addAll(Arrays.asList("Ali","Thikra","Hussein"));
        groups.get(3).addAll(Arrays.asList("Melih","Mert","Hulya"));

        for (ArrayList<String> eachGroup : groups) {
            ArrayList<String> eachGroup1 = eachGroup;
            for (String eachElement : eachGroup1) {
                System.out.println(eachElement+" ");
            }
        }



    }
}
