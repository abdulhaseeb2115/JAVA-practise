package khalil_assignment;

public class Runner {

	public static void main(String[] args) {
		final int NO_OF_FIGURES_IN_DRAWING = 5;
		Circle c1 = new Circle (true,"Blue",2.5,5);
		Circle c2 = new Circle (false,"red",1.5,10);
		Rectangle r1 = new Rectangle(true,"Blue",2.5,4,5);
		Rectangle r2 = new Rectangle(false,"red",3.6,6,5);
		Rectangle r3 = new Rectangle(true,"green",4.5,1,5);
		Rectangle r4 = new Rectangle(true,"green",4.5,1,5);
		 
		Drawing d = new Drawing(NO_OF_FIGURES_IN_DRAWING);
		 
		if(!d.add(c1))System.out.println("Failed");
		if(!d.add(c2))System.out.println("Failed");
		if(!d.add(r1))System.out.println("Failed");
		if(!d.add(r2))System.out.println("Failed");
		if(!d.add(r3))System.out.println("Failed");
		if(!d.add(r4))System.out.println("Failed");
		       
		System.out.println("Total Area of Drawing is " + d.calculateArea());
		System.out.println("Number of Filled Figures in the drawing is "+d.countFilled());
		System.out.println(d); //Displays no of circles and rectangles added to figure using toString() method
		}

}
