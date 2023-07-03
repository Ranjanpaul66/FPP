package assignment5.prob1;

public class Main {

	public static void main(String[] args) {
//		String color, double width, double height
		Shape shapObj1 = new Rectangle("Green",80.25,70.5 );
		Shape shapObj2 = new Circle("Red",80.25 );
		Shape shapObj3 = new Square("Blue",70.5 );
		Shape shapObj4 = new Circle("Yellow",90.01 );
		Shape shapObj5 = new Circle("Light Crime",180.25 );

		Shape[] arr = {shapObj1, shapObj2, shapObj3, shapObj4, shapObj5};
		
		printTotal(arr);
	}
	
	public static void printTotal(Shape[] shapes)
	 { 
		double totalArea=0.0;
		double totalPerimeter=0.0;
		for(Shape obj:shapes) {
			totalArea += obj.calcualteArea() ;
			totalPerimeter += obj.calculatePerimeter();
		}
		System.out.printf("Total Area is: %f \n Total Perimeter is: %f",totalArea,totalPerimeter  );
		
	 } 
}
