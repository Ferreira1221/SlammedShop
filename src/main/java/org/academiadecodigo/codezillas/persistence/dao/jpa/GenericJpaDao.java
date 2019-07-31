package org.academiadecodigo.codezillas.persistence.dao.jpa;

import org.academiadecodigo.codezillas.persistence.dao.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class GenericJpaDao<T> implements Dao<T> {

    protected EntityManager em;
    protected Class<T> modelType;

    public GenericJpaDao(Class<T> modelType) {
        this.modelType = modelType;
    }

    /**
     * Sets the session manager
     *
     * @param sm the session manager to set
     */
    @PersistenceContext
    public void setSm(EntityManager sm) {
        this.em = sm;
    }

    /**
     * @see Dao#findAll()
     */

    @Override
    public List<T> findAll() {


        CriteriaQuery<T> criteriaQuery = em.getCriteriaBuilder().createQuery(modelType);
        Root<T> root = criteriaQuery.from(modelType);
        return em.createQuery(criteriaQuery).getResultList();

        // Using JPQL
            // return em.createQuery( "from " + modelType.getSimpleName(), modelType).getResultList();

    }

    /**
     * @see Dao#findById(Integer)
     */
    @Override
    public T findById(Integer id) {


        return em.find(modelType, id);

    }

    @Override
    public T saveOrUpdate(T modelObject) {

            return em.merge(modelObject);

    }

    /**
     * @see Dao#delete(Integer)
     */
    @Override
    public void delete(Integer id) {

        em.remove(em.find(modelType, id));

    }

}
