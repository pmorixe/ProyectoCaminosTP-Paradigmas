package com.allthenight.model.requerimiento;

import java.util.List;

import com.allthenight.model.Grupo;
import com.allthenight.model.Viajero;

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

