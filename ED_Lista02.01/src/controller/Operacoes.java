package controller;

public class Operacoes {

	public Operacoes() {
		super();
	}
	
	public int Multiplicar(int num1, int num2) {
		
		int resultado;
		
		if(num1==0) return 0;
		
		resultado=num2;
		
		return resultado+Multiplicar(num1-1,num2);
	}

}
