import java.util.Scanner;

public class InputOupt {
    public static void main(String[] args) {
        int studentAge = 14;
        double studentGpa = 3.5;
        String  studentFirstName = "Sekou";
        String  studentLastName = "Dosso";

        System.out.println("studentAge: "+ studentAge);
        System.out.println("studentGpa: "+ studentGpa);
        System.out.println("studentFirstName: "+ studentFirstName);
        System.out.println("studentLastName: "+ studentLastName);


        System.out.println(studentFirstName+" "+studentLastName+ " is "+studentAge+ " old.");
        System.out.println(studentFirstName+" "+studentLastName+ " gpa is "+studentGpa+ ".");
        System.out.println("please enter the new gpa of "+studentFirstName+" "+studentLastName+ " : ");

        Scanner input = new Scanner(System.in);
        studentGpa = input.nextDouble();

        System.out.println(studentFirstName+" "+studentLastName+ " new gpa is "+studentGpa+ ".");


    }
}
