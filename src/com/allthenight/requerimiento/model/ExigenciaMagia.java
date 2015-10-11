package com.allthenight.requerimiento.model;

import com.allthenight.grupo.model.Viajero;

public class ExigenciaMagia implements Exigencia {

	@Override
	public Boolean cumpleExigencia(Viajero viajero) {
		return viajero.getMagia();
	}

}
