public class StringIndex {
    public static void main(String[] args) {
        int studentAge = 14;
        double studentGpa = 3.5;
        String  studentFirstName = "Sekou";
        String  studentLastName = "Dosso";
        char studentFirstInitial = 'S';
        char studentLastinitial  = 'D';
        boolean preferedAttendance = true;

        System.out.println("studentAge: "+ studentAge);
        System.out.println("studentGpa: "+ studentGpa);
        System.out.println("studentFirstName: "+ studentFirstName);
        System.out.println("studentLastName: "+ studentLastName);
        System.out.println("studentFirstInitial: "+ studentFirstInitial);
        System.out.println("studentLastinitial: "+ studentLastinitial);
        System.out.println("preferedAttendance: "+ preferedAttendance);

        System.out.println("studentFirstName chart at zero: "+ studentFirstName.charAt(0));
        System.out.println("studentLastName chart at zero: "+ studentLastName.charAt(0));
    }
}
