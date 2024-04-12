package com.raquel.cafetera;

/**
 * Clase en la que definimos Cafetera, junto a 3 constructores y distintos métodos con
 * los que podremos realizar distintas acciones con la cafetera y su cantidad de café.
 * @author Raquel
 *
 */
public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;
	
	public Cafetera() {
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}

	public Cafetera(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = capacidadMaxima;
	}

	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		if (cantidadActual > this.capacidadMaxima) {
			this.cantidadActual = this.capacidadMaxima;
		}
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	/**
	 * Método en el que llenamos la cafetera a su capacidad máxima.
	 */
	public void llenarCafetera() {
		cantidadActual = capacidadMaxima;
	}

	/**
	 * Método al que le pasamos los ml que tiene nuestra taza para llenarla.
	 * 
	 * @param cantidadMaximaTaza
	 */
	public void servirTaza(int cantidadMaximaTaza) {
		if (cantidadActual >= cantidadMaximaTaza) {
			cantidadActual -= cantidadMaximaTaza;
		} else {
			cantidadActual = 0;
		}
	}

	/**
	 * Método para vaciar la cafetera
	 */
	public void vaciarCafetera() {
		cantidadActual = 0;
	}

	/**
	 * Método al que pasamos por parametro los ml de café que queremos agregar a
	 * nuestra cafetera
	 * 
	 * @param cantidadAAgregar
	 */
	public void agregarCafe(int cantidadAAgregar) {
		cantidadActual += cantidadAAgregar;
	}

	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}

}
