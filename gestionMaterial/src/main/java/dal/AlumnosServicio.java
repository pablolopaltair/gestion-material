/**
 * 
 */
package dal;

/**
 * @author Pablo López
 * 
 * Interfaz que implementa los métodos necesarios relacionados con los Alumnos que solicita el usuario:
 * - Matricular un alumno
 * - Eliminar a un alumno
 * - Buscar alumno a partir de Id de Ordenador
 *
 */

//Se declara la clase como una interfaz con "interface"
public interface AlumnosServicio {

	//Método que inserta una matricula nueva en la base de datos
	public void matricularAlumno(Alumnos alumnos);
	
	//Método que elimina una matricula existente de la base de datos
	public void eliminarAlumno (long num_alumno);
	
	//Metodo que lista a un alumno a partir de la Id de un ordenador
	public Alumnos busquedaAlumno_Ordenador (long num_ordenador);
	
}
