package com.allthenight.requerimiento.model;

import com.allthenight.grupo.model.Elemento;
import com.allthenight.grupo.model.Grupo;
import com.allthenight.grupo.model.Viajero;

public class RequerimientoElemento extends Requerimiento {

	private Elemento nombre;
	
	private Integer cantidad;
	
	
	
	public Elemento getNombre() {
		return nombre;
	}


	public void setNombre(Elemento nombre) {
		this.nombre = nombre;
	}



	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}



	@Override
	protected Boolean cumple(Viajero viajero) {
		return viajero.tiene(this.nombre);
	}


	public Boolean cumple(Grupo grupo){
		if(grupo.obtenerCantidadDe(this.nombre)>=this.cantidad)
			return Boolean.TRUE;
		return Boolean.FALSE;
	}
	
	@Override
	public Boolean esComplicadoPara(Grupo grupo) {
		if(grupo.getElementoDificil() == this.nombre)
			return Boolean.TRUE;
		return Boolean.FALSE;
		
	}

}
