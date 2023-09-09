package Ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.TreeSet;

public class Archivo {

	private String ruta;
	
	public Archivo(String ruta) {
		this.ruta=ruta;
	}
	
	public boolean existe() {
		File f= new File(ruta);
		
		if(f.exists()) {
			return true;
		}else{
			return false;
		}
	}
	
	public boolean crearArchivo() {
		
		FileWriter escritura;
		
		try {
			escritura= new FileWriter(ruta,true);
			
			escritura.write("");
			escritura.close();
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void escribirLineas(TreeSet<Persona>lista) {
		
		try {
			FileWriter fw= new FileWriter(ruta);
			BufferedWriter buffer= new BufferedWriter(fw);
			
			for (Persona persona : lista) {
				
				buffer.write(persona.getNombre() + "-" + persona.getApellido() + "-" + persona.getDni());
				buffer.newLine();
			}
			
			buffer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void leerLineas() {
		
		FileReader fr;
		
		try {
			fr= new FileReader(ruta);
			BufferedReader buffer= new BufferedReader(fr);
			
			String linea= buffer.readLine();
			
			while(linea!=null) {
				
				
				linea= buffer.readLine();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public TreeSet<Persona> leerPersonas(){
		
		TreeSet<Persona> listaPersonas= new TreeSet<Persona>();
		
		try {
			FileReader fr= new FileReader(ruta);
			BufferedReader buffer= new BufferedReader(fr);
			
			String linea= buffer.readLine();
			
			while(linea != null) {
				
				String[] cadena= linea.split("-");
				Persona p= new Persona();
				
				if( cadena.length == 3) {
					
					p.setNombre(cadena[0]);
					p.setApellido(cadena[1]);
					p.setDni(cadena[2]);
					
					try {
						if(!p.verificarDniInvalido(p.getDni()))
							listaPersonas.add(p);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					
				}
				
				linea= buffer.readLine();
			}
			
			buffer.close();
			fr.close();
			
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return listaPersonas;
		
	}
	
	

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
}
