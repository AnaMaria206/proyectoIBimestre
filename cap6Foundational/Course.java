package cap6Foundational;

/**
* @author Ana María Quillupangui
*
*/
public class Course {
	private String name;
	private int numberOfDays;
	private double pricePerPerson;
	private int maximumParticipants;
	private static int numberOfCoursesCreated = 0;
	public static final String nombreCompania = "Cursos Educativos Pedrito";

	
	//Asociaciones
	 private CourseDelivery[] deliveries;

	    public Course(CourseDelivery[] deliveries) {
	        this.deliveries = deliveries;
	    }
	    private Course prerequisite;

	    public Course(Course prerequisite, CourseDelivery[] deliveries) {
	        this.prerequisite = prerequisite;
	        this.deliveries = deliveries;
	    }
	
/**
* Constructor sin argumentos
*/
	public Course() {
		this("Unnamed Course", 3, 1000.0);
	}
/**
* Constructor con parametros
* @param name Nombre del curso
* @param days Duracion en dias del curso
* @param price Costo por persona
*/
	public Course(String name, int days, double price){
		setName(name);
		setNumberOfDays(days);
		setPricePerPerson(price);
	}

	/**
	 * Constructor considerando el nuevo parametro 
	 * @param name
	 * @param numberOfDays
	 * @param pricePerPerson
	 * @param maximumParticipants
	 */
	
public Course(String name, int numberOfDays, double pricePerPerson, int maximumParticipants) {
	super();
	this.name = name;
	this.numberOfDays = numberOfDays;
	this.pricePerPerson = pricePerPerson;
	this.maximumParticipants = maximumParticipants;
}
/**
* @return Nombre del curso 
*/
	public String getName() {
		return name;
	}
/**
* @param name Nombre del curso
*/
	public void setName(String name) {
		this.name = name;
	}
/**
* @return Duracion del curso
*/
	public int getNumberOfDays() {
		return numberOfDays;
	}
/**
* @param Numero de dias de duracion
*/
	public void setNumberOfDays(int numberOfDays) {
		if(numberOfDays >= 1 && numberOfDays <=10){
			this.numberOfDays = numberOfDays;
		}else {
			System.out.println("Valor incorrecto");
		}
	}
/**
* @return Precio por persona
*/
	public double getPricePerPerson() {
		return pricePerPerson;
	}
/**
* @param price Precio por person
*/
	public void setPricePerPerson(double price) {
		this.pricePerPerson = price;
	}
	
public int getMaximumParticipants() {
	return maximumParticipants;
}

public void setMaximumParticipants(int maximumParticipants) {
	 if (maximumParticipants > 0) {
	        this.maximumParticipants = maximumParticipants;
	    } else {
	        System.out.println("Numero de estudiantes invalido.");
	    }
}

public double discountedCostPerson (int percentDiscount) {
	double precioDescuento =0;
	//reduccion del 15 % 
	precioDescuento = pricePerPerson * ((100 - percentDiscount) / 100.0);
	
	return precioDescuento;
}
public static int getNumberOfCoursesCreated()
{
return numberOfCoursesCreated;
} 

public static double costPerHead (double tarifa, int numParticipantes ) {
	double precioPorPersona =0;
	
	precioPorPersona = tarifa / numParticipantes;
	return precioPorPersona;
	
	
}

} 
