package Day32_MethodOverloading;

import Library.Util;

public class MethodCalls {
    public static void main(String[] args) {


        String firstName = "MuRAt";
        String lastName = "DeGiRMENCI";
        String fullName;
// 1 FormatName
        fullName=Util.formatFullName(firstName,lastName);
// 2 Uniques
        String uniques=Util.uniques(fullName.toLowerCase());
        System.out.println(uniques);
// 3 Reverse
      String reversedName=Util.reverse(fullName.toLowerCase());
        System.out.println(reversedName);

        System.out.println("======================================");



    }
}
