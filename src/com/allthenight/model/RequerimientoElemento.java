package com.allthenight.model;

public class RequerimientoElemento extends Requerimiento {

	private String nombre;
	
	private Integer cantidad;
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Integer getCantidad() {
		return cantidad;
	}



	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}



	@Override
	protected Boolean cumple() {
		return Boolean.TRUE;
	}

}
