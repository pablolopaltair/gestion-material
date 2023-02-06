/**
 * 
 */
package dao;

import dal.Ordenadores;
import dal.Alumnos;

/**
 * @author Pablo
 *
 */
public interface ADtoServicio {
	
	public AlumnosDTO AAlumnosDTO(int num_alumno, String nombre_alumno, String num_telefono, Ordenadores portatil);
	
	public OrdenadoresDTO AOrdenadoresDTO(int num_ordenador, String modelo_ordenador, String marca_ordenador, Alumnos alumno);

}
