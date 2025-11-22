package cap8Foundational;

public class TestLambaAverage {

	public static void main(String[] args) {
		double[] nums = { 5, 10, 20, 40, 100 };

       
        IAverageLambda meanLambda = (array) -> {
            double sum = 0;
            for (double v : array) sum += v;
            return sum / array.length;
        };

        
        IAverageLambda medianLambda = (array) -> {
            int n = array.length;
            if (n % 2 == 1) {
                return array[n / 2];
            } else {
                return (array[n / 2 - 1] + array[n / 2]) / 2.0;
            }
        };

        System.out.println("Mean: " + meanLambda.getAverage(nums));
        System.out.println("Median: " + medianLambda.getAverage(nums));
    }
	}


