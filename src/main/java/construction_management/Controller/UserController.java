package construction_management.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import construction_management.Service.UserService;
import construction_management.Entity.User;

@RestController
public class UserController {
	
	private UserService userService;
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> get(@PathVariable("id") int id){
		User user = userService.getUser(id);
		return ResponseEntity.ok().body(user);
	}
	
	public ResponseEntity<?> addUser(@RequestBody User user){
		return null;
	}
}
