package com.library.common;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;
import java.io.Serializable;

/**
 * Created by ISAAC on 3/12/2015.
 */
public class GenericDaoImpl<T,P extends Serializable> implements GenericDao<T,P> {

  private SessionFactory sessionFactory;
    private Class<T> type;
    public  GenericDaoImpl(final Class<T> aType){
     this.type=aType;
    }
    @Transactional
    public P create(final T o) {
        return (P) getSession().save(o);
    }

    @Transactional
    public void delete(final T o) {
       getSession().delete(o);
    }

    @Override
    public T find(final P id) {
        return (T) getSession().get(type,id);
    }

    @Override
    public void update(final T o) {
      getSession().saveOrUpdate(o);
    }
  public Session getSession(){
    return sessionFactory.getCurrentSession();
  }
  public void setSessionFactory(final SessionFactory aSessionFactory){
    this.sessionFactory = aSessionFactory;
  }
}


