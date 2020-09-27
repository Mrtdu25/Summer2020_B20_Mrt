package Day58_Polymorphism;

import Day57_Polymorphism.PhoneTask.Huawei;
import Day57_Polymorphism.PhoneTask.Iphone;
import Day57_Polymorphism.PhoneTask.Phone;
import Day57_Polymorphism.PhoneTask.Samsung;

public class DownCasting_Practice {
    public static void main(String[] args) {

        Phone phone1=new Iphone("12","6.7",1200);
        Iphone iphone1=(Iphone)phone1;
        iphone1.faceTiming(14563289);
        iphone1.texting(745896321);
        iphone1.calling(15975364);

        Phone phone2=new Samsung("S20","6.9",1000);
        ((Samsung)phone2).freezing();  //first
        Samsung samsung1=(Samsung)phone2;  //second way
        samsung1.freezing();


        Phone phone3=new Huawei("PXT30","5.3",200);
        ((Huawei)phone3).stealInfo();

        Huawei huawei1=(Huawei) phone3;


    }
}
