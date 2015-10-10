package com.allthenight.model;

import java.util.ArrayList;
import java.util.List;

public class Camino {
	
	private List<Zona> zonas =  new ArrayList<Zona>();

	public List<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(List<Zona> zonas) {
		this.zonas = zonas;
	}

}
