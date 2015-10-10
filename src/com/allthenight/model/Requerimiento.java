package com.allthenight.model;

import java.util.List;

public abstract class Requerimiento {
	
	
	public Boolean cumpleRequerimiento(List<?> viajeros){
		for (Object viajero : viajeros) {
			cumpleRequerimiento(viajero);
		}
		return Boolean.TRUE;
	}
	
	public Boolean cumpleRequerimiento(Grupo grupo) {
		return Boolean.TRUE;
	}
	
	public Boolean cumpleRequerimiento(Object viajero) {
		return Boolean.TRUE;
	}
	
	protected abstract Boolean cumple();

}

