/**
 * 
 */
package dao;

import dal.Alumnos;
import dal.Ordenadores;

/**
 * @author Pablo
 *
 */
public class ADaoServicioImpl implements ADaoServicio {

	@Override
	public Alumnos AlumnosDTO_DAO(AlumnosDTO alumnosDTO) {
		Alumnos alumnos = new Alumnos();
		if(alumnosDTO != null) {
			alumnos.setNombre_alumno(alumnosDTO.getNombre_alumno());
			alumnos.setNum_telefono(alumnosDTO.getNum_telefono());
			alumnos.setPortatil(alumnosDTO.getPortatil());
		}
		return alumnos;
	}

	@Override
	public Ordenadores OrdenadoresDTO_DAO(OrdenadoresDTO ordenadoresDTO) {
		Ordenadores ordenadores = new Ordenadores();
		if(ordenadoresDTO != null) {
			ordenadores.setMarca_ordenador(ordenadoresDTO.getMarca_ordenador());;
			ordenadores.setModelo_ordenador(ordenadoresDTO.getModelo_ordenador());
			ordenadores.setAlumno(ordenadoresDTO.getAlumno());
		}
		return ordenadores;
	}

}
