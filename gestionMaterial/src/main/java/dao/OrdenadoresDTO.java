/**
 * 
 */
package dao;

import dal.Alumnos;

/**
 * @author Pablo
 * DTO de ordenador, donde recogeremos los campos de la capa DAL en un objeto
 * Getters y setters
 * Constructor
 * ToString
 */
public class OrdenadoresDTO {

	private long num_ordenador;
	private String marca_ordenador;
	private String modelo_ordenador;
	Alumnos alumno;
	
	//GETTERS SETTERS
	//num_ordenador
	public long getNum_ordenador() {
		return num_ordenador;
	}
	public void setNum_ordenador(long num_ordenador) {
		this.num_ordenador = num_ordenador;
	}
	
	//marca_ordenador
	public String getMarca_ordenador() {
		return marca_ordenador;
	}
	public void setMarca_ordenador(String marca_ordenador) {
		this.marca_ordenador = marca_ordenador;
	}
	
	//modelo_ordenador
	public String getModelo_ordenador() {
		return modelo_ordenador;
	}
	public void setModelo_ordenador(String modelo_ordenador) {
		this.modelo_ordenador = modelo_ordenador;
	}
	
	//alumno
	public Alumnos getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumnos alumno) {
		this.alumno = alumno;
	}
	
	//CONSTRUCTOR
	public OrdenadoresDTO(long num_ordenador, String marca_ordenador, String modelo_ordenador, Alumnos alumno) {
		super();
		this.num_ordenador = num_ordenador;
		this.marca_ordenador = marca_ordenador;
		this.modelo_ordenador = modelo_ordenador;
		this.alumno = alumno;
	}
	public OrdenadoresDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//toSTRING
	@Override
	public String toString() {
		return "OrdenadoresDTO [num_ordenador=" + num_ordenador + ", marca_ordenador=" + marca_ordenador
				+ ", modelo_ordenador=" + modelo_ordenador + ", alumno=" + alumno + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
