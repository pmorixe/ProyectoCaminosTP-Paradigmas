package com.allthenight.model;

import java.util.List;

public class RequerimientoIntegrante extends Requerimiento {
	
	private Object raza;
	
	private List<Exigencia> exigencias;

	public Object getRaza() {
		return raza;
	}

	public void setRaza(Object raza) {
		this.raza = raza;
	}

	public List<Exigencia> getExigencias() {
		return exigencias;
	}

	public void setExigencias(List<Exigencia> exigencias) {
		this.exigencias = exigencias;
	}

	@Override
	protected Boolean cumple() {
		return Boolean.TRUE;
	}

}
