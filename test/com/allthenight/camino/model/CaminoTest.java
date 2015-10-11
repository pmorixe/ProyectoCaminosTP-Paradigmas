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
	private ElementoFactory elementosFactory =  new ElementoFactory();

	@Test
	public void testEsDificilPara_GrupoComunidadDelAnillo() {
		//Given
		Camino caminoDificil = getCaminoDificil();
		Grupo comunidadDelAnillo = grupoFactory.comunidadDelAnillo();
		
		//When
		Boolean esDificil = caminoDificil.esDificilPara(comunidadDelAnillo);
		
		
		//Then
		Assert.assertEquals(Boolean.TRUE, esDificil);
		
		
	}

	

	private Camino getCaminoDificil() {

		Camino camino = new Camino();
		CaminoFactory caminoFactory = new CaminoFactory();
		caminoFactory.createCaminoDificl();
		return camino;

	}

}
