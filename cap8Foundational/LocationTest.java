package cap8Foundational;

public class LocationTest {

	public static void main(String[] args) {

		// Creación y configuración de classroom1
        Location classroom1 = new Location();
        classroom1.setAddress("4th Floor, New Bank Building");
        classroom1.setCapacity(20);
        classroom1.setPricePerDay(300.0);

        // Creación y configuración de classroom2
        Location classroom2 = new Location();
        classroom2.setAddress
        ("Seminar room 5, Central University Computing Lab");
        classroom2.setCapacity(40);
        classroom2.setPricePerDay(450.0);

        // Creación y configuración de classroom3
        Location classroom3 = new Location();
        classroom3.setAddress
        ("Seminar room 5, Central University Computing Lab");
        classroom3.setCapacity(40);
        classroom3.setPricePerDay(450.0);

     
        System.out.println("Aula uno: " + classroom1);
        System.out.println("Aula dos: " + classroom2);
        System.out.println("Aula tres: " + classroom3);

        boolean isEqual = classroom2.equals(classroom3);
        
        if(isEqual)
        {
            System.out.println(classroom2 + 
            " es igual a " + classroom3);
        }
        else
        {
            System.out.println(classroom2 + 
            " no es igual a " + classroom3);
        }
        classroom2.toString();
        
        
        System.out.println("Classroom one hashcode: " +
        	    classroom1.hashCode());
        	System.out.println("Classroom two hashcode: " +
        	    classroom2.hashCode());
        	System.out.println("Classroom three hashcode: " +
        	    classroom3.hashCode());
	}
	
	
}

