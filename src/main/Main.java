package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1, n2, p1, p2, f1 ;
		double res;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o primeiro número inteiro");
		n1 = input.nextInt();
		System.out.println("Insira o segundo número inteiro");
		n2 = input.nextInt();
		System.out.println("Insira o primeiro peso da média ponderada");
		p1 = input.nextInt();
		System.out.println("Insira o segundo peso da média ponderada");
		p2 = input.nextInt();
		System.out.println("Insira o valor do número para calcular seu fatorial");
		f1 = input.nextInt();
		
		Operacao operacao = new Operacao(n1, n2);

		operacao.soma();
		System.out.println("O resultado da soma é: " + operacao.getResultado());
		
		operacao.calcularMedia(n1, n2);
		System.out.println("A média dos números é: " + operacao.getResultado());
		
		res = operacao.multiplicar();
		System.out.println("O resultado da multiplicação dos números é: " + res);

		res = operacao.dividir(n1, n2);
		System.out.println("O resultado da divisão dos números é: " + res);	
		
		operacao.subtrair();
		System.out.println("O resultado da divisão dos números é: " + operacao.getResultado());
		
		System.out.println("O resultado da potência do primeiro número pelo segundo número é: " + operacao.potencia());
		
		System.out.println("O resultado da média ponderada é: " + operacao.mediaPonderada(n1, n2, p1, p2));
		
		operacao.fatorial(f1);
		System.out.println("O resultado do fatorial é: " + operacao.getResultado());
		
		input.close();
	}
}