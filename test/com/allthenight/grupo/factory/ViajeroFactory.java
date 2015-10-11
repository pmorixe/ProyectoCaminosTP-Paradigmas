package com.allthenight.grupo.factory;

import java.util.Arrays;
import java.util.List;

import com.allthenight.grupo.model.Elemento;
import com.allthenight.grupo.model.Viajero;
import com.allthenight.raza.model.Elfo;
import com.allthenight.raza.model.Enano;
import com.allthenight.raza.model.Hobbit;
import com.allthenight.raza.model.Humano;
import com.allthenight.raza.model.Maiar;

public class ViajeroFactory {

	private ElementoFactory elementosFactory = new ElementoFactory();



	public Viajero obtenerHumano() {
		ViajeroBuilder viajeroBuilder = new ViajeroBuilder();
		viajeroBuilder.
		humano().
		nivel(20).
		vida(180).
		elementos(elementosFactory.equipamientoHumano());

		return viajeroBuilder;
	}
	
	public Viajero obtenerEnano(){
		ViajeroBuilder viajeroBuilder = new ViajeroBuilder();
		viajeroBuilder.
		enano().
		nivel(15).
		vida(200).
		elementos(elementosFactory.equipamientoEnano());

		return viajeroBuilder;
	}
	
	public Viajero obtenerElfo(){
		ViajeroBuilder viajeroBuilder = new ViajeroBuilder();
		viajeroBuilder.
		elfo().
		nivel(8).
		vida(200).
		elementos(elementosFactory.equipamientoElfo());

		return viajeroBuilder;
	}
	public Viajero obtenerHobbit(){
		ViajeroBuilder viajeroBuilder = new ViajeroBuilder();
		viajeroBuilder.
		hobbit().
		nivel(3).
		vida(30).
		elementos(elementosFactory.equipamientoComun());

		return viajeroBuilder;
	}
	
	public Viajero obtenerGranjero() {
		ViajeroBuilder viajeroBuilder = new ViajeroBuilder();
		viajeroBuilder
		.humano()
		.nivel(5)
		.vida(20)
		.elementos(elementosFactory.createElemento(Arrays.asList("Rastrillo","Pala")));

		return viajeroBuilder;
	}
	
	
	
	
	
	
	private class ViajeroBuilder extends Viajero{

		public ViajeroBuilder humano() {
			this.setRaza(new Humano());
			return this;
		}

		public ViajeroBuilder enano() {
			this.setRaza(new Enano());
			return this;
		}
		public ViajeroBuilder maiar() {
			this.setRaza(new Maiar());
			return this;
		}
		public ViajeroBuilder hobbit() {
			this.setRaza(new Hobbit());
			return this;
		}
		public ViajeroBuilder elfo() {
			this.setRaza(new Elfo());
			return this;
		}

		public ViajeroBuilder elementos(List<Elemento> list) {
			this.equiparElementos(list);
			return this;
		}
		public ViajeroBuilder elementos(Elemento elemento) {
			this.equiparElemento(elemento);
			return this;
		}

		public ViajeroBuilder vida(int i) {
			this.setVida(i);
			return this;
		}

		public ViajeroBuilder nivel(int nivel) {
			this.setNivel(nivel);
			return this;
		}
		
		
		
	}






}
