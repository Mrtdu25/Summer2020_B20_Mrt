package Day51_Exceptions;
class X{
    public X(){
        System.out.println("X");
    }
}

class Y extends X{
    public Y(){
        //super(); X AND Y
        System.out.println("Y");
    }
}

class Z extends Y{
    // super(); X -Y-Z
    public Z(){
        System.out.println("Z");
    }
}


public class Practice {


}
