package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Case;


@Repository
public class Case_DAO_Imp  implements Case_DAO{

	@Autowired
	private SessionFactory sessionFactory;
	
		@Override
	public boolean saveCase(Case case1) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(case1);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean deleteCase(Case case1) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(case1);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean updateCase(Case case1) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(case1);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Case> getCases() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Case> query=currentSession.createQuery("from Case", Case.class);
		List<Case> list=query.getResultList();
		return list;
	}

	@Override
	public Case getCaseByID(Case case1) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Case> query=currentSession.createQuery("from Case where id=:id", Case.class);
		query.setParameter("id", case1.getId());
		Case list= query.getSingleResult();
		return list;
	}
	
	

}
