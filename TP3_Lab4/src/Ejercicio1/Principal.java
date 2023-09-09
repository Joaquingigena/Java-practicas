package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		
		Archivo archivo= new Archivo("Personas.txt");
	
		TreeSet<Persona> personas= archivo.leerPersonas();
		
		Archivo resultado= new Archivo("Resultado.txt");
		
		if(!resultado.existe()) {
			resultado.crearArchivo();
			resultado.escribirLineas(personas);
		}
		
	
		
	}

}
