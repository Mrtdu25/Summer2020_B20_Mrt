package Day23_Arrays;

public class Practice_Mrt {
    public static void main(String[] args) {

        String[]  groceries ={"Pasta","Milk","Eggs","Cucumber","Bread","Tomatoes","Potatoes","Chocolate Cake",};
        int []   quantity=  {2,1,20,10,3,7,5,1};

        for (int m=0; m<=quantity.length; m++){

            System.out.println(groceries[m]+":"+quantity[m]);
        }
    }
}
