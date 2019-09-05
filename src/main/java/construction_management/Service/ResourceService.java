package construction_management.Service;

import construction_management.Entity.Resource;

public interface ResourceService {

	void addResource(Resource res);
	Resource getResource(String id);
}
