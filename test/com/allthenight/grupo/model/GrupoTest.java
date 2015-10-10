package com.allthenight.grupo.model;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.allthenight.grupo.factory.ElementoFactory;
import com.allthenight.grupo.factory.GrupoFactory;
import com.allthenight.grupo.factory.ViajeroFactory;
import com.allthenight.grupo.model.Elemento;
import com.allthenight.grupo.model.Grupo;
import com.allthenight.grupo.model.Viajero;

public class GrupoTest {


	
	
	private GrupoFactory grupoFactory =  new GrupoFactory();
	private ViajeroFactory viajeroFactory = new ViajeroFactory();
	private ElementoFactory elementosFactory =  new ElementoFactory();


	@Test
	public void testObtenerCantidadDe_tresEspadas() {
		
		//GIVEN
		Grupo grupo = grupoFactory.comunidadDelAnillo();
		Elemento espada = elementosFactory.createElemento("Espada");
		
		viajeroFactory .obtenerHumano();
		
		
		//WHEN
		Integer cantidadElementos = grupo.obtenerCantidadDe(espada);
		
		
		//THEN
		Integer expected = 3;
		Assert.assertEquals(expected, cantidadElementos);
	}
	
	@Test
	public void testObtenerCantidadDe_noTenerEspadasTeniendoTresEscudos() {
		//GIVEN
		Grupo grupo = grupoFactory.granjeros();
		Elemento espada = elementosFactory.espada();
		
		//WHEN
		Integer cantidadElementos = grupo.obtenerCantidadDe(espada);
		
		
		//THEN
		Integer expected = 0;
		Assert.assertEquals(expected, cantidadElementos);
	}
	


}
