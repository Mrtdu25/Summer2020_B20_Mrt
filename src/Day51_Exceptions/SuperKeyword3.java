package Day51_Exceptions;

class C{

    public C(int a){
        System.out.println("Super class int arg constructor");
    }
}



public class SuperKeyword3 extends C {

    public SuperKeyword3(int a){
       super(300);
        System.out.println("Sub class int arg constructor");
    }


    public static void main(String[] args) {

        new SuperKeyword3(100);


    }

}
