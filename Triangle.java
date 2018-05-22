package Shapes;

public class Triangle extends Shape {
	
	private double sideOne;
	private double sideTwo;
	private double sideThree;
	
	
	public Triangle() {
		super(); // Calls super constructor to set up parent's part
		
		this.name = "Triangle";
		this.sideOne = 1.0;
		this.sideTwo = 1.0;
		this.sideThree = 1.0;
	}



	public Triangle(String name, double sideOne, double sideTwo, double sideThree) {
		try {
			 if (sideOne + sideTwo > sideThree){
				 /*if an valid triangle can be formed with sideOne, sideTwo, and sideThree
			 Set up the name of this triangle.
			 Form this triangle.*/
				 this.name = name;
				 this.sideOne = sideOne;
				 this.sideTwo = sideTwo;
				 this.sideThree = sideThree;
			 } else {
				 throw (new InvalidTriangleException("The sum of side one and side two must be greater than side three."));
			 }
			} catch (InvalidTriangleException ex){
			 //Handle InvalidTriangelException.
				ex.printStackTrace();
			} catch (Exception ex){
				ex.printStackTrace();
			}
	}


	/**
	 * @return the sideOne
	 */
	public double getSideOne() {
		return sideOne;
	}

	/**
	 * @param sideOne the sideOne to set
	 */
	public void setSideOne(double sideOne) {
		try{
			 if (sideOne + this.sideTwo > this.sideThree){
				 this.sideOne = sideOne;
			 } else {
				 throw (new InvalidTriangleException("The sum of side one and side two must be greater than side three."));
			 }
			} catch (InvalidTriangleException ex){
				ex.printStackTrace();
			} catch (Exception ex){
				ex.printStackTrace();
			}
	}



	/**
	 * @return the sideOne
	 */
	public double getSideTwo() {
		return sideTwo;
	}



	/**
	 * @param sideOne the sideOne to set
	 */
	public void setSideTwo(double sideTwo) {
		try{
			 if (this.sideOne + sideTwo > this.sideThree){
				 this.sideTwo = sideTwo;
			 } else {
				 throw (new InvalidTriangleException("The sum of side one and side two must be greater than side three."));
			 }
			} catch (InvalidTriangleException ex){
				ex.printStackTrace();
			} catch (Exception ex){
				ex.printStackTrace();
			}
	}

	
	/**
	 * @return the sideOne
	 */
	public double getSideThree() {
		return sideThree;
	}



	/**
	 * @param sideOne the sideOne to set
	 */
	public void setSideThree(double sideThree) {
		try{
			 if (this.sideOne + this.sideTwo > sideThree){
				 this.sideThree = sideThree;
			 } else {
				 throw (new InvalidTriangleException("The sum of side one and side two must be greater than side three."));
			 }
			} catch (InvalidTriangleException ex){
				ex.printStackTrace();
			} catch (Exception ex){
				ex.printStackTrace();
			}
	}


	@Override
	public double area() {
		double sp = (sideOne + sideTwo + sideThree) / 2;
		double area = Math.sqrt(sp * (sp - sideOne) * (sp - sideTwo) * (sp - sideThree));
		
		return area;
	}
	


	@Override
	public String toString() {
		return super.toString() + "\nsideOne: " + this.sideOne + "\nsideTwo: " + this.sideTwo +  "\nsideThree: " + this.sideThree + "\narea: " + area();
	}

	
	public boolean equals(Object obj) {
		
		if(! (obj instanceof Triangle) ) {
			return false;
		}
		
		Triangle other = (Triangle) obj;
		
		// calls equals in Shape.
		// return this.name == other.name && this.sideOne == other.sideOne && this.sideOne==other.sideOne;
		return super.equals(other) && this.sideOne == other.sideOne && this.sideTwo == other.sideTwo && this.sideThree == other.sideThree;
		
		
	}
}