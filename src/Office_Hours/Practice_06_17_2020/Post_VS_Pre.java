package Office_Hours.Practice_06_17_2020;

public class Post_VS_Pre {
    public static void main(String[] args) {
        int a =300; //Pre increment
        System.out.println(++a);//301
        System.out.println(++a);//302
        System.out.println("===============================");

      int b =50; //pre decrement
        System.out.println(--b);// 50-1=49
        System.out.println(--b);//49-1=48

        System.out.println("================================");

        int x=40; //post increment
        System.out.println(x--); //40
        System.out.println(x); // 39
        System.out.println(x--);//39
        System.out.println(x);//38

        System.out.println("===================================");

        int y=60; // post decrement
        System.out.println(y++);//60
        System.out.println(y); //61
        System.out.println(y++);//61
        System.out.println(y);  //62

        System.out.println("====================================");



    }
}
