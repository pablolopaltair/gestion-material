/**
 * 
 */
package dal;

import java.util.*;

import javax.persistence.*;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Pablo López
 * Clase en la que creamos los métodos que hemos llamado en las interfaces donde 
 * se generarán las consultas de la base de datos.
 * 
 * - Registro de ordenador
 * - Busqueda de Ordenador a partir de Id de Alumno
 *
 * alu - ord consultas
 */
//Implementamos la interfaz AlumnosServicio en el @Repository
@Repository
public class OrdenadoresServicioImpl implements OrdenadoresServicio {
	
	//Generamos el Entity Manager para la persistencia
	@PersistenceContext
	private EntityManager em;

	
	//Método de registro de un portatil (inserción de portatil en BBDD)
	@Override
	public void registrarOrdenador(Ordenadores ordenador) {
		try {
			em.persist(ordenador);
			em.clear();
			}catch(Exception e) {
				System.out.println("[EXCEPCIÓN: Registrar Ordenador!]: " + e);
			}
		
	}

	//Método de busqueda de un Ordenador a partir de num_alumno (busqueda de ordenador en BBDD)
	@Override
	public Ordenadores busquedaOrdenador_Alumno(long num_alumno) {
		try {
			String jpql = "SELECT alu FROM Alumnos alum WHERE alum.num_alumno = :id_alu";
	        Query query = em.createQuery(jpql);
	        query.setParameter("id_alu", num_alumno);
			ArrayList<Alumnos> lista_alumnos = (ArrayList<Alumnos>) query.getResultList();
			Ordenadores ordenadores = lista_alumnos.get(0).getPortatil();
			return ordenadores;
			}catch(Exception e) {
				System.out.println("[EXCEPCIÓN: buscar PC (ID Alum)]:" + e);
			}
			return null;
		}
	

}
