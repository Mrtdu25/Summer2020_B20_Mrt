package Day24_Arrays;

public class UniqueWords {
    public static void main(String[] args) {

        String[] words={"C#","C#","Java","Pyton","C++"};

    for (int j=0; j<=0; j++) {

        String s = words[j];
        int count = 0;

        for(int i = 0; i <= words.length - 1; i++) {
            String each = words[i];
            if (s.equals(each)) {
                count++;
            }
        }
        if (count==1) {
            System.out.println(s);
        }
    }


    }
}
