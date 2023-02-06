/**
 * 
 */
package dal;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

/**
 * @author Pablo López
 * Clase en la que creamos los métodos que hemos llamado en las interfaces donde 
 * se generarán las consultas de la base de datos.
 * 
 * - Matriculación de alumno
 * - Baja de alumno
 * - Busqueda dse alumno a partir de Id de Ordenador
 *
 * alu - ord consultas
 */

//Implementamos la interfaz AlumnosServicio en el @Repository
@Repository
public class AlumnosServicioImpl implements AlumnosServicio {
	
	//Generamos el Entity Manager para la persistencia
	@PersistenceContext
	private EntityManager em;

	
	
	//Método de matriculación de un alumno (inserción de alumno en BBDD)
	@Override
	public void matricularAlumno(Alumnos alumnos) {
		try {
			em.persist(alumnos);
			em.clear();
			}catch(Exception e) {
				System.out.println("[EXCEPCIÓN: Matricular alumno!]: " + e);
			}
		
	}

	//Método de baja de un alumno (eliminar alumno en BBDD)
	@Override
	public void eliminarAlumno(long num_alumno) {
		try {
			String jpql ="DELETE FROM Alumnos alu WHERE alumno.num_alumno = :id_alu";
	        Query query = em.createQuery(jpql);
	        query.setParameter("id_alu", num_alumno);
	        int afectadas = query.executeUpdate();
	        System.out.println(afectadas + " filas afectadas.");
			}catch(Exception e) {
				System.out.println("[EXCEPCIÓN: Eliminar Alumno!]: " + e);
			}
			
		
	}

	//Método de busqueda de un alumno a partir de num_ordenador (busqueda de alumno en BBDD)
	@Override
	public Alumnos busquedaAlumno_Ordenador(long num_ordenador) {
		try {
			String jpql = "SELECT ord FROM Ordenadores ord WHERE ord.num_ordenador = :id_ord";
			Query query = em.createQuery(jpql);
			query.setParameter("id_ord", num_ordenador);
			ArrayList<Ordenadores> lista_portatiles = (ArrayList<Ordenadores>) query.getResultList();
			Alumnos alumnos = lista_portatiles.get(0).getAlumno();
			return alumnos;
			}catch(Exception e) {
				System.out.println("[EXCEPCIÓN: Buscar alumno (ID PC)!]:" + e);
			}
			return null;
	}

}
