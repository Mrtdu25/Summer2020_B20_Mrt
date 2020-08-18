package Day04_Variables;
/*
SSN no = int
Gender= Char
First name= String
last name=string
age= int
country=
Is Employeed = boolean
 */


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.sql.rowset.FilteredRowSet;

public class PersonnalInfo {
    public static void main(String[] args) {

        String SSN= "141-142-143";
        String FirstName="Murat";
        String LastName="DEGIRMENCI";
        byte age= 31;
        String Country="Turkey";
        char Gender= 'M';
        boolean IsEmployeed= false;

        System.out.println("SSN: "+SSN);
        System.out.println("First Name: "+ FirstName);
        System.out.println("Last Name: "+LastName);
        System.out.println("Age: "+age);
        System.out.println("Country: "+"country");
        System.out.println("Gender: "+Gender);
        System.out.println("Employeed:"+IsEmployeed);


        System.out.println("Result A"+0+1);
        System.out.println("Result B"+ (1) + (2));

        System.out.println("5+2-"+3+4);
        System.out.println("5+2-"+(3+4));

        int a = 3,  b = 2;

        long c = (a+b) * 2 / 3 % 2 ;

        System.out.println(c);

        System.out.println(10/3);

        System.out.println (  (int)(10.0/3)   );

        System.out.println (  10/3.0  );

    }




}
