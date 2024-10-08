package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.VentaDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import util.Utilidades;

public class Inicio {

	public static void main(String[] args) {
		
		MenuInterfaz mi = new MenuImplementacion();		
		
		int opcionMenuPrincipal;
		boolean cerrarAplicacion = false;
		
		do {
			
			opcionMenuPrincipal = mi.mostrarMenuYSeleccion();
			
			switch(opcionMenuPrincipal) {			
				case 0:
					cerrarAplicacion = true;
					break;
				case 1:
					mi.accederMenuGerencia();
					break;
				case 2:
					mi.accederMenuEmpleado();
					break;
				default:
					break;
			}
			
		}while(!cerrarAplicacion);
		

	}

}
