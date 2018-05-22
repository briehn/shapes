package Shapes;

public class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	
	
	public Rectangle() {
		//super(); // Calls super constructor to set up parent's part
		
		this.name = "Rectangle";
		this.length = 1.0;
		this.width = 1.0;
	}



	public Rectangle(String name, double length, double width) {
		super(name); // Calls super constructor to set up parent's part
		
		this.length = length;
		this.width = width;
	}

	


	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}



	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}



	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}



	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}
	


	@Override
	public String toString() {
		return super.toString() + "\nlength: " + this.length + "\nwidth: " + this.width + "\narea: " + area();
	}

	
	public boolean equals(Object obj) {
		
		if(! (obj instanceof Rectangle) ) {
			return false;
		}
		
		Rectangle other = (Rectangle) obj;
		
		// calls equals in Shape.
		// return this.name == other.name && this.length == other.length && this.width==other.width;
		return super.equals(other) && this.length == other.length && this.width==other.width;
		
		
	}
}