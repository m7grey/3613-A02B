
class Triangle extends GeometricObject {

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }


    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }


    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    //  Triangle Full Description
    public String toString() {
        return "Summary of Triangle: side 1 = " + side1 + " side 2 = " + side2 +
                " side 3 = " + side3 + " || The color is : " + getColor() +
                " || Is Filled? " + isFilled();
    }
    @Override
    public void howToColor(){
        System.out.println("Triangle: Color 3 sides");
    }
}

