package com.allthenight.grupo.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.allthenight.grupo.model.Elemento;

public class ElementoFactory {

	public List<Elemento> equipamientoHumano() {
		return Arrays.asList(
				get("Casco"),
				escudo(),
				espada(),
				arco(),
				cotaDeMalla(),
				capa());
	}
	
	public List<Elemento> equipamientoEnano() {
		return Arrays.asList(
				get("Casco"),
				hachaDeMano(),
				hachaGrande(),
				hachaDeMano(),
				cotaDeMalla());
	}
	
	public List<Elemento> equipamientoElfo() {
		return Arrays.asList(
				arco(),
				navaja(),
				panDeLembas(),
				cotaDeMalla(),
				capa());
	}
	
	public List<Elemento> equipamientoComun() {
		return Arrays.asList(
				espada(),
				navaja(),
				capa());
	}
	
	public List<Elemento> equipamientoGigolo(){
		return Arrays.asList(
				cristal(),
				shampeing(),
				bastonDePolo(),
				caballoDePolo(),
				espada());
	}


	public Elemento createElemento(String el){
		return get(el);
	}
	
	public List<Elemento> createElemento(List<String> els){
		List<Elemento> elementos = new ArrayList<Elemento>();
		for (String el : els) 
			elementos.add(get(el));
		
		return elementos;
	}


	public Elemento hachaGrande() {
		Elemento el = new Elemento();
		el.setNombre("Hacha Grande");
		return el;
	}

	public Elemento hachaDeMano() {
		Elemento el = new Elemento();
		el.setNombre("Hacha de Mano");
		return el;
	}
	
	public Elemento cotaDeMalla() {
		Elemento el = new Elemento();
		el.setNombre("Cota de Malla");
		return el;
	}

	public Elemento arco() {
		Elemento el = new Elemento();
		el.setNombre("Arco");
		return el;
	}

	public Elemento escudo() {
		Elemento el = new Elemento();
		el.setNombre("Escudo");
		return el;
	}

	public Elemento espada() {
		Elemento el = new Elemento();
		el.setNombre("Espada");
		return el;
	}

	private Elemento get(String elemento) {
		Elemento el = new Elemento();
		el.setNombre(elemento);
		return el;
	}
	
	public Elemento panDeLembas() {
		Elemento el = new Elemento();
		el.setNombre("Pan de Lembas");
		return el;
	}

	public Elemento navaja() {
		Elemento el = new Elemento();
		el.setNombre("Navaja");
		return el;
	}
	public Elemento capa() {
		Elemento el = new Elemento();
		el.setNombre("Capa");
		return el;
	}
	
	private Elemento cristal() {
		// TODO Auto-generated method stub
		Elemento el = new Elemento();
		el.setNombre("cristal");
		return el;
	}

	private Elemento shampeing() {
		// TODO Auto-generated method stub
		Elemento el = new Elemento();
		el.setNombre("shampeing");
		return el;
	}

	private Elemento bastonDePolo() {
		// TODO Auto-generated method stub
		Elemento el = new Elemento();
		el.setNombre("baston de polo");
		return el;
	}

	private Elemento caballoDePolo() {
		// TODO Auto-generated method stub
		Elemento el = new Elemento();
		el.setNombre("caballo de polo");
		return el;
	}

}
