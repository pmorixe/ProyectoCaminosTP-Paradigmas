package com.allthenight.grupo.model;

import java.util.ArrayList;
import java.util.List;

import com.allthenight.raza.model.Raza;

public class Viajero {
	/*-------Atributos------------------*/
	private Integer vida;
	private Integer nivel;
	private List<Elemento> elementos = new ArrayList<Elemento>();
	private Raza raza;
	/*----------Metodos-------------------*/ 
	public Integer getVida() {
		return vida;
	}
	public void setVida(Integer vida) {
		this.vida = vida;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public List<Elemento> getElementos() {
		return elementos;
	}
	public void setElementos(List<Elemento> elementos) {
		this.elementos = elementos;
	}
	public Raza getRaza() {
		return raza;
	}
	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	public boolean tiene(Elemento elemento) {
		return elementos.contains(elemento);
	}
	public Viajero equiparElemento(Elemento elemento) {
		elementos.add(elemento);
		return this;
	}
	public Viajero equiparElementos(List<Elemento> elementos) {
		this.elementos.addAll(elementos);
		return this;
	}
	
}