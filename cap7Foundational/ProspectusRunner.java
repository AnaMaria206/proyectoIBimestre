package cap7Foundational;

public class ProspectusRunner {

	public static void main(String[] args) {

		        Prospectus prospectus = new Prospectus();
		        Course course1 = new Course("Software Testing");
		        Course course2 = new Course("Java Programming");

		        prospectus.addCourse(course1);
		        prospectus.addCourse(course2);

		        System.out.println("Courses in prospectus:");
		        for(int i=0; i<prospectus.getCourseCount(); i++){
		            System.out.println(prospectus.getCourses()[i].getName());
		        }
		    }
	}

