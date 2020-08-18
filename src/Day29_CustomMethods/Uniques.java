package Day29_CustomMethods;
 /*Write a program that can print out the unique values from a String Array
         Ex:
         if arr -> {"A", "A", "B", "C", "C"}
         output: B
         if arr -> {"A", "B", "B", "C"}
         output:  A
         C*/

public class Uniques {
    public static void main(String[] args) {

        String[] arr={"A", "B", "B", "C","D"};
for (String a:arr){
    int count=0;
    for( String each:arr){
        if (a.equals(each)){
            count+=1;
        }

    }
    if (count==1){
        System.out.println(a);
    }
}







    }

}
