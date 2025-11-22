package cap8Foundational;

public class TestAverage {

	public static void main(String[] args) {
		IAverage calc = new AverageCalculator();

        double[] nums = { 10, 20, 30, 40 };

        double result = calc.getMeanDefault(nums);

        System.out.println("Mean: " + result);
	}

}
