import java.util.Scanner;

public class Calculadora {
	public static void main (String[] argumentos){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Agora a operação desejada: ");
		char c = scanner.next().charAt(0);
		if (c == '+'){
			System.out.println("Escreva dois números: ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			Soma sum = new Soma();
			sum.setSomaVar(num1, num2);
			System.out.println("O resultado: "+sum.getSoma());
		}
		if (c == '-'){
			System.out.println("Escreva dois números: ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			Subtracao sub = new Subtracao();
			sub.setSubtracaoVar(num1, num2);
			System.out.println("O resultado: "+sub.getSubtracao());
		}
		if (c == '*'){
			System.out.println("Escreva dois números: ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			Multiplicacao mult = new Multiplicacao();
			mult.setMultiplicacaoVar(num1, num2);
			System.out.println("O resultado: "+mult.getMultiplicacao());
		}
		if (c == '/'){
			System.out.println("Escreva dois números: ");
			double num1 = scanner.nextDouble();
			double num2 = scanner.nextDouble();
			Divisao div = new Divisao();
			div.setDivisaoVar(num1, num2);
			System.out.println("O resultado: "+div.getDivisao());
		}
	}
}
			
