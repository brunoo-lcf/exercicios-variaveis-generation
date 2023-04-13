package JavaTech;

import java.util.Scanner;

public class Exercício_1 {

	public static void main(String[] args) {
		
		float salario1, abono,salario2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salario1 = leia.nextFloat();
		System.out.println("Digite o valor do abono: ");
		abono = leia.nextFloat();
		
		salario2 = salario1 + abono;
		
		System.out.println("O novo salário, considerando o valor do abono é de: "+salario2);
		
		
	}

}
