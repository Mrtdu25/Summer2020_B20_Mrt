package Day05_AritmethicOperators;

public class EmployeeInfo2 {
    public static void main(String[] args) {
//firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
        String firstName = "Aaron";
        String lastName = "Jones";
        int age = 45;
        String companyName = "CapitalOne";
        char gender = 'M';
        String jobTitle = "QA";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120_000.50;

        String fullName= firstName+" "+lastName;

        System.out.println("Employee' full name is: " + fullName );
        System.out.println( fullName+ "'s gender is: "  + gender );
        System.out.println( fullName+"'s age is: " + age + " years old" );
        System.out.println( fullName + " works at: "+companyName );
        System.out.println(fullName+"'s job title is: " + jobTitle);
        System.out.println(fullName+"'s salary is: $"+salary );
        System.out.println( fullName+" is full time employee: "+ isFullTime);
        System.out.println( fullName+" is married: " + isMarried);



    }

}




















