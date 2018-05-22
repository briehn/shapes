package Shapes;

public class TriangleDriver {

	public static void main(String[] args) {
		String t1Name;
		double t1SideOne, t1SideTwo, t1SideThree;
		
		//Create at least two valid Triangle objects.
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle("Triangle 2", 3, 4, 5);
		
		 //Retrieve the name of first triangle, store it in memory, and print it.
		t1Name = t1.getName();
		System.out.println(t1Name);
		
		 //Retrieve side one of first triangle, store it in memory, and print it.
		t1SideOne = t1.getSideOne();
		System.out.println(t1SideOne);
		
		 //Retrieve side two of first triangle, store it in memory, and print it.
		t1SideTwo = t1.getSideTwo();
		System.out.println(t1SideTwo);
		
		 //Retrieve side three of first triangle, store it in memory, and print it.
		t1SideThree = t1.getSideThree();
		System.out.println(t1SideThree);

		 //Change the name of the first triangle.
		t1.setName("Triangle 1");
		
		 //Retrieve the name of the first triangle, store it in memory, and print it.
		t1Name = t1.getName();
		System.out.println(t1Name);
		
	     //Change side one of the first triangle so that a valid triangle will be formed
		 //with the new side one.
		t1.setSideOne(2);
		
		 //Retrieve side one of the first triangle, store it in memory, and print it.
		t1SideOne = t1.getSideOne();
		System.out.println(t1SideOne);
		
		 //Change side one of the first triangle again so that an invalid triangle would
		 //be formed and an exception be thrown.
		t1.setSideOne(0);
		
		 //Change side two of the first triangle so that a valid triangle will be formed
		 //with the new side two.
		t1.setSideTwo(3);
		
		 //Retrieve side two of the first triangle, store it in memory, and print it.
		t1SideTwo = t1.getSideTwo();
		System.out.println(t1SideTwo);
		
		 //Change side two of the first triangle again so that an invalid triangle would
		 //be formed and an exception be thrown.
		t1.setSideTwo(0);
		
		 //Change side three of the first triangle so that a valid triangle will be formed
		 //with the new side three.
		t1.setSideThree(6);
		
		 //Retrieve side three of the first triangle, store it in memory, and print it.
		t1SideThree = t1.getSideThree();
		System.out.println(t1SideThree);
		
		 //Change side three of the first triangle again so that an invalid triangle would
		 //be formed and an exception be thrown.
		t1.setSideThree(5);
		
		 //Create a triangle using a name and three sides that would form an invalid
		 //triangle, and run the program. The program should be terminated here.\
		Triangle t3 = new Triangle("Triangle 3", 5, 4, 12);

		 //Print first triangle.
		System.out.println(t1.toString());
		
		 //Print other triangle objects.
		System.out.println(t2.toString());
		
		 //Compare the first triangle with itself, print the results.
		System.out.println(t1.equals(t1));
		
		 //Compare the first triangle with another triangle, print the results.
		System.out.println(t1.equals(t2));
		
		 //Compare the first triangle with a String object, print the results.
		System.out.println(t1.equals("String Object"));

	}

}
