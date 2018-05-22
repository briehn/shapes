package Shapes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeHelper {
	public static void start() throws IOException {
		Scanner input = new Scanner(System.in);
		String fileName;
		ArrayList<Shape> shapes;
		
		System.out.println("Enter a file name: ");
		fileName = input.next();
		
		shapes = create(fileName); // calls create that returns a list of shapes.
		display(shapes); // calls display to print the list of shapes in order.
		input.close();
		
	}

	public static ArrayList<Shape> create(String fileName) throws FileNotFoundException {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
	    String type, name;
	    double length, width, sideOne, sideTwo, sideThree, radius;
		
	    if (!(file.exists())) {
	    	System.out.println("The file " + file + " does not exist.");
	    	System.exit(0);
	    }
	    
	    while (inputFile.hasNext()) {
	          type = inputFile.next();
	          inputFile.nextLine(); //This is necessary because of the way Scanner works.
	          switch(type) {
	        	  case "Rectangle":
	        		  Rectangle rect = new Rectangle();
	        		  
	    	          name = inputFile.nextLine();
	    	          length = inputFile.nextDouble();
	    	          width = inputFile.nextDouble();
	    	          
	    	          rect.setName(name);
	    	          rect.setLength(length);
	    	          rect.setWidth(width);
	        		  shapes.add(rect);
	        		  break;
	        	  case "Circle":
	        		  Circle circ = new Circle();
	        		  
	    	          name = inputFile.nextLine();
	    	          radius = inputFile.nextDouble();
	    	          
	    	          circ.setName(name);
	    	          circ.setRadius(radius);
	        		  shapes.add(circ);
	        		  break;
	        	  case "Triangle":
	        		  Triangle tri = new Triangle();
	        		  
	    	          name = inputFile.nextLine();
	    	          sideOne = inputFile.nextDouble();
	    	          sideTwo = inputFile.nextDouble();
	    	          sideThree = inputFile.nextDouble();
	    	          
	    	          tri.setName(name);
	    	          tri.setSideOne(sideOne);
	    	          tri.setSideTwo(sideTwo);
	    	          tri.setSideThree(sideThree);
	        		  shapes.add(tri);
	        		  break;
	        	  default:
	        		  break;
	          }
	   
	    }
	    
	    inputFile.close();
		return shapes;
	}
	
	public static void display(ArrayList<Shape> shapes) {
		for (int i = 0; i < shapes.size(); i++) {
			System.out.println(shapes.get(i).toString() + "\n"); //Purpose of \n is for formatting purposes.
		}
	}
}
