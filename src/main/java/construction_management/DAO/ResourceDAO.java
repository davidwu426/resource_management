package construction_management.DAO;

import construction_management.Entity.Resource;

public interface ResourceDAO {
	
	Resource getResource(String id);
	void addResource(Resource res);
}
