package Ejercicio1;

public class Empleado {

	private final int Id;
	private String Nombre;
	private int Edad;
	
	private static int con=1000;
	
	
	public Empleado() {
		Id=con;
		this.Nombre="Sin nombre";
		this.Edad= 99;
		con++;
	}
	
	public Empleado(String nombre,int edad) {
		this.Id=con;
		this.Nombre=nombre;
		this.Edad=edad;
		con++;
	}
	
	public static int devuelveProximoId() {
		return con +1 ;
	}

	@Override
	public String toString() {
		return "Id=" + Id + ", Nombre=" + Nombre + ", Edad=" + Edad ;
	}
	
}
