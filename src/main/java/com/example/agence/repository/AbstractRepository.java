package com.example.agence.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class AbstractRepository <PK extends Serializable, T> {

    private final Class<T> persistentClass;
    @Autowired
    protected SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public AbstractRepository(){
        this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    //// <T> : GENERIC CLASS /////



    // API
    /////////// CRUD ///////////


    public T findOne(final Integer id) {
        return (T) getCurrentSession().get(persistentClass, id);    // get row from table that has the "id"
    }


    public List<T> findAll() {
        return getCurrentSession().createQuery("from " + persistentClass.getName()).getResultList();
    }


    public void create(final T entity) {
        getCurrentSession().saveOrUpdate(entity);
    }


    public T update(final T entity) {
        return (T) getCurrentSession().merge(entity);
    }


    public void delete(final T entity) {
        getCurrentSession().delete(entity);
    }


    public void deleteById(final Integer entityId) {
        final T entity = findOne(entityId);
        delete(entity);
    }

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}

