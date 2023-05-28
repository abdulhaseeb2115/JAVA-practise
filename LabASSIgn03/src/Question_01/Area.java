package Question_01;

public class Area {

	public double[] calculate(Shape[] shp) {

		double[] areas = new double[shp.length];

		for (int i = 0; i < areas.length; i++) {

			areas[i] = shp[i].area();
		}

		return areas;
	}
}
