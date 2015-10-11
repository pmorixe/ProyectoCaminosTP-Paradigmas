package com.allthenight.requerimiento.model;

import com.allthenight.grupo.model.Viajero;

public class ExigenciaVelocidad implements Exigencia {

	private Integer velocidad;
	
	public ExigenciaVelocidad(Integer vel) {
		velocidad = vel;
	}
	
	@Override
	public Boolean cumpleExigencia(Viajero viajero) {
		return velocidad.equals(viajero.getVelocidad());
	}

}
