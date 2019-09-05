package construction_management.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import construction_management.DAO.ResourceDAO;
import construction_management.Entity.Resource;

@Service
@Transactional
public class ResourceServiceImpl implements ResourceService{
	
	private ResourceDAO resourceDAO;
	
	public Resource getResource(String id) {
		return resourceDAO.getResource(id);
	}
	
	public void addResource(Resource res) {
		resourceDAO.addResource(res);
	}
	
}
