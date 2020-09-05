package Day51_Exceptions;

class A{

    public void method(){

    }

}

public class MethodOverloading extends A{

    @Override // if no compile error means  this method overridden
    public void method(){

    }

    @Override
    public String toString() {
        return "MethodOverloading{}";
    }
}
