package com.raquel.servicio;

import com.raquel.cafetera.*;

/**
 * En nuestra clase Main crearemos una instancia de Cafetera y probaremos los
 * distintos métodos que hemos creado.
 * 
 * @author Raquel
 *
 */
public class Main {

	public static void main(String[] args) {
		Cafetera cafetera = new Cafetera();

		cafetera.llenarCafetera();
		System.out.println(cafetera.toString());

		cafetera.servirTaza(500);
		System.out.println(cafetera.toString());

		cafetera.vaciarCafetera();
		System.out.println(cafetera.toString());

		cafetera.agregarCafe(500);
		System.out.println(cafetera.toString());
	}

}
