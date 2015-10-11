package com.allthenight.grupo.model;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	
	private String name;
	
	private List<Viajero> viajeros =  new ArrayList<Viajero>();

	private Elemento elementoDificil;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Viajero> getViajeros() {
		return viajeros;
	}

	public void setViajeros(List<Viajero> viajeros) {
		this.viajeros = viajeros;
	}

	public Integer obtenerCantidadDe(Elemento elemento) {
		int i = 0;
		for (Viajero viajero : viajeros) {
			if (viajero.tiene(elemento))
				i++;
		}
		
		return i;
	}
	
	public Grupo sumarAlGrupo(Viajero obtenerHumano) {
		viajeros.add(obtenerHumano);
		return this;
	}
	
	public Grupo sumarAlGrupo(List<Viajero> viajeros) {
		viajeros.addAll(viajeros);
		return this;
	}
	
	public Grupo incorporarGrupo(Grupo grupo) {
		viajeros.addAll(grupo.getViajeros());
		return this;
	}

	public Elemento getElementoDificil() {
		return elementoDificil;
	}

	public void setElementoDificil(Elemento elementoDificil) {
		this.elementoDificil = elementoDificil;
	}

}
