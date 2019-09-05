package construction_management.Service;

import construction_management.Entity.Project;

public interface ProjectService {
	
	void addProject(Project project);
	Project getProject(int id);

}
