package construction_management.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import construction_management.DAO.ProjectDAO;
import construction_management.Entity.Project;

@Service
@Transactional
public class ProjectServiceImpl {
	
	private ProjectDAO projectDAO;
	
	public Project getProject(int id) {
		return projectDAO.getProject(id);
	}
	
	public void addProject(Project project) {
		projectDAO.addProject(project);
	}
}
