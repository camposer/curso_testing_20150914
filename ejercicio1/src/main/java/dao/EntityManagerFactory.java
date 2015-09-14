package dao;

import javax.persistence.Persistence;

import env.Entorno;

public abstract class EntityManagerFactory {
	public static javax.persistence.EntityManagerFactory 
			createEntityManagerFactory() {
		
		if (Entorno.getTipoActivo().equals(Entorno.Tipo.TEST)) {
			return Persistence
					.createEntityManagerFactory("ejercicio1-test");
		} else {
			return Persistence
					.createEntityManagerFactory("ejercicio1");
		}
	}
}
