
public class Circuit {

	public double series(int input, double[] array) {
		double value = 0;

		for (int y = 0; y < array.length; y++) {
			value += array[y];
		}
		return value;
	}

	public double parallel(int input, double[] array) {
		double value2 = 0;

		for (int y = 0; y < array.length; y++) {
			value2 += (array[y]);
		}
		value2 = 1 / value2;
		return value2;
	}
}
