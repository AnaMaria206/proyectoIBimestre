package cap7Foundational;

public class TruthTables {

	public static void main(String[] args) {

		AndGate andGate = new AndGate();
		OrGate orGate = new OrGate();
		NotGate notGate = new NotGate();
		
		System.out.println("Tabla de verdad para la AND");
		System.out.println("\t0\t1");
		// output the truth table fir the AND gate
		System.out.println("0\t" + andGate.getOutput(0,0) + "\t" +
		andGate.getOutput(0,1));
		System.out.println("1\t" + andGate.getOutput(1,0) + "\t" +
		andGate.getOutput(1,1));
		// output the column headings for the OR gate truth table
		System.out.println("Tabla de verdad OR");
		System.out.println("\t0\t1");
		// output the truth table for the OR gate
		System.out.println("0\t" + orGate.getOutput(0,0) + "\t" +
		orGate.getOutput(0,1));
		System.out.println("1\t" + orGate.getOutput(1,0) + "\t" +
		orGate.getOutput(1,1));
		// output the column headings for the NOT gate truth table
		System.out.println("Tabla de verdad NOT");
		System.out.println("\t0\t1");
		// output the truth table for the NOT gate
		System.out.println("\t" + notGate.getOutput(0) + "\t" +
		notGate.getOutput(1));
		}
	}


