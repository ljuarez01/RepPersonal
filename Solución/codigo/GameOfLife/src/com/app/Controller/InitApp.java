package com.app.Controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class InitApp implements Serializable{

	private boolean showView;
	private static String description =  "El juego de la vida es un aut�mata celular dise�ado por "
			+ "el matem�tico brit�nico John Horton Conway en 1970.\n Es una malla formada por cuadrados ('c�lulas') "
			+ "que se extiende por el infinito en todas las direcciones.  Las c�lulas tienen dos estados: est�n 'vivas' o 'muertas'\n "
			+ "Las transiciones dependen del n�mero de c�lulas vecinas vivas:" 
			+ "Una c�lula muerta con exactamente 3 c�lulas vecinas vivas 'nace' (al turno siguiente estar� viva). "
			+ "Una c�lula viva con 2 � 3 c�lulas vecinas vivas sigue viva, en otro caso muere o permanece muerta (por 'soledad' o 'superpoblaci�n').";
	
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
