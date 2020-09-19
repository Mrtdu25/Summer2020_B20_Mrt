package Day54_Abstraction.AnimalTask;

public abstract class Animal {

    public String name;
    public int age;
    final public String color;
    final public char gender;
    final String breed;

    public Animal(String name,int age,String color,char gender,String breed){
        this.name=name;
        this.age=age;
        this.color=color;
        this.gender=gender;
        this.breed=breed;
    }

    protected abstract void eat();
    public abstract void sleep();

    public String toString(){
        return "Name: "+name+", Breed: "+breed+", Color: "+color+", Gender: "+gender+" Age: "+age;
    }

}
