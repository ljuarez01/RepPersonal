package com.app.Controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class InitApp implements Serializable{

	private boolean showView;
	private static String description =  "El juego de la vida es un autómata celular diseñado por "
			+ "el matemático británico John Horton Conway en 1970.\n Es una malla formada por cuadrados ('células') "
			+ "que se extiende por el infinito en todas las direcciones.  Las células tienen dos estados: están 'vivas' o 'muertas'\n "
			+ "Las transiciones dependen del número de células vecinas vivas:" 
			+ "Una célula muerta con exactamente 3 células vecinas vivas 'nace' (al turno siguiente estará viva). "
			+ "Una célula viva con 2 ó 3 células vecinas vivas sigue viva, en otro caso muere o permanece muerta (por 'soledad' o 'superpoblación').";
	
	public InitApp(){
		
	}
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isShowView() {
		return showView;
	}

	public void setShowView(boolean showView) {
		this.showView = showView;
	}
	
	
}
