package Day04_Variables;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Concate_VS_Addition {
    public static void main(String[] args) {

        // addition:  number+number
        System.out.println(12+13); // i'll get 25
        System.out.println('A'+2); // 'A'=65 + 2 I'll get 67 because its addition
        System.out.println('A'+'B');// I'll get 'A'=65 'B'=66 =131

        System.out.println("=======================================");


        // Concatenation; Append
        System.out.println("12"+13); //"12"= String text 13=number I'll get 1213
        System.out.println("A"+2);  // I'll get same result= A2
        System.out.println("Gender: "+'M'); // Gender:M

        System.out.println('a'+'b'+'C');








    }


}
