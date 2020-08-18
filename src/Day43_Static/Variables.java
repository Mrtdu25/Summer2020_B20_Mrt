package Day43_Static;

public class Variables {

    int d;   // instance variable belongs to the object

    static  int s;   // belongs to the class

    public void method2(){
        System.out.println(d); // instance method always except instance variable
        System.out.println(s);
    }

    public static void main(String[] args) {
        //System.out.println(a);
        System.out.println(s);

       // System.out.println(d); static does not accepts instance  only way create an object

        Variables obj =new Variables();
        System.out.println(obj.d);

    }

    public static void method1(){

        int a;      // local variable we should initialize

        if(true){
            int b=20;
        }

    }



}

