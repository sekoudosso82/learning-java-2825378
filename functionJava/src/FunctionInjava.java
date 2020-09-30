import java.util.Scanner;

public class FunctionInjava {
    // define the function with no parameters
    public static void function1(){
        System.out.println("Waiting for developer tea time: ");
        System.out.println("Type in a random number and press Enter key.");
        Scanner input1 = new Scanner(System.in);
        int number = input1.nextInt();
        System.out.println("It's developer tea time");
    }
    // function with parameters
    public static void calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax ;
        System.out.println("Your total price is: "+ result);
    }
    // function with parameters and return
    public static double returnTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax ;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job");
        // call the function1
        function1();
        System.out.println("Write code");
        System.out.println("Review code");

        // call the function
        function1();

        System.out.println("Get promoted");


        // call calculateTotalMealPrice
        System.out.println("call calculateTotalMealPrice");
        calculateTotalMealPrice(15, .2, .08);
        System.out.println();
        System.out.println("call calculateTotalMealPrice with diff parameters");
        calculateTotalMealPrice(20, 1, .8);

        // call function with parameters and return
        // assign the return val to a new variable
        double groupTotalPrice = returnTotalMealPrice(20, 1, .8);

        // compute individual contribution

        double individualMealPrice = groupTotalPrice/5;
        System.out.println("individual price is: "+individualMealPrice);


    }
}
