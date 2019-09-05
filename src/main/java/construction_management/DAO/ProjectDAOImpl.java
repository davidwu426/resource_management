package construction_management.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import construction_management.Entity.Project;


@Repository
class ProjectDAOImpl implements ProjectDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Project getProject(int id) {
		Session session = sessionFactory.openSession();
		Project result  = (Project) session.createQuery("from Projects where projectId="+id);
		session.close();
		return result;
	}

	public void addProject(Project project) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.persist(project);
		trans.commit();
		session.close();
	}
	
	
}
