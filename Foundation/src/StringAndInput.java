import java.util.Scanner;

public class StringAndInput {
    public static void main(String[] args) {
        int age  = 15;
        String firstName = "Sekou";
        String lastName = "Dosso";
        char firstChar;
        String middleName;

        System.out.println("Current student first name : "+firstName+
                " last name: "+lastName+ " and  he is : "+age+" old.");

        System.out.println("Please enter Current student middle name : ");

        Scanner input = new Scanner(System.in);
        middleName = input.next();  //string

        System.out.println("Current student full name : "+firstName+
                " "+middleName+" "+lastName);

        System.out.println("first chart of current student first name : "+firstName.charAt(0));

    }
}
