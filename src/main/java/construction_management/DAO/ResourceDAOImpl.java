package construction_management.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import construction_management.Entity.Resource;
import construction_management.Entity.User;


@Repository
public class ResourceDAOImpl implements ResourceDAO{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Resource getResource(String id) {
		Session session = this.sessionFactory.openSession();
		Resource result = (Resource)session.createQuery("from Resources where resourceId="+id).getSingleResult();
		session.close();
		return result;
	}

	public void addResource(Resource res) {
		Session session = this.sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.persist(res);
		trans.commit();
		session.close();
	}

}
