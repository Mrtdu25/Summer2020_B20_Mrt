package Day60_Collection.mrt;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueeInterface {
    public static void main(String[] args) {

        Queue<Integer> q1=new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Integer fifo1 = q1.poll();
        System.out.println(fifo1);
        q1.poll();//FIFO 1
        q1.poll();//FIFO 2
        q1.poll();//FIFO 3
        System.out.println(q1);





    }
}
