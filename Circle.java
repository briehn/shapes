package Shapes;

public class Circle extends Shape {
	
	private double radius;
	
	
	public Circle() {
		super(); // Calls super constructor to set up parent's part
		
		this.name = "Circle";
		this.radius = 1.0;
	}



	public Circle(String name, double radius) {
		super(name); // Calls super constructor to set up parent's part
		
		this.radius = radius;
	}


	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}



	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	


	@Override
	public String toString() {
		return super.toString() + "\nradius: " + this.radius + "\narea: " + area();
	}

	
	public boolean equals(Object obj) {
		
		if(! (obj instanceof Circle) ) {
			return false;
		}
		
		Circle other = (Circle) obj;
		
		// calls equals in Shape.
		// return this.name == other.name && this.length == other.length && this.width==other.width;
		return super.equals(other) && this.radius == other.radius;
		
		
	}
}