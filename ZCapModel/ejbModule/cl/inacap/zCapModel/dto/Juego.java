package cl.inacap.zCapModel.dto;

import java.time.LocalDate;

public class Juego {
	private String nombre;
	private String descripcion;
	private boolean aptoNiños;
	private int precio;
	private LocalDate fechaLanzamiento;
	public Consola getConsola() {
		return consola;
	}
	public void setConsola(Consola consola) {
		this.consola = consola;
	}
	private Consola consola;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isAptoNiños() {
		return aptoNiños;
	}
	public void setAptoNiños(boolean aptoNiños) {
		this.aptoNiños = aptoNiños;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

}
