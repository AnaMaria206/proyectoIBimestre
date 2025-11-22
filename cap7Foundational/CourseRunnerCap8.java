package cap7Foundational;

public class CourseRunnerCap8 {
	   public static void main(String[] args) {

	        // Crear dos cursos
	        Course c1 = new Course("Software Engineering");
	        Course c2 = new Course("Software Engineering");

	        // Crear módulos 
	        Module m1 = new Module("Maths", 10, null);
	        Module m2 = new Module("Programming", 20, null);

	 
	        c1.addModule(m1);
	        c1.addModule(m2);

	       
	        c2.addModule(m1);
	        c2.addModule(m2);

	        // Probar toString()
	        System.out.println("Course 1: " + c1);
	        System.out.println("Course 2: " + c2);

	        // Probar equals()
	        System.out.println("c1 equals c2? " + c1.equals(c2));

	        // Probar hashCode()
	        System.out.println("c1 hashCode: " + c1.hashCode());
	        System.out.println("c2 hashCode: " + c2.hashCode());
	    }
}
