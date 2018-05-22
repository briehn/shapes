package Shapes;


public abstract class Shape {
	/**
	 * The name of this shape
	 */
	protected String name;

	/**
	 * Constructs a shape with default name.
	 */
	public Shape() {
		// TODO Auto-generated constructor stub
		this.name = "shape";
	}

	/**
	 * Constructs a shape with a specific name.
	 * 
	 * @param name
	 *            The name of this shape
	 */
	public Shape(String name) {
		this.name = name;
	}

	/**
	 * Changes this shape's name.
	 * 
	 * @param name
	 *            A string specifying the name of this shape
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the name of this shape.
	 * 
	 * @return A string specifying the name of this shape
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns a string representation of this shape containing the type * and
	 * hidden values.
	 * 
	 * @return A string representation of this shape
	 */
	public String toString() {
		return "Shape name is " + this.name;
	}

	/**
	 * Indicates if this shape is "equal to" some other object. If the other object
	 * is not a shape, return false. If the other object is a shape, and has the
	 * same name, return true.
	 * 
	 * @param obj
	 *            An Object reference to a specific object
	 * @return A boolean value specifying whether this shape is equal to some other
	 *         object
	 */

	public boolean equals(Object obj) {
		// If the other object is not a shape
		if (!(obj instanceof Shape))
			return false;

		// If the other object is a shape
		Shape other = (Shape) obj;
		return this.name.equalsIgnoreCase(other.name);
	}
	
	/*
	 * Returns the area of this shape
	 * @return The area of this shape
	 */
	public abstract double area();

}