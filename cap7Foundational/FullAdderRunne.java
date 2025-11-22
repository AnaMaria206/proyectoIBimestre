package cap7Foundational;

public class FullAdderRunne {
	
	 public static void main(String[] args) {
	        FullAdder fullAdder = new FullAdder();

	        // Probar todas las combinaciones posibles de 3 bits
	        int[][] inputs = {
	            {0, 0, 0},
	            {0, 0, 1},
	            {0, 1, 0},
	            {0, 1, 1},
	            {1, 0, 0},
	            {1, 0, 1},
	            {1, 1, 0},
	            {1, 1, 1}
	        };

	        for (int[] input : inputs) {
	            fullAdder.setInput(input[0], input[1], input[2]);
	            System.out.println("Input: " + input[0] + " " + input[1] + " " + input[2]);
	            System.out.println("Sum: " + fullAdder.getSum() + ", Cout: " + fullAdder.getCout());
	            System.out.println();
	        }
	    }
}
