package cap7Foundational;

public class HalfAdderTest {
	public static void main(String[] args)
	{

	HalfAdder halfAdder = new HalfAdder();
	
	halfAdder.setInput(1, 0);

	System.out.println("Input to the half adder is 1, 0");
	System.out.println("Result from half adder is "+ halfAdder.getResult());
	System.out.println("Carry value from half adder is "+ halfAdder.getCarry());

	halfAdder.setInput(0, 0);
	
	System.out.println("Input to the half adder is 0, 0");
	System.out.println("Result from half adder is "+ halfAdder.getResult());
	System.out.println("Carry value from half adder is "+ halfAdder.getCarry());

	halfAdder.setInput(1, 1);
	
	System.out.println("Input to the half adder is 1, 1");
	System.out.println("Result from half adder is "+ halfAdder.getResult());
	System.out.println("Carry value from half adder is "+ halfAdder.getCarry());
	}

}
