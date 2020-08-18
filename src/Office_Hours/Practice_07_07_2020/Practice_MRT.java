package Office_Hours.Practice_07_07_2020;


public class Practice_MRT {
    public static void main(String[] args) {
        String mdh="MuratDuaaHamid";
        String result="";
    for (int i=mdh.length()-1; i>=0; i--){
        result+=mdh.charAt(i);


    }
    String result2="";
        System.out.println(result);

        System.out.println("================================");

        int j=result.length()-1;
   while ( j>=0 ){
        result2+=result.charAt(j);
            j--;
    }
        System.out.println(result2);


    }
}
