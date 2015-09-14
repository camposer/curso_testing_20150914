package dao;

import java.util.List;

import javax.persistence.EntityManager;

import model.Todo;

public class TodoDaoJpa implements TodoDao {
	private EntityManager entityManager;
	
	@Override
	public void agregar(Todo t) {
		entityManager.persist(t);
	}

	@Override
	public void modificar(Todo t) {
		entityManager.merge(t);
	}

	@Override
	public void eliminar(Integer id) {
		Todo t = obtener(id);
		if (t != null)
			entityManager.remove(t);
	}

	@Override
	public Todo obtener(Integer id) {
		return entityManager.find(Todo.class, id);
	}

	@Override
	public List<Todo> obtenerTodos() {
		String jql = "from Todo t";
		
		return entityManager
				.createQuery(jql, Todo.class)
				.getResultList();
	}

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
