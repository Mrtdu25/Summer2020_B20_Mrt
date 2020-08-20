package Day44_Constructor;

public class DogPark {

    static Dog dog1;
    static Dog dog2;
    static Dog dog3;



    static {

        dog1=new Dog("Max",'M',"Pitbull","Medium",3,"Grey");
        dog2=new Dog("Karabas",'F',"Malakli","Big",5,"Black&White");
        dog3=new Dog("Sarikiz",'F',"Kafkas","Big",4,"yellowish");

    }

}