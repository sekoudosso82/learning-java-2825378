public class ConcatenatingString {
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


    }
}
