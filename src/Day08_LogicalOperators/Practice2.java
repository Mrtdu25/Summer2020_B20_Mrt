package Day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {

        String firtName="Khabib";
        String lastName="Legend";
        String fullname=firtName+" "+lastName;

        int age=31;
        String citizen1="USA";
        String citizen2="Turkey";
        boolean eligibleAge=age>=18;// 12>=18 ==> false
        boolean usCitizen=citizen1=="USA" ||citizen2=="USA";// citizen1=true citizen2=false but || you llget TRUE
        boolean eligibleToVote=eligibleAge && usCitizen;// if we have one false result total result willbe false in &&

        System.out.println(eligibleToVote);
        System.out.println(fullname+" is eligible to vote for Trump: "+eligibleToVote);




    }



}
