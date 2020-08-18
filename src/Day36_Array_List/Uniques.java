package Day36_Array_List;
import java.util.ArrayList;
/*
3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
 */
public class Uniques {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();  // {1,1,2,3,3}
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques = new ArrayList<>(); // {2}

        for (Integer each1:list){
            int count=0;

            for (Integer each2:list){
                if (each1==each2){
                    count++;
                }
            }
            if (count==1){
                uniques.add(each1);
            }
        }

        System.out.println(uniques);



    }
}
