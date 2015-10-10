package com.allthenight.raza.model;

import com.allthenight.camino.model.Zona;

public class Humano extends Raza {
	/*-----------Metodos------------*/
	public Integer obtenerVelocidad(Zona unaZona){
		Integer unaVelocidad;
		unaVelocidad = unaZona.getLongitud()/unaZona.getAspereza();
		this.setVelocidad(unaVelocidad);
		return this.getVelocidad();
	}
}
