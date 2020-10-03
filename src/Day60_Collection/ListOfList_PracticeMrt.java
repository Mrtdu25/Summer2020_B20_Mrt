package Day60_Collection;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class ListOfList_PracticeMrt {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groups=new ArrayList<>();

        groups.add(new ArrayList<>(Arrays.asList("Murat","Duaa","Hamid")));
        groups.addAll(Arrays.asList(new ArrayList<>(),new ArrayList<>(),new ArrayList<>()));

        System.out.println(groups);

        groups.get(1).addAll(Arrays.asList("Ibrahim","Gulsun"));

        groups.get(2).addAll(Arrays.asList("Uros","Ayhan","Nurmamet","Murat","Shekur"));

        groups.get(3).addAll(Arrays.asList("Fikret","Sibel","Halil","Dogukan"));

        System.out.println(groups);


        for (ArrayList<String> eachgroup : groups) {
            for (String eachElement : eachgroup) {
                System.out.println(eachElement);
            }
        }

        /*ArrayList<ArrayList> list=new ArrayList<>();
        list.addAll(Arrays.asList(new ArrayList(),new ArrayList(),new ArrayList()));
        list.get(0).addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.get(1).addAll(Arrays.asList("Murat","Ayhan","Shekur","Nurmamet"));
        list.get(2).addAll(Arrays.asList('A','B','C','D','E','F'));

        System.out.println(list); */

        System.out.println("==================================================");



    }
}
