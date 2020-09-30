public class Triangle {
    // class variable
    static int numOfSides = 3;
    // instance variable
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;
    //constructor
    public Triangle(double base, double height,double sideLenOne,
            double sideLenTwo, double sideLenThree){
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree= sideLenThree;

    }
    // non-static methods
    public double findArea(){
        return (this.base * this.height)/2;
    }


}
