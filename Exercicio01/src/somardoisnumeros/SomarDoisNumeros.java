package somardoisnumeros;

import java.util.*;

class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// definir variaveis
		int num1, num2, soma;
		
		// ler valores
		System.out.print("Digite um valor: ");
		num1 = sc.nextInt();
		System.out.print("Digite outro valor: ");
		num2 = sc.nextInt();
		
		// somar valores
		soma = num1 + num2;
		
		// mostrar soma
		System.out.println("Soma = " + soma);
	}
}
