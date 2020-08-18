package Day29_CustomMethods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.jws.soap.SOAPBinding;

public class MethodPractice_OddEven {
    public static void main(String[] args) {
       Odd1_100();
        System.out.println("Hello");

       Even1_100();
        System.out.println("Hello");
    }
public static void Odd1_100(){
    for (int i=1; i<=100; i+=2){
            System.out.print(i+" ");
    }
    System.out.println();
    }


    public static void Even1_100(){

        for (int i=0; i<=100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
