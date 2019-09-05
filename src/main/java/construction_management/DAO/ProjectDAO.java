package construction_management.DAO;

import construction_management.Entity.Project;

public interface ProjectDAO {
	
	Project getProject(int id);
	void addProject(Project project);
}
