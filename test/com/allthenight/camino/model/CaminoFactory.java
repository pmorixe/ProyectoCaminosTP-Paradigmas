package com.allthenight.camino.model;

import com.allthenight.grupo.factory.ElementoFactory;
import com.allthenight.raza.model.Enano;
import com.allthenight.requerimiento.model.ExigenciaNivel;
import com.allthenight.requerimiento.model.Requerimiento;
import com.allthenight.requerimiento.model.RequerimientoElemento;
import com.allthenight.requerimiento.model.RequerimientoIntegrante;

public class CaminoFactory {

	private ElementoFactory elementosFactory = new ElementoFactory();

	public Camino createCaminoDificl() {
		
		Camino camino = new Camino();
		
		Zona zona1 = new Zona();
		Zona zona2 = new Zona();
		
		camino.add(zona1).add(zona2);
		
		
		RequerimientoElemento requerimientoElemento = new RequerimientoElemento();
		RequerimientoIntegrante requerimientoIntegrante = new RequerimientoIntegrante();
		
		requerimientoElemento.setNombre(elementosFactory .createElemento("Elemento Jodido"));
		requerimientoElemento.setCantidad(5);
		
		requerimientoIntegrante.setRaza(new Enano());
		requerimientoIntegrante.getExigencias().add(new ExigenciaNivel());
		
		zona1.getRequerimientos().add(requerimientoElemento);
		zona2.getRequerimientos().add(requerimientoIntegrante);
		
		return camino;		
	}
	

}
