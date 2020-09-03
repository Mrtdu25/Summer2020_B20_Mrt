package Day48_Inheritance.AnimalTask;

public class Dog extends Animal {
    //       sub(child)   super(parent)

    public Dog(String name,String size,int age,char gender,String breed,double weight){
        setInfo(name,size,age,gender,breed,weight);
    }


    public void bark(){
        System.out.println(name+" is Barking");
    }
}
