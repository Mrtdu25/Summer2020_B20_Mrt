package Day46_ConstructorCalls;

import javax.jws.soap.SOAPBinding;

public class ConstructorCalls4 {

    public ConstructorCalls4(){

        System.out.println("A");
    }

    public ConstructorCalls4(int a){
     // this(3.5);
        System.out.println("B");
    }

    public ConstructorCalls4(double a){
        this();
        System.out.println("C");
    }




}
