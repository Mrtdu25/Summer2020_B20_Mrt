package Day28_Recap;

import java.util.Arrays;

public class MultiD_Array_Practice1 {
    public static void main(String[] args) {


        String[] Group1 = {"Murat", "Duaa", "Hamid"};
        String[] Group2 = {"Ali", "Thikra", "Hassuni"};
        String[] Group3 = {"Gulsen", "Ibrahim", "Mrt"};

        String[][] family ={Group1,Group2,Group3};
        System.out.println(Arrays.deepToString(family));

        for (int i=0; i<=family.length-1; i++){
            String[] eachGroup=family[i];

            for (int j=0; j<=eachGroup.length-1; j++){
                String eachStudent=eachGroup[j];
                if (eachStudent.toLowerCase().contains("m")) {


                    System.out.println(eachStudent + " ");
                }
            }
            System.out.println();
        }
        System.out.println("======================================");

    }
}
