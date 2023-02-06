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
public class ADtoServicioImpl implements ADtoServicio {

	@Override
	public AlumnosDTO AAlumnosDTO(int num_alumno, String nombre_alumno, String num_telefono, Ordenadores portatil) {
		AlumnosDTO DTO = new AlumnosDTO(num_alumno, nombre_alumno, num_telefono, portatil);
		return DTO;
	}

	
	@Override
	public OrdenadoresDTO AOrdenadoresDTO(int num_ordenador, String modelo_ordenador, String marca_ordenador, Alumnos alumno) {
		OrdenadoresDTO DTO = new OrdenadoresDTO(num_ordenador, modelo_ordenador, marca_ordenador, alumno);
		return DTO;
	}

}
