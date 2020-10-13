package Day61_Maps;

import java.util.*;

public class Practice_Mrt2 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Shakhzod", 89);
        students.put("Ceren", 77);
        students.put("Fatime", 85);
        students.put("Kalbinur", 98);
        students.put("Hanna",94);
        students.put("Jesus",74);
        students.put("Elmira",97);
        students.put("Ali",92);
        students.put("Mikri",95);
        students.put("Ali", 65 );
        students.put("Adam", 93 );
        students.put("Murat", 79 );
        students.put("Cihan", 75);
        students.put("John", 71);

        for (String eachKey:students.keySet()){
            Integer eachValue=students.get(eachKey);

            if (eachValue<80){
                System.out.println(eachKey);
            }
        }

        System.out.println("==================================================");

        LinkedHashMap<String, Integer> students1 = new LinkedHashMap<>();
        students1.put("Shakhzod", 89);
        students1.put("Ceren", 77);
        students1.put("Fatime", 85);
        students1.put("Kalbinur", 98);
        students1.put("Hanna",94);
        students1.put("Jesus",74);
        students1.put("Elmira",97);
        students1.put("Ali",92);
        students1.put("Mikri",95);
        students1.put("Ali", 65 );
        students1.put("Adam", 93 );
        students1.put("Murat", 79 );
        students1.put("Cihan", 75);
        students1.put("John", 71);

        Map<String,Integer> earlyBirds=new TreeMap<>();
        Map<String,Integer> angryBirds=new TreeMap<>();

        for (String eachKey : students1.keySet()) {
            Integer eachValue=students1.get(eachKey);

            if (eachValue>85){
                earlyBirds.put(eachKey,eachValue);
            }else {
                angryBirds.put(eachKey,eachValue);
            }

        }
        System.out.println("EarlyBirds :  "+earlyBirds);
        System.out.println("AngryBirds :  "+angryBirds);


    }
}
