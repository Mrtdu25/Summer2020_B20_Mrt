package Day60_Collection.mrt;

import java.lang.reflect.Array;
import java.util.*;
import java.util.logging.SocketHandler;

public class SetInterface {
    public static void main(String[] args) {

        Integer[] arr1={1,2,3,4,5,6,7,8,9,10};
        Integer[] arr2={6,7,8,9,10,1,2,3,4,5,6};

        HashSet<Integer> list=new HashSet<>();
        list.addAll(Arrays.asList(arr1));
        System.out.println(list);
        list.addAll(Arrays.asList(arr2));
        System.out.println(list);

        for (Integer eachElement : list) {
            System.out.println(eachElement);
        }

        System.out.println("============================================");
        String str = "ddddddddcccccccbbbbbbbbaaaaaaaaamurat";

        String[] arr = str.split("");

        LinkedHashSet<String> lstmrt = new LinkedHashSet(Arrays.asList(arr));
        System.out.println(lstmrt);

        String str2 = "ttttyyyyyuuuuuuuiiiiiiaaaaaaaaa";

        str2=new TreeSet<>(Arrays.asList(str2.split(""))).toString();
        System.out.println(str2);

        String[] names2 = {"Roman", "Abzal", "Nurbiye", "Roman", "Roman", "Roman", "Roman", "Roman"};

        names2= new LinkedHashSet<>(Arrays.asList(names2)).toArray(new String[0]);

        System.out.println(Arrays.toString(names2));

        Integer[] arr5={1453,1905,1071,1453,1905,1071};

        arr5=new TreeSet<>(Arrays.asList(arr5)).toArray(new Integer[1]);

        System.out.println(Arrays.toString(arr5));

        Character[] characters={'a','c','d','b','f','g','e','b','c','d'};

        characters=new HashSet<>(Arrays.asList(characters)).toArray(new Character[0]);
        System.out.println(Arrays.toString(characters));


        String trs="aaaaaacccccccccbbbbbbbbnnnngggggggggghtttookkkjhhhhdhhhdhdhdhdhhdksksksksk";

        trs=new TreeSet<>(Arrays.asList(trs.split(""))).toString();
        System.out.println(trs);

        System.out.println("==============================================");
        String dfr="allllllkkkkkopoiijeeeddsssxxxccccxxxxzzzzwwweeerrrttt";

        dfr=new ArrayList<>(Arrays.asList(dfr.split(""))).toString();

        System.out.println(dfr);

        dfr=dfr.replaceAll(",","").replace("[","").replace("]","");
        System.out.println(dfr);

        dfr=new TreeSet<>(Arrays.asList(dfr.split(""))).toString();
        System.out.println(dfr);

        dfr=dfr.replaceAll(",","").replace("[","").replace("]","");
        System.out.println(dfr);

        System.out.println("==============================================================");
        Integer[] arr3={65,74,15,89,43,19,86,48,75,95,25,45,65,12,32,1,2,3,4,7,8,5,96,3,22,2};

        arr3=new TreeSet<>(Arrays.asList(arr3)).toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr3));

        System.out.println("==================================================================");




    }
}
