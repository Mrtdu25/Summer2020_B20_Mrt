package Day61_Maps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practice_Mrt {
    public static void main(String[] args) {

        Map<String, LocalDate> students=new LinkedHashMap<>();
        students.put("John", LocalDate.of(1990,5,4));
        students.put("Malik", LocalDate.of(1989,6,5));
        students.put("Raven", LocalDate.of(1988,7,10));
        students.put("Srii", LocalDate.of(1970,8,12));
        students.put("Antony", LocalDate.of(1984,9,14));
        students.put("Mistiko", LocalDate.of(1987,10,11));

        System.out.println(students);

        for (String eachKey : students.keySet()) {
            if (eachKey.length() >5){
                System.out.println(eachKey);
            }
        }

        for (LocalDate eachValue : students.values()) {
            if (eachValue.isAfter(LocalDate.of(1989,4,29))){
                System.out.println(eachValue);
            }
        }

        System.out.println("===========================================================");






    }
}
