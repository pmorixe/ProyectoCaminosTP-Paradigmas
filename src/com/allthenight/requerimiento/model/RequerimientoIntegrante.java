package com.allthenight.requerimiento.model;



import com.allthenight.grupo.model.Grupo;
import com.allthenight.grupo.model.Viajero;
import com.allthenight.raza.model.Raza;

public class RequerimientoIntegrante extends Requerimiento {
	
	private Raza raza;
	
	private Exigencia exigencia;
	
	private Integer integrantesNecesario = 1;

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

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
		if(integrantes < integrantesNecesario){
			return Boolean.TRUE;
		}
		int cantidadCumplen=0;
		for (Viajero viajero: grupo.getViajeros()) {
			if (exigencia.cumpleExigencia(viajero))
				cantidadCumplen++;
		}
		
		Boolean esComplicado = integrantesNecesario > cantidadCumplen;
		
		return esComplicado;
	}

}
