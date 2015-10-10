package com.allthenight.requerimiento.model;

import java.util.ArrayList;
import java.util.List;

import com.allthenight.grupo.model.Grupo;
import com.allthenight.grupo.model.Viajero;
import com.allthenight.raza.model.Raza;

public class RequerimientoIntegrante extends Requerimiento {
	
	private Raza raza;
	
	private List<Exigencia> exigencias = new ArrayList<Exigencia>();
	private Integer integrantesNecesario;

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public List<Exigencia> getExigencias() {
		return exigencias;
	}

	public void setExigencias(List<Exigencia> exigencias) {
		this.exigencias = exigencias;
	}


	@Override
	protected Boolean cumple(Viajero viajero) {
		return Boolean.TRUE;
	}

	@Override
	public Boolean esComplicadoPara(Grupo grupo) {
		// TODO Auto-generated method stub
	 Integer integrantes = grupo.getViajeros().size();
		if(getIntegrantesNecesario()-integrantes <=0){
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public Integer getIntegrantesNecesario() {
		return integrantesNecesario;
	}

	public void setIntegrantesNecesario(Integer integrantesNecesario) {
		this.integrantesNecesario = integrantesNecesario;
	}

}
