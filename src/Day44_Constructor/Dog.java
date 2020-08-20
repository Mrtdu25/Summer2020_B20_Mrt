package Day44_Constructor;

public class Dog {
    String name;
    char gender;
    String breed;
    String size;
    int age;
    String color;
    static String  isEating="";
    static String  isDrinking="";


    public Dog (String name,char gender,String breed,String size,int age,String color){
        this.name=name;
        this.gender=gender;
        this.breed=breed;
        this.size=size;
        this.age=age;
        this.color=color;
    }

    static { isDrinking="";
             isEating="";    }

    public String toString(){

        return "Name: "+name+"\nGender: "+gender+"\nBreed: "+breed+
                "\nSize: "+size+"\nAge: "+age+"\nColor: "+color;

    }



}
