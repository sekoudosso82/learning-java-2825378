
import java.util.Scanner;
public class ScopeInJava {
    public static void main(String[] args) {
        System.out.println("please pick a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        String globalVar = "WIN";
        String globalVar2 = "LOSE";

        if (num < 10){
            System.out.println(globalVar);
        } else {
            System.out.println(globalVar2);
        }
    }

}
