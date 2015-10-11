package com.allthenight.requerimiento.model;

import com.allthenight.grupo.model.Viajero;

public class ExigenciaNivel implements Exigencia {

	private Integer nivelMinimo = 0;
	
	public ExigenciaNivel(Integer nivel) {
		this.nivelMinimo = nivel;
	}
	

	@Override
	public Boolean cumpleExigencia(Viajero viajero) {
		return viajero.getNivel() >= nivelMinimo;
	}


}


