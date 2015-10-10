package com.allthenight;

import com.allthenight.model.Exigencia;
import com.allthenight.model.ExigenciaVelocidad;
import com.allthenight.model.ExigenciaMagia;
import com.allthenight.model.ExigenciaNivel;
import com.allthenight.model.Zona;

public class Main {

	public static void main(String[] args) {
		
		ExigenciaVelocidad ex1 = new ExigenciaVelocidad();
		ExigenciaNivel ex2 = new ExigenciaNivel();
		ExigenciaMagia ex3 = new ExigenciaMagia();
		
		Exigencia[] lista = {ex1 ,ex2, ex3};
		
		
		Zona zona = new Zona();

	}

}
