package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class mainPrincipal_A {

	public static void main(String[] args) {
		
		Profesor p1= new Profesor("1",1,"p1",1);
		Profesor p2= new Profesor("2",2,"p2",2);
		Profesor p3= new Profesor("3",3,"p3",3);
		Profesor p4= new Profesor("4",4,"p4",4);
		Profesor p5= new Profesor("5",5,"p5",5);
		
		ArrayList<Profesor> profesores= new ArrayList<Profesor>();
		
		profesores.add(p1);
		profesores.add(p2);
		profesores.add(p3);
		profesores.add(p4);
		profesores.add(p5);
		
		Iterator <Profesor> iterator= profesores.iterator();
		
		while(iterator.hasNext()) {
			Profesor profe= iterator.next();
			System.out.println(profe.toString());		
			
		}

	}

}
