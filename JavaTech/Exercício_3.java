package JavaTech;

import java.util.Scanner;

public class Exercício_3 {

	public static void main(String[] args) {
		
		float salarioB,adicionalN,horasEx,desc,salarioL;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o salário bruto: ");
		salarioB = leia.nextFloat();
		System.out.println("Digite o valor do adicional noturno: ");
		adicionalN = leia.nextFloat();
		System.out.println("Digite o valor da hora extra: ");
		horasEx = leia.nextFloat();
		System.out.println("Digite o valor dos descontos: ");
		desc = leia.nextFloat();
		
		salarioL = salarioB + adicionalN + (horasEx*5) - desc;
		
		System.out.println("O valor do Salário Líquido é de: "+salarioL);
		
	}

}