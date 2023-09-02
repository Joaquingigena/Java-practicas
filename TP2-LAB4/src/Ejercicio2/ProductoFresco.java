package Ejercicio2;

public class ProductoFresco extends Producto {

	private String fechaEnvasado;
	private int paisOrigen;
	
	public ProductoFresco() {
		
	}
	
	public ProductoFresco(String fecha,int numLote,String fechaEnvasado, int paisOrigen) {
		super(fecha,numLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return super.toString() + " FechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen;
	}
	
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public int getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(int paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	
	
	
}
