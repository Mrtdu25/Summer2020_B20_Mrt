package Day33_LocalDateTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        // 1
        LocalDate DOB= LocalDate.of(1989,04,29);
        System.out.println(DOB);

        //2
        LocalDate today=LocalDate.now();
        System.out.println(today);

        System.out.println("========================");

        LocalDate mrt=LocalDate.of(1989,04,29);
        System.out.println(mrt);

        LocalDate mrt1=LocalDate.now();
        System.out.println(mrt1);




    }
}
