package com.allthenight.requerimiento.model;

import com.allthenight.grupo.model.Elemento;
import com.allthenight.grupo.model.Grupo;
import com.allthenight.grupo.model.Viajero;

public class RequerimientoElemento extends Requerimiento {

	private Elemento elemento;
	
	private Integer cantidad;
	
	
	
	public Elemento getElemento() {
		return elemento;
	}


	public void setElemento(Elemento nombre) {
		this.elemento = nombre;
	}



	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}



	@Override
	protected Boolean cumple(Viajero viajero) {
		return viajero.tiene(this.elemento);
	}


	public Boolean cumple(Grupo grupo){
		return grupo.obtenerCantidadDe(this.elemento)>=this.cantidad;
	}
	
	@Override
	public Boolean esComplicadoPara(Grupo grupo) {
		return grupo.getElementosDificil().contains(elemento);
	}

}
