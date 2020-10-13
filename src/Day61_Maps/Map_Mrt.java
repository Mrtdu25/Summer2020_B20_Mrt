package Day61_Maps;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.util.*;

public class Map_Mrt {
    public static void main(String[] args) {

        Map<String,Integer> employee=new LinkedHashMap<>(); // keeps insertion order
        employee.put("Murat",1453);
        employee.put("Duaa",1071);
        employee.put("Hamid",1905);
        System.out.println(employee.get("Murat"));
        System.out.println(employee.remove("Duaa")); //Duaa
        System.out.println(employee.containsKey("Murat")); //true
        System.out.println(employee.containsValue(1071)); //false  bc duaa removed
        employee.clear(); // clears everything
        System.out.println(employee.size()); // gets the size
        System.out.println(employee.isEmpty()); // checks if empty or not


        System.out.println("=================================================");

        Map<String ,String> countries1=new TreeMap<>(); // always sorts
        countries1.put("Turkey","Ankara");
        countries1.put("Brazil","Brazil");
        countries1.put("USA","Washington");
        countries1.put("Azerbaijan","Baku");
        System.out.println(countries1.get("Turkey"));
        System.out.println(countries1.remove("Brazil")); // Brazil Removed
        System.out.println(countries1.containsKey("Turkey"));
        System.out.println(countries1.containsValue("Brazil"));//false bc Brazil removed

        System.out.println("===================================================");

        Map<String,Integer> tester=new HashMap<>();
        tester.put("Uros",115000);
        tester.put("Murat",120000);
        tester.put("Nikola",125000);
        System.out.println(tester.get("Uros"));
        System.out.println(tester.remove("Uros")); // i removed Uros
        System.out.println(tester.containsKey("Murat")); //true
        System.out.println(tester.containsValue(115000));//false bc Uros removed

        System.out.println("=====================================================");

        Map<Integer,String > cars=new Hashtable<>();
        cars.put(2017,"BMW");
        cars.put(2018,"Mercedes");
        cars.put(2020,"Porsche");
        cars.put(2013,"Toyota");
        System.out.println(cars.get(2017));
        System.out.println(cars.remove(2018)); // Mercedes Removed
        System.out.println(cars.containsKey(2020)); //true we still have Porsche
        System.out.println(cars.containsValue("Mercedes")); // false bc Mercedes removed

        System.out.println("=======================================================");

        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("East Turkistan", "Kashgar");
        countries.put("Uzbekistan", "Tashkent");
        countries.put("Kyrgyzstan","Bishkek");
        countries.put("Spain", "Madrid");
        countries.put("USA", "Washington");
        countries.put("Ukraine", "Kiev");
        countries.put("Azerbaijan", "Karabagh");
        countries.put("Turkey","Ankara");
        countries.put("NH", "Concord");
        countries.put("Asmara", "Eritrea");
        countries.put("Srbija","Beograd");

        for (String eachKey:countries.keySet()){
            String eachValue=countries.get(eachKey);
            System.out.println("Country name is "+eachKey+" Capital is "+eachValue);
        }









    }
}
