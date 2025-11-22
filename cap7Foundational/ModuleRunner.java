package cap7Foundational;

public class ModuleRunner {

	public static void main(String[] args) {
		Course myCourse = new Course("Software testing");
        Module module1 = new Module("Unit testing", 10, "Practicum");
        Module module2 = new Module("Acceptance testing", 20, "Coursework");
        Module module3 = new Module("Boundary Values", 10, "None");

        myCourse.addModule(module1);
        myCourse.addModule(module2);
        myCourse.addModule(module3);

        System.out.println(myCourse.getName() + " contains the following modules:");
        System.out.println("Module name \t credit points \t assessment");

        for(int i=0; i<myCourse.getModuleCount(); i++){
            Module m = myCourse.getModules()[i];
            System.out.println(m.getName() + "\t" + m.getCreditPoints() + "\t" + m.getAssessment());
        }

        System.out.println("Total credits = " + myCourse.getTotalCredits());
    }
	}


