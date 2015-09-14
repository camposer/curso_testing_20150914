package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the TODO database table.
 * 
 */
@Entity
@NamedQuery(name="Todo.findAll", query="SELECT t FROM Todo t")
public class Todo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descripcion;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Boolean listo;

	public Todo() {
		this.listo = false;
	}
	
	public Todo(String descripcion) {
		this();
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getListo() {
		return this.listo;
	}

	public void setListo(Boolean listo) {
		this.listo = listo;
	}

}