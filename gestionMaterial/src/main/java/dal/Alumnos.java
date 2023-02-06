/**
 * 
 */
package dal;

import javax.persistence.*;

/**
 * @author Pablo López
 * 
 * Esta clase va a definir la tabla de dlk_alumno, donde almacenaremos los datos
 * de los alumnos que vayamos matriculando.
 *
 */


//TABLA
//Creamos tabla:"dlk_alumno" y esquema:"dlk_gestion_material" donde se almacenarán los datos de "Alumnos"
@Entity
@Table(name= "dlk_alumno", schema= "dlk_gestion_material")
public class Alumnos {

		//ATRIBUTOS
		//Primary key de nuestra tabla será: "num_alumno" como así indicamos con la etiqueta @Id
		//Campo num_alumno (Identificador)
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="num_alumno", unique=true, nullable=false)
		private long num_alumno;
	
		//Campo nombre_alumno (String nombre completo del alumno a introducir)
		@Column(name="nombre_alumno",nullable=false)
		private String nombre_alumno;
		
		//Campo num_telefono (String número de teléfono del alumno a introducir)
		@Column(name="num_telefono",nullable=false)
		private String num_telefono;
		
		//Relación del alumno-ordenador (portatil)
		@OneToOne
		Ordenadores portatil;
		
		
		//GETTERS Y SETTERS
		//num_alumno getter & setter
		public long getNum_alumno() {
			return num_alumno;
		}
		public void setNum_alumno(long num_alumno) {
			this.num_alumno = num_alumno;
		}
		
		
		//nombre_alumno getter & setter
		public String getNombre_alumno() {
			return nombre_alumno;
		}
		public void setNombre_alumno(String nombre_alumno) {
			this.nombre_alumno = nombre_alumno;
		}
	
		
		//num_telefono getter & setter
		public String getNum_telefono() {
			return num_telefono;
		}
		public void setNum_telefono(String num_telefono) {
			this.num_telefono = num_telefono;
		}
	
		
		//Ordenadores getter & setter
		public Ordenadores getPortatil() {
			return portatil;
		}
		public void setPortatil(Ordenadores portatil) {
			this.portatil = portatil;
		}
		
		
		
}
