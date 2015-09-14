package model;

public class Todo {
	private Integer id;
	private String descripcion;
	private Boolean listo;

	public Todo() {
	
	}
	
	public Todo(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Boolean getListo() {
		return listo;
	}
	public void setListo(Boolean listo) {
		this.listo = listo;
	}
}
