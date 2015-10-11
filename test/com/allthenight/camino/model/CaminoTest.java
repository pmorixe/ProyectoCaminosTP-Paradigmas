package com.allthenight.camino.model;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.allthenight.camino.model.Camino;
import com.allthenight.camino.model.Zona;
import com.allthenight.grupo.factory.ElementoFactory;
import com.allthenight.grupo.factory.GrupoFactory;
import com.allthenight.grupo.factory.ViajeroFactory;
import com.allthenight.grupo.model.Elemento;
import com.allthenight.grupo.model.Grupo;
import com.allthenight.grupo.model.Viajero;
import com.allthenight.raza.model.Elfo;
import com.allthenight.raza.model.Enano;
import com.allthenight.raza.model.Humano;
import com.allthenight.requerimiento.model.ExigenciaNivel;
import com.allthenight.requerimiento.model.RequerimientoElemento;
import com.allthenight.requerimiento.model.RequerimientoIntegrante;

public class CaminoTest {
	
	private GrupoFactory grupoFactory =  new GrupoFactory();
	private CaminoFactory caminoFactory = new CaminoFactory();
	private ElementoFactory elementoFactory = new ElementoFactory();

	@Test
	public void testEsDificilPara_ZonaSinDificultad_ConRequerimientoDeIntegrante() {
		//Given
		Camino caminoDificil = caminoFactory.createCaminoSinDificultad_conDosRequerimientosDeIntegrante();
		Grupo comunidadDelAnillo = grupoFactory.comunidadDelAnillo();
		
		//When
		Boolean esDificil = caminoDificil.esDificilPara(comunidadDelAnillo);
		
		
		//Then
		Assert.assertFalse(esDificil);
	}
	
	@Test
	public void testEsDificilPara_ZonaConDificultad_ConRequerimientoDeIntegrante() {
		//Given
		Camino caminoDificil = caminoFactory.createCaminoConDificultad_conDosRequerimientosDeIntegrante();
		Grupo comunidadDelAnillo = grupoFactory.comunidadDelAnillo();
		
		//When
		Boolean esDificil = caminoDificil.esDificilPara(comunidadDelAnillo);
		
		
		//Then
		Assert.assertTrue(esDificil);
	}

	@Test
	public void testEsDificilPara_ZonaSinDificultad(){
		//Given
		Camino caminoFacil = caminoFactory.createCaminoSinDificultad_DeElemento();
		Grupo comunidadDelAnillo = grupoFactory.comunidadDelAnillo();
		//When
		Boolean esDificil = caminoFacil.esDificilPara(comunidadDelAnillo);
		//Then
		Assert.assertFalse(esDificil);
	}
	
	public void testEsDificilPara_ZonaConDificultad(){
		//Given
		Camino caminoDificil = caminoFactory.createCaminoConDificultad_DeElemento();
		Grupo comunidadDelAnilli = grupoFactory.comunidadDelAnillo();
		//When
		Boolean esDificil = caminoDificil.esDificilPara(comunidadDelAnilli);
		//Then
		Assert.assertTrue(esDificil);
	}
}
