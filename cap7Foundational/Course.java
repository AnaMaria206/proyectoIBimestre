package cap7Foundational;

import java.util.Arrays;
import java.util.Objects;

public class Course {
	private String name;
    private Module[] modules = new Module[20];
    private int moduleCount = 0;

    public Course(String name) { this.name = name; }

    public void addModule(Module new_module){
        if(moduleCount < modules.length){
            modules[moduleCount] = new_module;
            moduleCount++;
        } else {
            System.out.println("Cannot add more modules");
        }
    }

    public int getTotalCredits(){
        int total = 0;
        for(int i=0; i<moduleCount; i++){
            total += modules[i].getCreditPoints();
        }
        return total;
    }

    public Module[] getModules(){ return modules; }
    public int getModuleCount(){ return moduleCount; }
    public String getName(){ return name; }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(modules);
		result = prime * result + Objects.hash(moduleCount, name);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return moduleCount == other.moduleCount && Arrays.equals(modules, other.modules)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", modules=" + Arrays.toString(modules) + ", moduleCount=" + moduleCount + "]";
	}
    
    
    
    
    
}
