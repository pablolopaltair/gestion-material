/**
 * 
 */
package dao;

import dal.Alumnos;
import dal.Ordenadores;

/**
 * @author Pablo
 * DTO de Alumno, donde recogeremos los campos de la capa DAL en un objeto
 * Getters y setters
 * Constructor
 * ToString
 */
public class AlumnosDTO {
	
	private long num_alumno;
	private String nombre_alumno;
	private String num_telefono;
	
	Ordenadores portatil;

	//GETTERS Y SETTERS
	//num_alumno
	public long getNum_alumno() {
		return num_alumno;
	}
	public void setNum_alumno(long num_alumno) {
		this.num_alumno = num_alumno;
	}

	//nombre_alumno
	public String getNombre_alumno() {
		return nombre_alumno;
	}
	public void setNombre_alumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}

	//num_telefono
	public String getNum_telefono() {
		return num_telefono;
	}
	public void setNum_telefono(String num_telefono) {
		this.num_telefono = num_telefono;
	}

	//portatil
	public Ordenadores getPortatil() {
		return portatil;
	}
	public void setPortatil(Ordenadores portatil) {
		this.portatil = portatil;
	}
	
	//CONSTRUCTOR
	public AlumnosDTO(long num_alumno, String nombre_alumno, String num_telefono, Ordenadores portatil) {
		super();
		this.num_alumno = num_alumno;
		this.nombre_alumno = nombre_alumno;
		this.num_telefono = num_telefono;
		this.portatil = portatil;
	}
	
	public AlumnosDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//toSTRING
	@Override
	public String toString() {
		return "AlumnosDTO [num_alumno=" + num_alumno + ", nombre_alumno=" + nombre_alumno + ", num_telefono="
				+ num_telefono + ", portatil=" + portatil + "]";
	}
	
	
	
	
	
	

}
