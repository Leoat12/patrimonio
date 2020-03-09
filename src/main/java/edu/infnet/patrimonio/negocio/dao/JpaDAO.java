package edu.infnet.patrimonio.negocio.dao;

import edu.infnet.patrimonio.negocio.JpaConnection;

import javax.persistence.EntityManager;
import java.util.List;

public class JpaDAO<T, ID> {

	protected Class<T> clazz;
	protected EntityManager em;

	public JpaDAO(Class<T> clazz) {
		this.clazz = clazz;
	}

	public T find(ID id) {
		this.em = JpaConnection.getEmf().createEntityManager();
		return this.em.find(clazz, id);
	}

	public List<T> findAll() {
		this.em = JpaConnection.getEmf().createEntityManager();
		List<T> entities = this.em.createQuery("from " + clazz.getName(), clazz)
				.getResultList();
		this.em.close();
		return entities;
	}

	public Boolean delete(ID id) {
		this.em = JpaConnection.getEmf().createEntityManager();
		this.em.getTransaction().begin();
		T entity = this.em.find(clazz, id);
		this.em.remove(entity);
		this.em.getTransaction().commit();
		this.em.close();
		return true;
	}

	public Boolean edit(T entity) {
		this.em = JpaConnection.getEmf().createEntityManager();
		this.em.getTransaction().begin();
		this.em.merge(entity);
		this.em.getTransaction().commit();
		this.em.close();
		return true;
	}

	public Boolean save(T entity) {
		this.em = JpaConnection.getEmf().createEntityManager();
		this.em.getTransaction().begin();
		this.em.persist(entity);
		this.em.getTransaction().commit();
		this.em.close();
		return true;
	}

}
