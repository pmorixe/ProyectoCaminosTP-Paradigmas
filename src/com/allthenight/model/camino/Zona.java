package com.allthenight.model.camino;

import java.util.ArrayList;
import java.util.List;

import com.allthenight.model.Grupo;
import com.allthenight.model.requerimiento.Requerimiento;

public class Zona {
	
	/*-------Atributos------------------*/
	private String nombre;
	private Integer cantidadOrcos;
	private Integer longitud;
	private List<Zona> zonasLimitrofes = new ArrayList<Zona>();
	private List<Requerimiento> requerimientos = new ArrayList<Requerimiento>();
	
	/*----------Metodos-------------------*/
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Integer getCantidadOrcos() {
		return cantidadOrcos;
	}



	public void setCantidadOrcos(Integer cantidadOrcos) {
		this.cantidadOrcos = cantidadOrcos;
	}



	public Integer getLongitud() {
		return longitud;
	}



	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}



	public List<Zona> getZonasLimitrofes() {
		return zonasLimitrofes;
	}



	public void setZonasLimitrofes(List<Zona> zonasLimitrofes) {
		this.zonasLimitrofes = zonasLimitrofes;
	}



	public List<Requerimiento> getRequerimientos() {
		return requerimientos;
	}



	public void setRequerimientos(List<Requerimiento> requerimientos) {
		this.requerimientos = requerimientos;
	}



	public Boolean puedeAtravezar(Grupo grupo){
		return Boolean.TRUE;
	}


	public Integer getAspereza(){
		return (this.cantidadOrcos/this.zonasLimitrofes.size());
	}


	
	
	
}
