package com.allthenight;

import com.allthenight.model.camino.Zona;
import com.allthenight.model.requerimiento.Exigencia;
import com.allthenight.model.requerimiento.ExigenciaMagia;
import com.allthenight.model.requerimiento.ExigenciaNivel;
import com.allthenight.model.requerimiento.ExigenciaVelocidad;

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
