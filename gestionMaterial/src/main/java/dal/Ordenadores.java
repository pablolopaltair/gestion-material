/**
 * 
 */
package dal;

import javax.persistence.*;

/**
 * @author Pablo López
 * 
 * Esta clase va a definir la tabla de dlk_ordenador, donde almacenaremos los datos
 * de los portatiles que registremos.
 * 
 *
 */

//TABLA
//Creamos tabla:"dlk_ordneadoro" y esquema:"dlk_gestion_material" donde se almacenarán los datos de "Ordenadores"
@Entity
@Table(name= "dlk_ordenador", schema= "dlk_gestion_material")
public class Ordenadores {
	
		//ATRIBUTOS
		//Primary key de nuestra tabla será: "num_ordenador" como así indicamos con la etiqueta @Id
		//Campo num_ordenador (Identificador)
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="num_ordenador", unique=true, nullable=false)
		private long num_ordenador;

		//Campo marca_ordenador (String de la marca del ordenador a introducir)
		@Column(name="marca_ordenador",nullable=false)
		private String marca_ordenador;
		
		//Campomodelo_ordenador (String del modelo de ordenador a introducir)
		@Column(name="modelo_ordenador",nullable=false)
		private String modelo_ordenador;
		
		//Relación del alumno-ordenador (portatil)
		@OneToOne(mappedBy="portatil")
		Alumnos alumno;

		
		//GETTERS Y SETTERS
		//num_ordenador getter & setter
		public long getNum_ordenador() {
			return num_ordenador;
		}
		public void setNum_ordenador(long num_ordenador) {
			this.num_ordenador = num_ordenador;
		}

		
		//marca_ordenador getter & setter
		public String getMarca_ordenador() {
			return marca_ordenador;
		}
		public void setMarca_ordenador(String marca_ordenador) {
			this.marca_ordenador = marca_ordenador;
		}

		
		//modelo_ordenador getter & setter
		public String getModelo_ordenador() {
			return modelo_ordenador;
		}
		public void setModelo_ordenador(String modelo_ordenador) {
			this.modelo_ordenador = modelo_ordenador;
		}

		
		//Alumnos getter & setter
		public Alumnos getAlumno() {
			return alumno;
		}

		public void setAlumno(Alumnos alumno) {
			this.alumno = alumno;
		}
		
		
		
	
}
