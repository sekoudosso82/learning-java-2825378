import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        System.out.println("please pick an number between 1 and 10: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number < 5){
            System.out.println("number < 5 ");

        }else if ( number == 5) {
            System.out.println("number is 5");

        }else{
            System.out.println("number > 5");

        }
    }
}
