package Ejercicio2;

public class ProductoRefrigerado extends Producto {

	//c�digo del organismo de supervisi�n alimentaria.
	private int codOrg;
	
	
	public ProductoRefrigerado() {
		
	}

	public ProductoRefrigerado(String fecha,int numLote,int codOrg) {
		super(fecha,numLote);
		this.codOrg = codOrg;
	}

	@Override
	public String toString() {
		return super.toString() + "ProductoRefrigerado [codOrg=" + codOrg + "]";
	}

	public int getCodOrg() {
		return codOrg;
	}

	public void setCodOrg(int codOrg) {
		this.codOrg = codOrg;
	}
	
	
}
