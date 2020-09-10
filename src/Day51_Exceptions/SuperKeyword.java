package Day51_Exceptions;


class Test{
    int a=1905;
}

public class SuperKeyword extends Test{
    int a=1907;

    public void print1(){
        System.out.println(super.a);
    }

    public void print2(){
        System.out.println(a);
    }

    public static void main(String[] args) {

        SuperKeyword obj2=new SuperKeyword();
        obj2.print1();  // 1905
        obj2.print2();  //1907


    }
}
