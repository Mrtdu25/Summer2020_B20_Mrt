package Day47_Encapsulations;

public class Constructor {

    public Constructor(){
        System.out.println("Default");  // DEFAUL

    }

    public Constructor(int a){
        this();
        System.out.println("int");
    }

    public Constructor(String str){
        System.out.println("String");
    }

    public Constructor(double b){
        this(5);
        System.out.println("double");
    }


    public static void main(String[] args) {

        new Constructor(10.5);
    }


}
