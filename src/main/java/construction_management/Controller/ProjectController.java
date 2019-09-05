package construction_management.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import construction_management.Entity.Project;
import construction_management.Service.ProjectService;

@RestController
public class ProjectController {
	
	
	private ProjectService projectService;
	
	@GetMapping("/project/id")
	public ResponseEntity<Project> getProject(@PathVariable("id") int id){
		Project result = projectService.getProject(id);
		return ResponseEntity.ok().body(result);
	}
	
	@PostMapping("/project")
	public ResponseEntity<?> addProject(@RequestBody Project project){
		projectService.addProject(project);
		return ResponseEntity.ok().body("Project has been created with the project name: " + project.getName());
	}
}
