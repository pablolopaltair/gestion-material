/**
 * 
 */
package dao;

import dal.Alumnos;
import dal.Ordenadores;


/**
 * @author Pablo
 * Clase interfaz de Alumnos y ordenadores
 */
public interface ADaoServicio {
	
	public Alumnos AlumnosDTO_DAO(AlumnosDTO alumnosDTO);

	public Ordenadores OrdenadoresDTO_DAO(OrdenadoresDTO portatilesDTO);

}
