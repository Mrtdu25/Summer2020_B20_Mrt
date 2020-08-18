package Day24_Arrays;


import java.util.Arrays;

public class Mrt {
    public static void main(String[] args) {

        String sentence="I LOVE JAVA PROGRAMMING";
        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));

        for (int i=words.length-1; i>=0; i--){
            System.out.print(words[i]+" ");
        }
        System.out.println();
        System.out.println("================================");


        String sentence2="I LIKE BOB MARLEY'S NO WOMEN NO CRY SONG";
        String[] word2=sentence2.split(" ");
        System.out.println(Arrays.toString(word2));

        for (int j=word2.length-1; j>=0; j--){
            System.out.print(word2[j]+" ");
        }
        System.out.println();
        System.out.println("=======================================");

        String s="MURAT";
        String[] m=s.split("");
        System.out.println(Arrays.toString(m));

        for (int y=m.length-1; y>=0; y--){
            System.out.print(m[y]+" ");
        }
    }
}
