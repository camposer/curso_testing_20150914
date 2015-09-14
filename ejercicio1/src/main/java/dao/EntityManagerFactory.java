package dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import env.Entorno;

public abstract class EntityManagerFactory {
	private static javax.persistence.EntityManagerFactory entityManagerFactory;
	
	static {
		if (Entorno.getTipoActivo().equals(Entorno.Tipo.TEST)) {
			entityManagerFactory = Persistence
					.createEntityManagerFactory("ejercicio1-test");
		} else {
			entityManagerFactory = Persistence
					.createEntityManagerFactory("ejercicio1");
		}
	}
	
	public static EntityManager createEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
