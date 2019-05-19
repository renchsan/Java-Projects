public class Square extends GeometricObject implements Colorable{

    private double side1;

    //default constructor
    public Square() {
    }

    public Square(String color, boolean filled, double side1){
        super(color, filled);
        this.side1 = side1;
    }

    // Return side1
    public double getSide() {
        return side1;
    }

    // Return area
    public double getArea() {
        double area = Math.pow(side1, 2);
        return area;
    }

    // Return perimeter
    public double getPerimeter() {
        return side1 * 4;
    }

    // Return  string of triangle
    public String toString() {
        return "Square: side1 = " + side1 + "\nArea: " + getArea();
    }

    public void howToColor() {
        System.out.println("Color all four sides");
    }

}
