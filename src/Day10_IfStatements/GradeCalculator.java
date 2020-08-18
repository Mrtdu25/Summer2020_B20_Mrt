package Day10_IfStatements;
/*
grade:
    90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~ 69 ==> D
    otherwise ==> F
 */

public class GradeCalculator {
    public static void main(String[] args) {
////  1st way
int score1=85;

if (score1>=90 && score1<=100){
    System.out.println(score1+" Your grade is A");
}else if (score1>=80 && score1<=89){
    System.out.println(score1+" Your grade is B");
}else if (score1>=70 && score1<=79){
    System.out.println(score1+" Your grade is C");
}else
    System.out.println(score1+" Your grade is F");

        System.out.println("========================================");

////// 2d way

         int score= -305;

        String grade = "";

        if(score >= 90 && score <= 100){ // 90 <= score <= 100
            grade = "You made  A";
        } else if( score >= 80 && score <= 89 ){  // 80 <= score <= 89
            grade = "You made  B";
        } else if(score >= 70 && score <= 79){ // 70 <= score <= 79
            grade = "You made  C";
        } else if(score >= 60 && score <= 69){ // 60 <= score <= 69
            grade = "you made  D";
        } else if(score >= 0 && score <= 59){  // 0<= score <= 59
            grade = "You made F";
        }else{ // score < 0 or score > 100
            grade = "Invalid Score";
        }

        System.out.println(grade);



    }
}
