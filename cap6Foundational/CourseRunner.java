package cap6Foundational;

import java.lang.reflect.Method;

public class CourseRunner {

	public static void main(String[] args) {
	Course javaCourse = new Course();
	javaCourse.setName("Java");
	javaCourse.setNumberOfDays(3);
	javaCourse.setPricePerPerson(1000.0);
	System.out.println(javaCourse.getName() + " course lasts " + javaCourse.getNumberOfDays()
	+ " days and costs " + javaCourse.getPricePerPerson());
	
	Course c = new Course("C#", 2, 1500.00);
	
	
	// Nueco constructor
	Course cursoConMax = new Course("Python Intermediate", 4, 200.0, 25);
	System.out.println("Máximo participantes: " + cursoConMax.getMaximumParticipants());

	// Probar validacion del setter
	cursoConMax.setMaximumParticipants(30);
	System.out.println("Nuevo máximo de participantes: " + cursoConMax.getMaximumParticipants());

	cursoConMax.setMaximumParticipants(-5); 
	
	double costoconDescuento = c.discountedCostPerson(20);
    System.out.println(costoconDescuento);
    
    int courses = Course.getNumberOfCoursesCreated();
    
    
    
	//prueba de la clase dice 
	Dice dice1 = new Dice();
	Dice dice2 = new Dice();
	int diceTotal = dice1.roll() + dice2.roll();
	System.out.println("El total de los dos dados es:" + diceTotal);
		
	
	//metodos static 
	int value =1;
	String aString = String.valueOf(value);
	
	double realNumber = 3.1417;
	String doubleString = String.valueOf(realNumber);
	
	System.out.println(3.1417);
	
	System.out.println(Course.nombreCompania);
	System.out.println(javaCourse.costPerHead(255, 5));
	
	
	//Asociacion
	Location loc = new Location("Bloque A");
    CourseDelivery d1 = new CourseDelivery(loc);

    CourseDelivery[] arr = { d1 };

    Course intro = new Course(null, arr); 

    Course advanced = new Course(intro, arr);
	
	
	}
	




}
