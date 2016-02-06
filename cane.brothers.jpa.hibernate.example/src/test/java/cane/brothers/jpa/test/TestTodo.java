package cane.brothers.jpa.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import cane.brothers.jpa.model.Todo;

public class TestTodo {

	private static final String PERSISTENCE_UNIT_NAME = "todos";
	private EntityManagerFactory factory;
	private EntityManager em;

	private static final int TODO_AMOUNT = 5;

	@Before
	public void setUp() throws Exception {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = factory.createEntityManager();
	}
	
	@Test
	public void testAll() {
		test01_checkForEmpty();
		test02_createTodos();
		test03_checkAvailableTodos();
	}

	@Ignore
	@Test
	public void test01_checkForEmpty() {
		Query q = em.createQuery("select t from Todo t");

		// should be no todos in the table
		assertEquals(0, q.getResultList().size());
		System.out.println("Table Todo is empty. Ok");
	}

	@Ignore
	@Test
	public void test02_createTodos() {
		for (int i = 1; i <= TODO_AMOUNT; i++) {
			if(createTodo(em, "Test todo " + i, "Description") != null) {
				System.out.println("Todo created. Ok");
			}
		}
	}

	@Ignore
	@Test
	public void test03_checkAvailableTodos() {
		Query q = em.createQuery("select t from Todo t");

		@SuppressWarnings("unchecked")
		List<Todo> todoList = q.getResultList();
		for (Todo todo : todoList) {
			System.out.println(todo);
		}

		System.out.println("Size: " + todoList.size());
		assertEquals(TODO_AMOUNT, todoList.size());
	}

	@After
	public void tearDown() throws Exception {
		em.close();
	}

	// create new todo
	private Todo createTodo(EntityManager em, String name, String descr) {
		em.getTransaction().begin();
		Todo todo = new Todo();
		todo.setSummary(name);
		todo.setDescription(descr);
		em.persist(todo);
		em.getTransaction().commit();
		return todo;
	}

}

