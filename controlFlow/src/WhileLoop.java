import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("Please  enter a number : ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while(number>0){
            System.out.println("current number: "+number);
            number -= 1;
        }

    }
}
