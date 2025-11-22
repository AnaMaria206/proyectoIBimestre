package cap7Foundational;

public class HalfAdder{

	AndGate carryAndGate = new AndGate();
	AndGate resultAndGate = new AndGate();
	OrGate orGate = new OrGate();
	NotGate notGate = new NotGate();

	private int input1;
	private int input2;
	
	
	private int result;
	private int carry;
	//asignar los valores
	public void setInput(int in1, int in2) {
	input1 = in1;
	input2 = in2;
	
	carry = carryAndGate.getOutput(input1, input2);
	// obtenr el valor resultado
	result = resultAndGate.getOutput
	(orGate.getOutput(input1, input2),
	notGate.getOutput(carry));
	}

	public int getResult() {
	return result;
	}

	public int getCarry() {
	return carry;
	}
	
}
