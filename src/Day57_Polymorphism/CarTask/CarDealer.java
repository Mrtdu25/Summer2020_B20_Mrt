package Day57_Polymorphism.CarTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CarDealer {

    public static void main(String[] args) {

        Car car1=new BMW("BMW","X5",2019,25000.50,"Black");
        Car car2=new BMW("BMW","M3",2017,37500.45,"Blue");
        Car car3=new Mercedes("Mercedes","E300",2017,33333.33,"White");
        Car car4=new Mercedes("Mercedes","S550",2020,55500.00,"Black");
        Car car5=new Lexus("Lexus","IS300",2016,31500.00,"Gray");
        Car car6=new Lexus("Lexus","is350",2018,37500.50,"Orange");
        Car car7=new Toyota("Toyota","Avalon",2018,18000.50,"Silver");
        Car car8=new Toyota("Toyota","Corolla",2015,16522.25,"Yellow");

        ArrayList<Car> listOfCar=new ArrayList<>();
        listOfCar.addAll(Arrays.asList(car1,car2,car3,car4,car5,car6,car7,car8));

        for (Car eachCar:listOfCar){
            System.out.println(eachCar.model+" "+eachCar.price);
        }






    }
}

