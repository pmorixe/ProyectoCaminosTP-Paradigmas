package com.allthenight.model;

import java.util.List;

public abstract class Requerimiento {
	
	
	public Boolean cumpleRequerimiento(List<Viajero> viajeros){
		for (Viajero viajero : viajeros) {
			cumpleRequerimiento(viajero);
		}
		return Boolean.TRUE;
	}
	
	public Boolean cumpleRequerimiento(Grupo grupo) {
		return Boolean.TRUE;
	}
	
	public Boolean cumpleRequerimiento(Viajero viajero) {
		return Boolean.TRUE;
	}
	
	protected abstract Boolean cumple(Viajero viajero);

}

