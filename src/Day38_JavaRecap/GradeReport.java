package Day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(100,90,85,75,95,45,73,73,65,47,60,87,77,57,65,98,32,94,65,81,71,65,86,67,85,86));

        ArrayList<Integer> gradeA=new ArrayList<>();
        gradeA.addAll(list);
        gradeA.removeIf(each->each<90);
        System.out.println("Grade A: "+gradeA);

        ArrayList<Integer> gradeB=new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeIf(p->p<80 || p>89 );
        System.out.println("Grade B: "+gradeB);

        ArrayList<Integer> gradeC=new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf(m->m<70||m>79);
        System.out.println("Grade C: "+gradeC);

        ArrayList<Integer> gradeD=new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf(k->k<60||k>69);
        System.out.println("Grade D: "+gradeD);

        ArrayList<Integer> gradeF=new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeIf(m->m>59);
        System.out.println("Grade F: "+gradeF);

        System.out.println(gradeA.size()+" Students made A");
        System.out.println(gradeB.size()+" Students made B");
        System.out.println(gradeC.size()+" Students made C");
        System.out.println(gradeD.size()+" Students made D");
        System.out.println(gradeF.size()+" Students made Failed");

    }

}
