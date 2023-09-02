package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class MainPrincipal_B {

	public static void main(String[] args) {
		
		/*Profesor p1= new Profesor("1",1,"p1",1);
		Profesor p2= new Profesor("2",2,"p2",2);
		Profesor p3= new Profesor("3",3,"p3",3);
		Profesor p4= new Profesor("4",4,"p4",4);
		Profesor p5= new Profesor("5",5,"p5",5);
		
		TreeSet<Profesor> listaProfesores= new TreeSet<Profesor>();
		listaProfesores.add(p5);
		listaProfesores.add(p4);
		listaProfesores.add(p3);
		listaProfesores.add(p2);
		listaProfesores.add(p1);
		
		Iterator<Profesor> iterator= listaProfesores.iterator();
		
		while(iterator.hasNext()) {
			Profesor p= iterator.next();
			System.out.println(p.toString());
		}
		*/
		
		Profesor p1= new Profesor("1",1,"1",1);
		Profesor p2= new Profesor("1",1,"1",1);
		
		if(p1.equals(p2)) {
			System.out.println("Es el mismo profesor");
		}
		else {
			System.out.println("NO es el mismo profesor");
		}
		
		String p = "publico";
		String pp= "PUBLICO";
		
		System.out.println(p.hashCode());
		System.out.println(pp.hashCode());
		
		
		
	}
	
}
