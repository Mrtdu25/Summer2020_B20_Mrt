package Day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Times {
    public static void main(String[] args) {

        LocalTime t1 = LocalTime.of(23, 55,55);
        System.out.println(t1);

        LocalTime t2 = LocalTime.now();
        System.out.println(t2);

        LocalDateTime t3 = LocalDateTime.of(2020, 07,25,15,25);

        System.out.println(t3);

        LocalDateTime t4 = LocalDateTime.now();

        System.out.println(t4);

        System.out.println("========================");
      //mrt

        LocalTime mrt=LocalTime.of(9,05,05);
        System.out.println(mrt);

        LocalTime mrt1=LocalTime.now();
        System.out.println(mrt1);

        LocalDateTime mrt3=LocalDateTime.of(2020,04,29,9,20);
        System.out.println(mrt3);

        LocalDateTime mrt4=LocalDateTime.now();
        System.out.println(mrt4);


        DateTimeFormatter mrtDateFormat=DateTimeFormatter.ofPattern("dd,MM,yyyy");
        LocalDate mrtt=LocalDate.of(1905,05,05);
        System.out.println(mrtDateFormat.format(mrtt));

    }
}
