package com.allthenight.model.raza;

import com.allthenight.model.camino.Zona;

public class Humano extends Raza {
	/*-----------Metodos------------*/
	public Integer obtenerVelocidad(Zona unaZona){
		Integer unaVelocidad;
		unaVelocidad = unaZona.getLongitud()/unaZona.getAspereza();
		this.setVelocidad(unaVelocidad);
		return this.getVelocidad();
	}
}
