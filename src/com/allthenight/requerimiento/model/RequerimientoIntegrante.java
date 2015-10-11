package com.allthenight.requerimiento.model;



import java.util.ArrayList;
import java.util.List;

import com.allthenight.grupo.model.Grupo;
import com.allthenight.grupo.model.Viajero;

public class RequerimientoIntegrante extends Requerimiento {
	
	private List<Exigencia> exigencias = new ArrayList<Exigencia>();
	
	private Integer integrantesNecesario = 1;

	public List<Exigencia> getExigencia() {
		return exigencias;
	}

	public void setExigencia(List<Exigencia> exigencia) {
		this.exigencias = exigencia;
	}
	
	public Integer getIntegrantesNecesario() {
		return integrantesNecesario;
	}

	public void setIntegrantesNecesario(Integer integrantesNecesario) {
		this.integrantesNecesario = integrantesNecesario;
	}


	@Override
	protected Boolean cumple(Viajero viajero) {
		return Boolean.TRUE;
	}

	@Override
	public Boolean esComplicadoPara(Grupo grupo) {
		
	 Integer integrantes = grupo.getViajeros().size();
	 
	 return integrantesNecesario > integrantes/2;
	}

	public RequerimientoIntegrante addExigencia(Exigencia exigencia) {
		this.exigencias.add(exigencia);
		return this;
		
	}

}
