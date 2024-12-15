/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.time.LocalDateTime;

/**
 * Clase controladora de la aplicacion
 * @author rbr - 151224
 *
 */
public class Inicio {

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 151224
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creo un objeto con la fecha y la hora actual
		LocalDateTime fechaYHoraActual = LocalDateTime.now();
		
		//Convierto el objeto en String
		String fechaHoraComoTexto = fechaYHoraActual.toString();
		
		//Muestro el contenido del String por consola
		System.out.println("Fecha y hora actual: " + fechaHoraComoTexto);

	}

}
