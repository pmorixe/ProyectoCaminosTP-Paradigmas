package com.allthenight.grupo.factory;

import com.allthenight.requerimiento.model.RequerimientoElemento;

public class RequerimientoFactory {
	
	private ElementoFactory elementoFactory = new ElementoFactory();
	
	public RequerimientoElemento requerimientoElementoAvanzado(){
		RequerimientoElemento requerimientoElemento = new RequerimientoElemento();
		requerimientoElemento.setCantidad(4);
		requerimientoElemento.setNombre(elementoFactory.arco());
		return requerimientoElemento;
	}

	public RequerimientoElemento requerimientoElementoFacil(){
		RequerimientoElemento requerimientoElemento = new RequerimientoElemento();
		requerimientoElemento.setCantidad(2);
		requerimientoElemento.setNombre(elementoFactory.espada());
		return requerimientoElemento;
	}
}
