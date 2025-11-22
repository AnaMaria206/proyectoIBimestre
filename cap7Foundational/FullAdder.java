package cap7Foundational;

public class FullAdder {
	 private HalfAdder firstHalfAdder = new HalfAdder();
	    private HalfAdder secondHalfAdder = new HalfAdder();
	    private OrGate orGate = new OrGate();

	    // Entradas
	    private int A;
	    private int B;
	    private int Cin;

	    // Salidas
	    private int Sum;
	    private int Cout;

	    // Método para establecer entradas y calcular la suma
	    public void setInput(int A, int B, int Cin) {
	        this.A = A;
	        this.B = B;
	        this.Cin = Cin;

	        // Primera suma
	        firstHalfAdder.setInput(A, B);
	        int Sum1 = firstHalfAdder.getResult();
	        int Carry1 = firstHalfAdder.getCarry();

	        // Segunda suma
	        secondHalfAdder.setInput(Sum1, Cin);
	        int Sum2 = secondHalfAdder.getResult();
	        int Carry2 = secondHalfAdder.getCarry();

	        // Suma final
	        this.Sum = Sum2;
	        
	        this.Cout = orGate.getOutput(Carry1, Carry2);
	    }


	    public int getSum() {
	        return Sum;
	    }

	    public int getCout() {
	        return Cout;
	    }
}
