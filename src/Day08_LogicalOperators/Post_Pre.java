package Day08_LogicalOperators;

public class Post_Pre {
    public static void main(String[] args) {


        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        //b =-200+ -200*  -199%2
        //-200-200*200%2
        //-200 -40000%2
        //-200-0 = - 200
        System.out.println(b);


        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        //3 z=300+400-300*400+300/400;
        // z=300+400-300*400+.75
        //z=300+400-120000.75
        //700-120075=-119,300.75 but because of int well get -19,300
        System.out.println(z);




    }
}
