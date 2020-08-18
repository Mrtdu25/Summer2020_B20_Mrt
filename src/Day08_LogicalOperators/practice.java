package Day08_LogicalOperators;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.jws.soap.SOAPBinding;

public class practice {
    public static void main(String[] args) {

        int age =19;
       String citizenShip="CHINA";

       boolean elegibleToVote= age>=18 && citizenShip=="USA";
        System.out.println(elegibleToVote);

        System.out.println("====================");

        String firtsName ="Murat";
        String lastName ="Degirmenci";
        String fullName=firtsName+" "+lastName;
        int age2 =31;
        String CitizenShip ="USA";
        boolean ElVote = age2>18 && CitizenShip=="USA";
        System.out.println(ElVote);

        System.out.println(fullName + " is eligible to vote :" + ElVote);


        System.out.println("===============================");

        //  ||: or if one result is true the result willbe TRUE

        boolean r8 =true==!false || false==true;
        System.out.println(r8);


        boolean r9=!false==false || true==!false;
        System.out.println(r9);




    }
}
