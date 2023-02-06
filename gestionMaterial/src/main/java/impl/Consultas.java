/**
 * 
 */
package impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dal.*;

/**
 * @author Pablo López
 * Clase que contiene las transacciones de nuestra BBDD con @Transactional
 *
 */
@Service
public class Consultas {
	
	@Autowired
	private AlumnosServicioImpl aluImp;
	@Autowired
	private OrdenadoresServicioImpl ordImp;
	
	//CONSULTAS DE APARTADO ALUMNOS
	//Consulta de matriculación de Alumno
	@Transactional
	public void insertarMatricula(Alumnos alumnos) {
		aluImp.matricularAlumno(alumnos);
	}
	//Consulta para dar de baja a un Alumno
	@Transactional
	public void eliminarAlumno(long num_alumno) {
		aluImp.eliminarAlumno(num_alumno);
	}
	//Consulta para buscar un alumno por id de ordenador
	@Transactional
	public Alumnos busquedaAlumno_ordenador(long id_ord) {
		return aluImp.busquedaAlumno_Ordenador(id_ord);
	}
	
	
	
	//CONSULTAS DE APARTADO ORDENADORES
	//Consulta de registro de un Ordenador
	@Transactional
	public void registrarOrdenador(Ordenadores ordenadores) {
		ordImp.registrarOrdenador(ordenadores);
	}
	//Consulta de busqueda de un portatil por num_alumno
	public Ordenadores busquedaOrdenador_alumno(long id_alu) {
		return ordImp.busquedaOrdenador_Alumno(id_alu);
	}

}
