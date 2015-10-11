package com.allthenight.raza.model;

import com.allthenight.grupo.model.Elemento;

public class Raza {
	/*-------Atributos------------------*/
	protected Integer fuerza;
	protected Boolean magia;
	protected Integer velocidad;
	/*----------Metodos-------------------*/
	public Integer getFuerza() {
		return fuerza;
	}
	public void setFuerza(Integer fuerza) {
		this.fuerza = fuerza;
	}
	public Boolean getMagia() {
		return magia;
	}
	public void setMagia(Boolean magia) {
		this.magia = magia;
	}
	public Integer getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}
	
	@Override
	public boolean equals(Object obj) {
		
	if (obj ==null)
		return false;
	
	if (!(obj instanceof Raza)) 
		return false;
		
	return this.getClass() == obj.getClass();
	}

}
