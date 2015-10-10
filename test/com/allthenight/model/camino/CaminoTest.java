package com.allthenight.model.camino;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.allthenight.model.Elemento;
import com.allthenight.model.Grupo;
import com.allthenight.model.Viajero;
import com.allthenight.model.raza.Elfo;
import com.allthenight.model.raza.Enano;
import com.allthenight.model.raza.Humano;
import com.allthenight.model.requerimiento.ExigenciaNivel;
import com.allthenight.model.requerimiento.RequerimientoElemento;
import com.allthenight.model.requerimiento.RequerimientoIntegrante;

public class CaminoTest {

	@Test
	public void testEsDificilPara_Grupo() {
		//Given
		Camino caminoDificil = getCaminoDificil();
		Grupo comunidadDelAnillo = getComunidadDelAnillo();
		
		//When
		Boolean esDificil = caminoDificil.esDificilPara(comunidadDelAnillo);
		
		
		//Then
		Assert.assertEquals(Boolean.TRUE, esDificil);
		
		
	}

	private Grupo getComunidadDelAnillo() {
		Grupo grupo = new Grupo();
		
		Viajero viajero1 = new Viajero();
		Viajero viajero2 = new Viajero();
		Viajero viajero3 = new Viajero();
		
		viajero1.setNivel(10);
		viajero1.setVida(100);
		viajero1.getElementos().add(new Elemento("Espada"));
		viajero1.getElementos().add(new Elemento("Escudo"));
		viajero1.setRaza(new Humano());
		
		
		viajero2.setNivel(5);
		viajero2.setVida(100);
		viajero2.getElementos().add(new Elemento("Espada"));
		viajero2.getElementos().add(new Elemento("Escudo"));
		viajero2.setRaza(new Elfo());
		
		viajero3.setNivel(8);
		viajero3.setVida(100);
		viajero3.getElementos().add(new Elemento("Espada"));
		viajero3.getElementos().add(new Elemento("Escudo"));
		viajero3.setRaza(new Enano());
		
		grupo.getViajeros().addAll(Arrays.asList(viajero1,viajero2,viajero3));
		
		return grupo;
	}

	private Camino getCaminoDificil() {

		Camino camino = new Camino();
		Zona zona1 = new Zona();
		Zona zona2 = new Zona();

		
		RequerimientoElemento requerimientoElemento = new RequerimientoElemento();
		RequerimientoIntegrante requerimientoIntegrante = new RequerimientoIntegrante();
		
		requerimientoElemento.setNombre(new Elemento("Elemento Jodido"));
		requerimientoElemento.setCantidad(5);
		
		requerimientoIntegrante.setRaza(new Enano());
		requerimientoIntegrante.getExigencias().add(new ExigenciaNivel());
		
		zona1.getRequerimientos().add(requerimientoElemento);
		zona2.getRequerimientos().add(requerimientoIntegrante);
		
		camino.getZonas().add(zona1);
		camino.getZonas().add(zona2);
		
		return camino;
	}

}
