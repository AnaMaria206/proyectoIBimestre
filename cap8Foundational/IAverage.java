package cap8Foundational;

public interface IAverage {
	  
    double getMean(double[] values);


    private double calculateMean(double[] values) {
        double sum = 0;
        for (double v : values) sum += v;
        return sum / values.length;
    }

    default double getMeanDefault(double[] values) {
        return calculateMean(values);
    }
}
