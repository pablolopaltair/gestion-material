package dal;


/**
 * @author Pablo López
 * 
 * Interfaz que implementa los métodos necesarios relacionados con los Ordenadores que solicita el usuario:
 * - Registrar un ordenador
 * - Buscar Ordenador a partir de Id de Alumno
 *
 */

//Se declara la clase como una interfaz con "interface"
public interface OrdenadoresServicio {

	//Método que inserta una matricula nueva en la base de datos
		public void registrarOrdenador(Ordenadores ordenador);
		
		//Metodo que lista a un Ordenador a partir de la Id de un alumno
		public Ordenadores busquedaOrdenador_Alumno (long num_alumno);
		
}
