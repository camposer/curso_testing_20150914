package dao;

import env.Entorno;

public abstract class TodoDaoFactory {
	public static TodoDao createTodoDao() {
		if (Entorno.getTipoActivo().equals(Entorno.Tipo.TEST)) 
			return new TodoDaoDummy();
		else
			return null;
	}
}
