package Office_Hours.Practice_07_15_2020;

public class FrequencyOfWords2 {
    public static void main(String[] args) {

        String str="javajavaJavajavajaVa";
       str= str.toLowerCase();
        int countJava=0;

        while(str.contains("java")){
            countJava++;
            str=str.replaceFirst("java","");
        }

        System.out.println(countJava);
    }
}
