package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import model.Todo;

public class TodoDaoDummy implements TodoDao {
	private List<Todo> todos = new ArrayList<Todo>();
	private int contador = 1; 

	public void agregar(Todo t) {
		t.setId(contador++);
		todos.add(t);
	}

	public void modificar(Todo t) {
		int pos = obtenerPos(t.getId());
		if (pos >= 0)
			todos.set(pos, t);
	}

	private int obtenerPos(Integer id) {
		for (int i = 0; i < todos.size(); i++) {
			if (todos.get(i).getId().equals(id))
				return i;
		}
		
		return -1;
	}

	public void eliminar(Integer id) {
		int pos = obtenerPos(id);
		if (pos >= 0)
			todos.remove(pos);
	}

	public Todo obtener(Integer id) {
		int pos = obtenerPos(id);
		if (pos >= 0)
			return todos.get(pos);
		else 
			return null;
	}

	public List<Todo> obtenerTodos() {
		return todos;
	}

	@Override
	public void setEntityManager(EntityManager entityManager) {

	}

}
