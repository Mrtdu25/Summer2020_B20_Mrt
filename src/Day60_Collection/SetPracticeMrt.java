package Day60_Collection;

import java.util.*;

public class SetPracticeMrt {

    public static void main(String[] args) {

        String str1="aaaabbbddddccccddeeee";
        String[] arr = str1.split("");

        System.out.println(Arrays.toString(arr));

        Set<String> s1=new HashSet<>();
        s1.addAll(Arrays.asList(arr));
        System.out.println(s1);

        System.out.println("==============================================");

        String str2="xxxzzzyyttthh";

        str2=new LinkedHashSet<>(Arrays.asList(str2.split(""))).toString();
        str2=str2.replace(",","").replace("[","").replace("]","");
        System.out.println(str2);

        System.out.println("===================================================================");
        String str3="MuratMuratMuratMurat";
        String nonDupStr3 = removeDup(str3);
        System.out.println(nonDupStr3);

        System.out.println("==================================");

        String[] sArr={"Murat","Murat","Kemal","John","John","Ali","Muhtar","Muhtar"};

        String[] result = removeDupFromArray(sArr);
        System.out.println(Arrays.toString(result));

        System.out.println("===========================================");

    }


    public static String removeDup(String str){

        str=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        str=str.replace(",","").replace("[","").replace("]","");

        return str;

    }


    public static String[] removeDupFromArray(String[] names){

         return new LinkedHashSet<>(Arrays.asList(names)).toArray(new String[0]);

    }

    public static Integer[] removeDupFromArray(Integer[] numbers){

        return new LinkedHashSet<>(Arrays.asList(numbers)).toArray(new Integer[0]);

    }

    public static Boolean compareString(String s1,String s2){

        s1=new HashSet<>(Arrays.asList(s1)).toString();
        s2=new HashSet<>(Arrays.asList(s2)).toString();

        return s1.equals(s2);
    }




    }






