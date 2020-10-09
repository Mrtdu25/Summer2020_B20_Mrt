package Day61_Maps;

import com.sun.org.apache.bcel.internal.generic.LNEG;
import sun.awt.image.ImageWatched;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String ,Double> employee=new LinkedHashMap<>();
        //            Key      value            Key cannot be duplicate Value can be duplicate
        employee.put("Murat",125000.50);
        employee.put("Duaa",105000.60);
        employee.put("Hamid",135000.70);
        employee.put("Hassuni",100000.70);
        employee.put("Kemal",103000.70);

        System.out.println(employee);
        System.out.println(employee.size());

        System.out.println(employee.get("Murat"));
        employee.remove("Duaa");

        System.out.println(employee);

        boolean r1 = employee.containsKey("Murat");
        System.out.println(r1);

        boolean r2 = employee.containsValue(103000.70);
        System.out.println(r2);

        employee.clear();
        System.out.println(employee);

        boolean empty = employee.isEmpty();

        System.out.println(empty);


    }
}
