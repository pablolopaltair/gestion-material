/**
 * 
 */
package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import dal.*;
import dao.*;
import impl.Consultas;
/**
 * @author Pablo López
 * FALTA TERMINAR EL MENU!!!!!
 *
 */
public class Controller {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml");
		/*
		 * Consultas consulta = (Consultas) context.getBean(Consultas.class);
		 * 
		 * 
		 * ADtoServicio aDto = new ADtoServicioImpl(); ADaoServicio aDao = new
		 * ADaoServicioImpl();
		 */

		int seleccion;

		do {
			System.out.println("┌──────────────────────────────────────────────────────────┐");
			System.out.println("│                   MENÚ DE OPCIONES                       │");
			System.out.println("├──────────────────────────────────────────────────────────┤");
			System.out.println("│1. Matricula de un alumno                                 │");
			System.out.println("│                                                          │");
			System.out.println("│2. Baja de un alumno                                      │");
			System.out.println("│                                                          │");
			System.out.println("│3. Alta de un portátil                                    │");
			System.out.println("│                                                          │");
			System.out.println("│4. Consulta portátil asignado a un alumno                 │");
			System.out.println("│                                                          │");
			System.out.println("│5. Consulta alumno asignado a un portátil                 │");
			System.out.println("│                                                          │");
			System.out.println("│6. Ver todos los alumnos con su asignación de portátil    │");
			System.out.println("│                                                          │");
			System.out.println("│0. Salir                                                  │");
			System.out.println("└──────────────────────────────────────────────────────────┘");

			System.out.print(" ➤ Escriba el numero de la opcion deseada: ");
			Scanner scan = new Scanner(System.in);
			seleccion = scan.nextInt();

			//DTOS
			//DTO ALUMNOS
			AlumnosDTO DTO;
			Alumnos alumnos = new Alumnos();
			//DTO ORDENADORES
			OrdenadoresDTO DTO2;
			Ordenadores ordenadores = new Ordenadores();
			

			

			
			
			
			switch (seleccion) {
			case 1:
				System.out.println("");
				System.out.println("┌──────────────────────────────────────────────────────────┐");
				System.out.println("│[INFO] - HA ESCOGIDO HACER MATRÍCULA DE UN ALUMNO         │");
				System.out.println("└──────────────────────────────────────────────────────────┘");
				System.out.println(" ➤ Introduzca el número de identificación del alumno: ");
				System.out.println(" ➤ Introduzca el nombre del alumno: ");
				System.out.println(" ➤ Introduzca el telefono del alumno: ");
				// CODIGO
				System.out.println("");
				break;

			case 2:
				System.out.println("");
				System.out.println("┌──────────────────────────────────────────────────────────┐");
				System.out.println("│[INFO] - HA ESCOGIDO BAJA DE ALUMNO                       │");
				System.out.println("└──────────────────────────────────────────────────────────┘");
				System.out.println(" ➤ Introduzca el número de identificación del alumno a borrar: ");

				// CODIGO
				System.out.println("");

				break;

			case 3:
				System.out.println("");
				System.out.println("┌──────────────────────────────────────────────────────────┐");
				System.out.println("│[INFO] - HA ESCOGIDO ALTA DE UN PORTATIL                  │");
				System.out.println("└──────────────────────────────────────────────────────────┘");
				System.out.println(" ➤ Introduzca el número de identificación del portatil: ");
				System.out.println(" ➤ Introduzca la marca del portatil: ");
				System.out.println(" ➤ Introduzca el modelo del portatil: ");
				// CODIGO
				System.out.println("");

				break;

			case 4:
				System.out.println("");
				System.out.println("┌──────────────────────────────────────────────────────────┐");
				System.out.println("│[INFO] - HA ESCOGIDO CONSULTA DE UN PORTATIL ASG. ALUMNO  │");
				System.out.println("└──────────────────────────────────────────────────────────┘");
				System.out.println(" ➤ Introduzca el ID del alumno: ");
				// CODIGO
				System.out.println("");

				break;

			case 5:
				System.out.println("");
				System.out.println("┌──────────────────────────────────────────────────────────┐");
				System.out.println("│[INFO] - HA ESCOGIDO CONSULTA DE UN ALUMNO ASG. PORTATIL  │");
				System.out.println("└──────────────────────────────────────────────────────────┘");
				System.out.println(" ➤ Introduzca el ID del portatil: ");
				// CODIGO
				System.out.println("");

				break;

			case 6:
				System.out.println("");
				System.out.println("┌──────────────────────────────────────────────────────────┐");
				System.out.println("│[INFO] - VER TODOS LOS ALUMNOS CON SUS ASIGNACIONES       │");
				System.out.println("└──────────────────────────────────────────────────────────┘");
				// CODIGO
				System.out.println("");

				break;

				
			default:

			}
			
		} while (seleccion != 7);

	}

}
