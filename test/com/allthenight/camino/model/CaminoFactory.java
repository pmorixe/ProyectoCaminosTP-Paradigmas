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

	public Camino createCaminoSinDificultad_conDosRequerimientosDeIntegrante() {
		
		Camino camino = new Camino();
		
		Zona zona1 = new Zona();
		Zona zona2 = new Zona();
		
		RequerimientoIntegrante requerimientoIntegrante_Nivelminimo = requerimientoFactory.requerimientoIntegrante_Nivelminimo(10);
		zona1.getRequerimientos().add(requerimientoIntegrante_Nivelminimo);
		zona2.getRequerimientos().add(requerimientoIntegrante_Nivelminimo);

		camino.add(zona1).add(zona2);
		
		return camino;		
	}

	public Camino createCaminoConDificultad_conDosRequerimientosDeIntegrante() {
		
		Camino camino = new Camino();
		
		Zona zona2 = new Zona();
		
		RequerimientoIntegrante requerimientoTieneMagia = requerimientoFactory.requerimientoTieneMagia_TresIntegrantes();
		
		zona2.getRequerimientos().add(requerimientoTieneMagia);

		camino.add(zona2);
		
		return camino;		
	}
	

}
