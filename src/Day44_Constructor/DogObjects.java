package Day44_Constructor;
import java.util.ArrayList;
import java.util.Arrays;

import static Day44_Constructor.DogPark.*;
public class DogObjects {
    public static void main(String[] args) {

        Dog myDog1=new Dog("Cakir",'M',"Kangal","Huge",2,"Cream");
     //   System.out.println(myDog1);

       String food= Dog.isDrinking="Drinking water";
        System.out.println(food);


        ArrayList<Dog> dogList=new ArrayList();
        dogList.addAll(Arrays.asList(myDog1,dog1,dog2,dog3));

        System.out.println(dogList);
        System.out.println("We have "+dogList.size()+" Dogs");

        for (Dog each:dogList){
            System.out.println(each.breed+" "+each.gender);
        }









    }
}
