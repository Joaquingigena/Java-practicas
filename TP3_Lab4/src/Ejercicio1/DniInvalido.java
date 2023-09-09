package Ejercicio1;

public  class DniInvalido extends Exception {

	public DniInvalido() {
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "El DNI debe contener solo numeros ";
	}
	
	
}
