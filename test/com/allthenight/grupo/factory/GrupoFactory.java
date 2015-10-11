package com.allthenight.grupo.factory;

import com.allthenight.grupo.model.Grupo;

public class GrupoFactory {
	
	private ViajeroFactory viajeroFactory= new ViajeroFactory();



	public class GrupoBuilder extends Grupo{

		public Grupo nombre(String nombre) {
			this.setName(nombre);
			return this;
		}


		
	}

	public Grupo comunidadDelAnillo(){
		GrupoBuilder grupoBuilder = new GrupoBuilder();
		
		grupoBuilder.nombre("La Comunidad del Anillo").
		sumarAlGrupo(viajeroFactory.obtenerHumano()).
		sumarAlGrupo(viajeroFactory.obtenerHobbit()).
		sumarAlGrupo(viajeroFactory.obtenerEnano()).
		sumarAlGrupo(viajeroFactory.obtenerElfo()).
		sumarAlGrupo(viajeroFactory.obtenerHumano());
		
		return grupoBuilder;
	}


	public Grupo granjeros() {
		GrupoBuilder grupoBuilder = new GrupoBuilder();
		grupoBuilder.nombre("Granjeros").
		sumarAlGrupo(viajeroFactory.obtenerGranjero()).
		sumarAlGrupo(viajeroFactory.obtenerEnano());
		
		
		return grupoBuilder;
	}

	public Grupo losMaestrulis(){
		GrupoBuilder grupoBuilder = new GrupoBuilder();
		grupoBuilder.nombre("maestrulis").
		sumarAlGrupo(viajeroFactory.obtenerHumano()).
		sumarAlGrupo(viajeroFactory.obtenerHobbit()).
		sumarAlGrupo(viajeroFactory.obtenerHumano()).
		sumarAlGrupo(viajeroFactory.obtenerEnano());
		
		return grupoBuilder;
	}
}
