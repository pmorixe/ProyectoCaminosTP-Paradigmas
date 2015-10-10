package com.allthenight.model;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GrupoTest {


	@Test
	public void testObtenerCantidadDe_tresEspadas() {
		
		//GIVEN
		Grupo grupo = new Grupo();
		Elemento espada = new Elemento("Espada");
		grupo.setViajeros(obtenerTresViajerosCon(espada));
		
		
		//WHEN
		Integer cantidadElementos = grupo.obtenerCantidadDe(espada);
		
		
		//THEN
		Integer expected = 3;
		Assert.assertEquals(expected, cantidadElementos);
	}
	
	@Test
	public void testObtenerCantidadDe_noTenerEspadasTeniendoTresEscudos() {
		//GIVEN
		Grupo grupo = new Grupo();
		Elemento escudo = new Elemento("Escudo");
		grupo.setViajeros(obtenerTresViajerosCon(escudo));
		Elemento espada = new Elemento("Espada");
		
		//WHEN
		Integer cantidadElementos = grupo.obtenerCantidadDe(espada);
		
		
		//THEN
		Integer expected = 0;
		Assert.assertEquals(expected, cantidadElementos);
	}
	

	private List<Viajero> obtenerTresViajerosCon(Elemento espada) {
		
		Viajero viajero1 = new Viajero();
		viajero1.getElementos().add(espada);
		
		Viajero viajero2 = new Viajero();
		viajero2.getElementos().add(espada);
		
		Viajero viajero3 = new Viajero();
		viajero3.getElementos().add(espada);
		
		return Arrays.asList(viajero1,viajero2,viajero3);
	}



}
