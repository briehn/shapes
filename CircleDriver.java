package Shapes;

public class CircleDriver {

	public static void main(String[] args) {
		String c1Name;
		double c1Radius, c1Area;
		
		//Create at least two Circle objects.
		Circle c1 = new Circle();
		Circle c2 = new Circle("Circle 2", 5);
		
		 //Retrieve the name of first circle, store it in memory, and print it.
		c1Name = c1.getName();
		System.out.println(c1Name);
		
		 //Retrieve the radius of first circle, store it in memory, and print it.
		c1Radius = c1.getRadius();
		System.out.println(c1Radius);

		 //Change the name of the first circle.
		c1.setName("Circle 1");
		
		 //Retrieve the name of the first circle, store it in memory, and print it.
		c1Name = c1.getName();
		System.out.println(c1Name);
		
		 //Change the radius of the first circle.
		c1.setRadius(3);
		
		 //Retrieve the radius of the first circle, store it in memory, and print it.
		c1Radius = c1.getRadius();
		System.out.println(c1Radius);
		
		//Calculate the area of the first circle, stored in in memory, and print it.
		c1Area = c1.area();
		System.out.println(c1Area);
		
		//Print first circle.
		System.out.println(c1.toString());
		
		//Print other circle objects.
		System.out.println(c2.toString());
		
		//Compare the first circle with itself, print the results.
		System.out.println(c1.equals(c1));
		
		//Compare the first circle with another circle, print the results.
		System.out.println(c1.equals(c2));
		
		//Compare the first circle with a String object, print the results.
		System.out.println(c1.equals("String Object"));

	}

}
