package com.allthenight.requerimiento.model;



import com.allthenight.grupo.model.Grupo;
import com.allthenight.grupo.model.Viajero;
import com.allthenight.raza.model.Raza;

public class RequerimientoIntegrante extends Requerimiento {
	
	private Exigencia exigencia;
	
	private Integer integrantesNecesario = 1;

	public Exigencia getExigencia() {
		return exigencia;
	}

	public void setExigencia(Exigencia exigencia) {
		this.exigencia = exigencia;
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

}
