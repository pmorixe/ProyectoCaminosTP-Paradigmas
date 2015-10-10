package com.allthenight.camino.model;

import java.util.ArrayList;
import java.util.List;

import com.allthenight.grupo.model.Grupo;

public class Camino {
	
	private List<Zona> zonas =  new ArrayList<Zona>();

	public List<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(List<Zona> zonas) {
		this.zonas = zonas;
	}

	public Boolean esDificilPara(Grupo grupo) {
		
		Boolean esDificil = Boolean.TRUE;
		
		if(zonas.isEmpty())
			return Boolean.FALSE;
		
		for (Zona zona : zonas) {
			if (!zona.esComplicadaPara(grupo))
				return Boolean.FALSE;
		}
		
		
		return esDificil;
	}

}
