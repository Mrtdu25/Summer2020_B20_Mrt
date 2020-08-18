package Day36_Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class Set_Method {
      /*
    1. write a program that can set the last element of the Integer arraylist to zero
			ex:
				list = [1,2,3,4,5];
				output: [1,2,3,4,0];
	2. write a program that can multiply each odd number by 2
			ex:	list = [1,2,3,4,5];
				output: [2,2,6,4,10]
     */

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);  //0
        list1.add(20);  //1
        list1.add(30);  //2
        list1.add(40);  //3
        list1.add(50);  //4
        list1.add(60);  //5
        list1.add(70);  //6
        list1.add(80);  //7

        list1.set( list1.size()-1 , 0);

        System.out.println(list1);

        System.out.println("==========================================");

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 1; i <= 20; i++){
            list2.add(i);
        }

        System.out.println(list2);

        // task02
        for(int i = 0; i <= list2.size()-1; i++){ // i: index numbers
            Integer each= list2.get(i); // each element in the list

            if( each % 2 != 0){
                list2.set(i,  each * 2 );
            }else{
                list2.set(i, each * 3);
            }

        }

        System.out.println(list2);

        System.out.println("============================");

        ArrayList<Integer> listMrt = new ArrayList<>();
        listMrt.add(10);
        listMrt.add(02);
        listMrt.add(200);
        listMrt.add(03);
        listMrt.add(04);  //add

        listMrt.set(0,1905);
        listMrt.set(1,1453);
        listMrt.set(2,1071);
        listMrt.set(3,1989);
        listMrt.set(4,2016);
        System.out.println(listMrt); //set

        Collections.sort(listMrt); //sort
        System.out.println(listMrt);

        Collections.swap(listMrt,1,4);//swap
        System.out.println(listMrt);

        System.out.println(Collections.frequency(listMrt,1905)); //frequency

        System.out.println(listMrt.get(2)); //get


    }

}
