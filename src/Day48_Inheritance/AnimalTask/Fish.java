package Day48_Inheritance.AnimalTask;

public class Fish extends Animal {
    // gills swim

    public Fish(String name,String size,int age,char gender,String breed,double weight){
        setInfo(name,size,age,gender,breed,weight);
    }

    public void swim(){
        System.out.println(name+" is swimming");
    }

    public void gills(){
        System.out.println(name+" is gills");
    }

}
