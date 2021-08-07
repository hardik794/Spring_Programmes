package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import vo.login;
import vo.registration;

public class regdao {

	public void insert1(login uv) {
		// TODO Auto-generated method stub
		try
        {
            SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            	
            Session session = sessionFactory.openSession();
            
            Transaction transaction=session.beginTransaction();
            
            session.save(uv);
            
            transaction.commit();
            
            session.close();
        }
    catch(Exception ex)
        {
            ex.printStackTrace();
        }
		
	}

	public void insert(registration ris) {
		// TODO Auto-generated method stub

        try {
			SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
				
			Session session = sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			session.save(ris);
			
			transaction.commit();
			
			session.close();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	public List<?> search() {
		List<?> ls =new ArrayList<>();
		// TODO Auto-generated method stub
		
		
		try {
			SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			Query q=session.createQuery("from registration");
			
			 ls = q.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ls;
		
	}



	public void delete(login vo) {
		// TODO Auto-generated method stub
		try {
			SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			 Transaction transaction = session.beginTransaction();
			 
			 session.delete(vo);
			 transaction.commit();
			 session.close();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

		
	}


