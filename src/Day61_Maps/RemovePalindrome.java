package Day61_Maps;

import Day42_static.StaticVariable;

import java.lang.reflect.Array;
import java.util.*;

/*1. write a program that can remove the palindrome string from a list of String
            DO NOT use Lambda expressions*/
public class RemovePalindrome {
    public static void main(String[] args) {

        String[] words={"Level","Kayak","Zaman","Ana","Java","Python","Batch20"};

        List<String> list=new LinkedList<>();

        list.addAll(Arrays.asList(words));

        Iterator<String> it=list.iterator();

        while (it.hasNext()){
            String each  = it.next();
            String reversed="";

            for (int i=each.length()-1; i>=0; i--){
                reversed+=each.charAt(i);
            }

            if (each.equalsIgnoreCase(reversed)){
                it.remove();
            }
        }

        System.out.println(list);

    }
}
