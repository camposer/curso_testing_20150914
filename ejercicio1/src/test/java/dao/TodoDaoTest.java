package dao;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import env.Entorno;
import model.Todo;

public class TodoDaoTest {
	private TodoDao todoDao;
	
	@BeforeClass
	public static void beforeClass() {
		Entorno.setTipoActivo(Entorno.Tipo.TEST);
	}
	
	@Before
	public void before() {
		this.todoDao = TodoDaoFactory.createTodoDao();
	}
	
	@Test
	public void agregar() { 
		Todo todo = new Todo("Prueba");
		todoDao.agregar(todo);
		Assert.assertNotNull(todo.getId());
		
		Assert.assertEquals(1, todoDao.obtenerTodos().size());
	}
	
	@Test
	public void modificar() {
		Todo todo = new Todo("Prueba");
		todoDao.agregar(todo);
		
		todo.setDescripcion("Prueba XXX");
		todoDao.modificar(todo);
		
		todo = todoDao.obtener(todo.getId());
		Assert.assertEquals("Prueba XXX", todo.getDescripcion());
	}
	
	@Test
	public void obtener() {
		Todo todo = new Todo("Prueba");
		todoDao.agregar(todo);
		
		Assert.assertNotNull(todoDao.obtener(todo.getId()));
	}
	
	@Test
	public void eliminar() {
		Todo todo = new Todo("Prueba");
		todoDao.agregar(todo);
		
		todoDao.eliminar(todo.getId());
		
		Assert.assertNull(todoDao.obtener(todo.getId()));
	}
	
	@Test
	public void obtenerTodos() {
		todoDao.agregar(new Todo("Prueba"));
		todoDao.agregar(new Todo("Prueba"));
	
		Assert.assertEquals(2, todoDao.obtenerTodos().size());
	}
	
	
}
