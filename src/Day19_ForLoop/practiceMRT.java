package Day19_ForLoop;

public class practiceMRT {
    public static void main(String[] args) {

        //odd



        for (int t=1; t<=1905; t+=11) {
            if (t%3==0&&t%5==0){
                System.out.print(t+" ");

            }

        }
        System.out.println();
        System.out.println("=======================");
//even


        for (int y=0; y<=1453; y+=13){
            if (y%2==0){
                if (y%3==0 && y%5==0){
                    System.out.print(y+" ");

                }
            }
        }

        System.out.println();
        System.out.println("=========================================");

        int sumOfEven=0;


        for (int u=1; u<=100; u++){
            if (u%2==0){
                sumOfEven+=u;
            }
        }
        System.out.println(sumOfEven);

        System.out.println("=======================");
        int sumOfOdd=0;
        for (int i=1; i<+1905; i++){
            if (i%2!=0) {
                sumOfOdd += i;
            }
        }
        System.out.println(sumOfOdd);


        System.out.println("++++++++++++++++++++++++");

        //continue Odd

        for (int t=1; t<=50; t++){
            if (t%2==0){
                continue;  //means skip it
            }
            System.out.print(t+" ");
        }
        System.out.println();
        System.out.println("-----------------------");
       //continue Even

       for (int e=0; e<=50; e++ ){
           if (e%2!=0){
               continue; //means skip it
           }
           System.out.print(e+" ");
       }

    }
}
