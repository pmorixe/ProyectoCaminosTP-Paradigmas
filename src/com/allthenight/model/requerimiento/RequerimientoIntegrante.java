package com.allthenight.model.requerimiento;

import java.util.ArrayList;
import java.util.List;

import com.allthenight.model.Viajero;
import com.allthenight.model.raza.Raza;

public class RequerimientoIntegrante extends Requerimiento {
	
	private Raza raza;
	
	private List<Exigencia> exigencias = new ArrayList<Exigencia>();

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public List<Exigencia> getExigencias() {
		return exigencias;
	}

	public void setExigencias(List<Exigencia> exigencias) {
		this.exigencias = exigencias;
	}


	@Override
	protected Boolean cumple(Viajero viajero) {
		return Boolean.TRUE;
	}

}
