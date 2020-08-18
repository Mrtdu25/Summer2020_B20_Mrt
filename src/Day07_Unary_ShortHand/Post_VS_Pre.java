package Day07_Unary_ShortHand;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.jws.soap.SOAPBinding;

public class Post_VS_Pre {
    public static void main(String[] args) {

        //pre
        int a=10;
        System.out.println(++a);// 11  immediately
        System.out.println(a); //11


        System.out.println("==================================");

        //post
        int b =10;
        System.out.println(b++);// 10 not immediately
        System.out.println(b);// 11

        System.out.println("=============================");

        int c=25;
        int d=c++;
        System.out.println(d); // 25 because past version
        System.out.println(c);//26 it applies next level

        System.out.println("=================================");

        int e=25;
        e++;
        System.out.println(e);


        //TASK1

        int x=8;
        int y=x--;
        System.out.println(y);
        System.out.println(x);// 7


        //TASK2
       int t =2;
       int k=t++;
        System.out.println(k);
        System.out.println(t);

        //TASK 3

        int A=1;
        A=-A-- + A++/ -A-- * --A;

        // A= -1    + 0 / -1 * -1

        // A = -1 +0* -1
          // A= -1 +0 = -1
        System.out.println(A);

        // TASK 4

        int h=50;

        h= --h + h++ + h-- + h++;

        //H= 49 + 49 + 50 + 49
        //H= 197


        System.out.println(h);

        // TASK 5

        int m =4;
        int l = m *4 - m++;
        System.out.println(l);
        //l = 4*4-4
        // l=16-4 =12


        //Self study 1

        int r=60;
        r= (--r + r++ - --r + r++) * 2;//(59+59-58+58)*2
        //118*2=236
        System.out.println(r);

        //Self study 2

        double p=25;
        p= (p++ + p++ + --p - p-- )* p/2+29;
        //(25+26+25-25)*12+29
        //(76-25)*12+29
        //51*12.5+29
        //637.5+29=666.5
        System.out.println(p);

        int Melih=17;
        Melih=(Melih++ -++Melih+Melih--);
//             17 -18 +18
        System.out.println(Melih);

        int H= 6;
         H= (++H * --H + H++-H/3);
            //7  *   6 + 6 - 6/3
            //7  *   6 + 6 - 2
            //  42 + 6 - 2
            //48-2=46
        System.out.println(H);
    }


}
