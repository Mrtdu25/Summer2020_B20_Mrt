package Day48_Inheritance.AnimalTask;

public class Bird extends Animal {
    //sing fly


    public Bird(String name,String size,int age,char gender,String breed,double weight) {
        setInfo(name,size,age,gender,breed,weight);
    }

    public void sing(){
        System.out.println(name+" singing");
    }

}
