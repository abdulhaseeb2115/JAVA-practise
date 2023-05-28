package Question_01;

public class RunnerShape {
	
	public static void main(String[] args) {
		
		Shape triangle = new Triangle(5, 43);
		Shape circle = new Circle(55);
		Shape rectangle = new Rectangle(21, 19);

		Shape[] shapesInput = { rectangle, circle, triangle };

		Area areaObj = new Area();
		double[] areasOutput = areaObj.calculate(shapesInput);

		for (int i = 0; i < shapesInput.length; i++) {
			System.out.println((i+1)+">>"+areasOutput[i]);
		}
	}
}
