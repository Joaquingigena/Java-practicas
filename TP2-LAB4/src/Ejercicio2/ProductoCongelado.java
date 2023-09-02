package Ejercicio2;

public class ProductoCongelado {

	private float tempRecomendada;

	public ProductoCongelado(float tempRecomendada) {
		super();
		this.tempRecomendada = tempRecomendada;
	}

	@Override
	public String toString() {
		return "ProductoCongelado [tempRecomendada=" + tempRecomendada + "]";
	}

	public float getTempRecomendada() {
		return tempRecomendada;
	}

	public void setTempRecomendada(float tempRecomendada) {
		this.tempRecomendada = tempRecomendada;
	}
	
	
	
	
}
