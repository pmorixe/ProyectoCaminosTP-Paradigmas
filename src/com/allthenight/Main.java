package com.allthenight;

import com.allthenight.camino.model.Zona;
import com.allthenight.requerimiento.model.Exigencia;
import com.allthenight.requerimiento.model.ExigenciaMagia;
import com.allthenight.requerimiento.model.ExigenciaNivel;
import com.allthenight.requerimiento.model.ExigenciaVelocidad;

public class Main {

	public static void main(String[] args) {
		
		ExigenciaVelocidad ex1 = new ExigenciaVelocidad();
		ExigenciaNivel ex2 = new ExigenciaNivel();
		ExigenciaMagia ex3 = new ExigenciaMagia();
		
		Exigencia[] lista = {ex1 ,ex2, ex3};
		
		
		Zona zona = new Zona();
		Integer aspereza = zona.getAspereza();

	}

}
