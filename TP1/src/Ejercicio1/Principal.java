package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado e1= new Empleado();
		System.out.println(e1.toString() + "El proximo id es: " + Empleado.devuelveProximoId());
		
		Empleado e2= new Empleado();
		System.out.println(e2.toString() + " El proximo id es: " + Empleado.devuelveProximoId());
		
		Empleado e3= new Empleado("Jose",20);
		System.out.println(e3.toString() + " El proximo id es: " + Empleado.devuelveProximoId());
		
		Empleado e4= new Empleado("Jose Luis",40);
		System.out.println(e4.toString() + " El proximo id es: " + Empleado.devuelveProximoId());
		
		Empleado e5= new Empleado();
		System.out.println(e5.toString() + " El proximo id es: " + Empleado.devuelveProximoId());
		
		
		
		
		
		
		
		 

	}

}
