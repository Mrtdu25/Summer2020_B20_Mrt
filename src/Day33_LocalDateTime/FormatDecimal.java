package Day33_LocalDateTime;
import java.text.DecimalFormat;
public class FormatDecimal {
    public static void main(String[] args) {
        DecimalFormat  m = new DecimalFormat("0.00");

        double a = 22/7.0 ;
        double mrt2=83/4.0;

        System.out.println(a);
        System.out.println( m.format(a)  );
        System.out.println(m.format(mrt2));

        //6.6785432122222222
        System.out.println( m.format(6 ) );

        System.out.println("=================================");

        DecimalFormat mrt=new DecimalFormat("0.00");
        double mrt1 =47/3.0;
        System.out.println(mrt.format(mrt1));




    }
}
