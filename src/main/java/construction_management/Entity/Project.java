package construction_management.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "Project")
public class Project {
	
	@Id
	@Column(name = "projectId")
	private int id;
	
	@Column(name = "projectName")
	private String name;
	
	public Project() {
		
	}
	
	public Project(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
