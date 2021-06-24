import java.util.Scanner;

public class EntendendoNumeros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valor1;
		int valor2;
		int soma, subtracao, multiplicacao;
		double divisao;
		
		System.out.println("CALCULADORA");
		System.out.println("por favor, digite um valor");
		valor1 = leitor.nextInt();
		System.out.println("por favor, digite mais um valor");
		
		valor2 = leitor.nextInt();
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / (double)valor2;
		
		System.out.println("O resultado da soma foi " + soma);
		System.out.println("O resultado da multiplicacao foi" +
		subtracao);
		System.out.println("o produto da multiplicacao foi" +
		multiplicacao);
		System.out.println("O resultado resultado da divisao" + divisao);
		leitor.close();

	
        

	}

}
