package com.allthenight.camino.model;

import com.allthenight.grupo.factory.ElementoFactory;
import com.allthenight.raza.model.Enano;
import com.allthenight.requerimiento.factory.RequerimientoFactory;
import com.allthenight.requerimiento.model.ExigenciaNivel;
import com.allthenight.requerimiento.model.Requerimiento;
import com.allthenight.requerimiento.model.RequerimientoElemento;
import com.allthenight.requerimiento.model.RequerimientoIntegrante;

public class CaminoFactory {

	private ElementoFactory elementosFactory = new ElementoFactory();
	
	private RequerimientoFactory requerimientoFactory = new RequerimientoFactory();

	public Camino createCaminoDificl() {
		
		Camino camino = new Camino();
		
		Zona zona1 = new Zona();
		Zona zona2 = new Zona();
		
		zona1.getRequerimientos().add(requerimientoFactory.requerimientoElementoAvanzado());
		zona2.getRequerimientos().add(requerimientoFactory.requerimientoNivelminimo(10));

		camino.add(zona1).add(zona2);
		
		return camino;		
	}
	

}
