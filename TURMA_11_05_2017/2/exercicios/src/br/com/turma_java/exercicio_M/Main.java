package br.com.turma_java.exercicio_M;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();

		lista.adicionar(3);
		lista.adicionar(4);
		lista.adicionar(7);
		lista.adicionar(9);

		int total = lista.calcularTotal();
		System.out.println("TOTAL=" + total);
		
		lista.excluirPrimeiroNO();
		total = lista.calcularTotal();
		System.out.println("TOTAL=" + total);
	}

}