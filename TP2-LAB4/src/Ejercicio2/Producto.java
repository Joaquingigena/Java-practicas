package Ejercicio2;

public class Producto {

	private String fechaCaducidad;
	private int numLote;
	
	public Producto() {
		
	}
	public Producto (String fechaCaducidad,int numLote) {
		this.fechaCaducidad=fechaCaducidad;
		this.numLote=numLote;
	}
	
	
	@Override
	public String toString() {
		return "FechaCaducidad=" + fechaCaducidad + ", numLote=" + numLote;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getNumLote() {
		return numLote;
	}
	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}
}
