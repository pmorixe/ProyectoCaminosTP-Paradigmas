package com.allthenight.model;

import java.util.List;

public class Grupo {
	
	private String name;
	
	private List<?> viajeros;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<?> getViajeros() {
		return viajeros;
	}

	public void setViajeros(List<?> viajeros) {
		this.viajeros = viajeros;
	}

}
