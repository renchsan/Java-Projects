/* Matthew Rencher
 * CST3613
 * ComparableTriangle
 * 
 * Use project01 and Triangle class to design ComparableTriangle
 * that implements compareTo method which compares area of two Triangle objects  
 * 
 */

public abstract class ComparableTriangle extends Triangle
		implements Cloneable, Comparable<Triangle> {
	// Construct a Triangle with specific properties
	
	public ComparableTriangle(double side1, double side2, double side3) {
		super(side1, side2, side3);
	}
	
	@Override
	public int compareTo(ComparableTriangle o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
	    return super.toString() + " Area: " + getArea();
	}

    public Object clone() {
	    try {
	        return super.clone();
        }
	    catch (CloneNotSupportedException e){
	        return null;
        }
    }

}
