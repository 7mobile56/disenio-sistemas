package com.umg.diseno.sistemas.bs.dao.imp;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.umg.diseno.sistemas.bs.dao.GenericDao;
import com.umg.diseno.sistemas.eis.bo.AbstractBO;

@Component
public class GenericDaoHibernateImpl implements GenericDao {

    public static final String LOGIN = "login";

    private SessionFactory sessionFactory;

    @Autowired
    public GenericDaoHibernateImpl(EntityManagerFactory factory) {
        if (factory.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.sessionFactory = factory.unwrap(SessionFactory.class);
    }

    public boolean getLogin(String user, String password) {
        /*
         * Query query = this.getCurrentSession().getNamedQuery(LOGIN);
         * query.setParameter("USERNAME", user); query.setParameter("PASSWORD",
         * password); if (query != null && query.list().size() > 0) { return
         * true; } else { return false; }
         */return false;
    }

    public void saveObject(AbstractBO bo) {
        this.getCurrentSession().save(bo);
    }

    public void updateObject(AbstractBO bo) {
        this.getCurrentSession().update(bo);
    }

    public void deleteObject(AbstractBO bo) {
        this.getCurrentSession().delete(bo);
    }

    @SuppressWarnings("unchecked")
    public List<AbstractBO> getRegistros(AbstractBO bo) {
        Criteria criteria = getCurrentSession().createCriteria(bo.getClass());
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return (List<AbstractBO>) criteria.list();
    }
    
    public AbstractBO getRegistro(AbstractBO bo, Integer id) {
        Criteria criteria = getCurrentSession().createCriteria(bo.getClass());
        criteria.add(Restrictions.eq("id", id));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return (AbstractBO) criteria.uniqueResult();
    }

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
