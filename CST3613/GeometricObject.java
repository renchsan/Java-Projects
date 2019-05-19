

public abstract class GeometricObject {
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	// Construct a geometric object with color and filled values
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	// Return color
	public String getColor() {
		return color;
	}
	
	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}
	
	// Return if Object is filled or not
	public boolean isFilled() {
		return filled;
	}
	
	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	// get date created
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	@Override
	public String toString() {
		return "Created on " +dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
}