package com.allthenight.grupo.model;

public class Elemento {
/*-------Atributos---------------*/	
	private String nombre;

	/*-------Metodos------------------*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
	if (obj ==null)
		return false;
	
	if (!(obj instanceof Elemento)) 
		return false;
		
	return this.nombre.equals(((Elemento) obj).getNombre());
	}

}
