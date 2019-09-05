package construction_management.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import construction_management.Entity.Resource;
import construction_management.Service.ResourceService;

@RestController
public class ResourceController {
	
	private ResourceService resourceService;
	
	@GetMapping("/resource/{id}")
	public ResponseEntity<Resource> get(@PathVariable("id") String id){
		Resource result = resourceService.getResource(id);
		return ResponseEntity.ok().body(result);
	}
	
	@PostMapping("/resource")
	public ResponseEntity<?> addResource(@RequestBody Resource res){
		resourceService.addResource(res);
		return ResponseEntity.ok().body("A new resource has been added with the id of:" + res.getId());
	}
}
