import java.util.Scanner;

public class project01 {

    	public static void main(String[] args) {
    		Scanner input = new Scanner(System.in);
    		
        System.out.println("Enter three sides of the Triangle");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        input.nextLine();
        ComparableTriangle triangle = new ComparableTriangle(side1, side2, side3);

        System.out.println("Enter color of the Triangle");
        String color = input.nextLine();
        triangle.setColor(color);

        System.out.println("Set Triangle to filled? Answer True or False");
        boolean filled = input.nextBoolean();
        triangle.setFilled(filled);
        
       	System.out.println("The Triangle's Area is " + triangle.getArea());
       	System.out.println("The Triangle's Perimeter is " + triangle.getPerimeter());
		System.out.println("The Triangle's Color is " + triangle.getColor());


		System.out.println("Is the Triangle filled? " + triangle.isFilled());
        	
		System.out.println("The Triangle Sides are \n Side 1: "
				+ triangle.getSide1() + "\n Side 2: " + triangle.getSide2() 
		        + "\n Side 3: " + triangle.getSide3());

		ComparableTriangle triangleClone = (ComparableTriangle)triangle.clone();

		ComparableTriangle[] triangles = {
		        triangle, triangleClone};


		java.util.Arrays.sort(triangles);

		for (ComparableTriangle tri: triangles) {
		    System.out.println(tri + " ");
		    System.out.println();

        }
	}
}
