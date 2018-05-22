package Shapes;

public class RectangleDriver {

	public static void main(String[] args) {
		String r1Name;
		double r1Length, r1Width, r1Area;
		
		 //Create at least two Rectangle objects.
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle("Rectangle 2", 3,3);
		
		 //Retrieve the name of first Rectangle, store it in memory, and print it.
		r1Name = r1.getName();
		System.out.println(r1Name);
		
		 //Retrieve the length of first Rectangle, store it in memory, and print it.
		r1Length = r1.getLength();
		System.out.println(r1Length);
		
		//Retrieve the width of first Rectangle, store it in memory, and print it.
		r1Width = r1.getWidth();
		System.out.println(r1Width);
		
		//Change the name of the first rectangle.
		r1.setName("Rectangle 1");
		
		//Retrieve the name of the first rectangle, store it in memory, and print it.
		r1Name = r1.getName();
		System.out.println(r1Name);
		
		 //Change the length of the first rectangle.
		r1.setLength(5);
		
		 //Retrieve the length of the first rectangle, store it in memory, and print it.
		System.out.println(r1Length);
		
		 //Change the width of the first rectangle.
		r1.setWidth(5);
		
		 //Retrieve the width of the first rectangle, store it in memory, and print it.
		System.out.println(r1Width);
		
		 //Calculate the area of the first rectangle, stored in in memory, and print it.
		r1Area = r1.area();
		System.out.println(r1Area);
		
		 //Print first rectangle.
		System.out.println(r1.toString());
		
		 //Print other rectangle objects.
		System.out.println(r2.toString());
		
		 //Compare the first rectangle with itself, print the results.
		System.out.println(r1.equals(r1));
		
		 //Compare the first rectangle with another rectangle, print the results.
		System.out.println(r1.equals(r2));

	}

}
