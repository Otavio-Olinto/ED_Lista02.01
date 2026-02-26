/*
 Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da 
multiplicação de A por B. Os números de entrada devem ser números inteiros.
 */

package view;

import controller.Operacoes;

public class Principal {

	public static void main(String[] args) {
		
		// Instânciando os métodos da classe Operações
		Operacoes metodo = new Operacoes();
		
		int num1= 7, num2 = 8, produto;
		
		produto = metodo.Multiplicar(num1,num2);
		
		System.out.println("O resultado da multiplicação entre "+num1+" e "+num2+" é: "+produto);

	}

}
