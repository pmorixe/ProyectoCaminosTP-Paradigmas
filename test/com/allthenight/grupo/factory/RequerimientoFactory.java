package com.allthenight.grupo.factory;

import com.allthenight.requerimiento.model.ExigenciaMagia;
import com.allthenight.requerimiento.model.ExigenciaNivel;
import com.allthenight.requerimiento.model.ExigenciaVelocidad;
import com.allthenight.requerimiento.model.RequerimientoElemento;
import com.allthenight.requerimiento.model.RequerimientoIntegrante;

public class RequerimientoFactory {
	
	private ElementoFactory elementoFactory = new ElementoFactory();
	
	public RequerimientoElemento requerimientoElementoAvanzado(){
		RequerimientoElemento requerimientoElemento = new RequerimientoElemento();
		requerimientoElemento.setCantidad(4);
		requerimientoElemento.setElemento(elementoFactory.arco());
		return requerimientoElemento;
	}

	public RequerimientoElemento requerimientoElementoFacil(){
		RequerimientoElemento requerimientoElemento = new RequerimientoElemento();
		requerimientoElemento.setCantidad(2);
		requerimientoElemento.setElemento(elementoFactory.espada());
		return requerimientoElemento;
	}
	
	
	public RequerimientoIntegrante requerimientoNivelminimo(Integer nivel){
		RequerimientoIntegrante requerimientoIntegrante = new RequerimientoIntegrante();
		
		requerimientoIntegrante.setIntegrantesNecesario(2);
		requerimientoIntegrante.setExigencia(new ExigenciaNivel(nivel));
		
		return requerimientoIntegrante;
	}
	
	public RequerimientoIntegrante requerimientoTieneMagia(){
		RequerimientoIntegrante requerimientoIntegrante = new RequerimientoIntegrante();
		
		requerimientoIntegrante.setIntegrantesNecesario(1);
		requerimientoIntegrante.setExigencia(new ExigenciaMagia());
		
		return requerimientoIntegrante;
	}
	
	public RequerimientoIntegrante requerimientoVelocidadExacta(Integer velocidad){
		RequerimientoIntegrante requerimientoIntegrante = new RequerimientoIntegrante();
		
		requerimientoIntegrante.setIntegrantesNecesario(1);
		requerimientoIntegrante.setExigencia(new ExigenciaVelocidad(velocidad));
		
		return requerimientoIntegrante;
	}
	
	
	
}
