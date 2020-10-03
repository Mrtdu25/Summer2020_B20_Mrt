package Day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator_Practice2 {
    public static void main(String[] args) {
        String [] arr={"Murat","Ahmet","Virginia","Cemal","Ayse","Fatma","Nazo","Cano"};
        ArrayList<String> names=new ArrayList<>(Arrays.asList(arr));

        Iterator<String> it=names.iterator();

        while (it.hasNext()){
            if (it.next().equalsIgnoreCase("Ahmet")){
                it.remove();
            }
        }
        System.out.println(names);






    }
}
