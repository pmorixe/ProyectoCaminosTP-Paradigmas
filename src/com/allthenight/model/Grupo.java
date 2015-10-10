package com.allthenight.model;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	
	private String name;
	
	private List<Viajero> viajeros =  new ArrayList<Viajero>();

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

}
