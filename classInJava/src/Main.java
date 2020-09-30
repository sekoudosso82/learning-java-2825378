public class Main {
    // main function
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(10,2,3,4,5);
        Triangle triangle2 = new Triangle(5,2,1,2,1);

        // use each instance to findArea method

        double triangle1Area = triangle1.findArea();
        double triangle2Area =  triangle2.findArea();

        System.out.println("This triangle area is: "+ triangle1Area);

        System.out.println("This triangle area is: "+ triangle2Area);

        // access instance attribute
        System.out.println("This triangle1 base is: "+triangle1.base);
        System.out.println("This triangle2 base is: "+ triangle2.base);

        // access class attribute
        System.out.println("This is triangle class variable numofSides: "+ Triangle.numOfSides);






    }

}
