package JavaTech;

import java.util.Scanner;

public class Exercício_4 {

	public static void main(String[] args) {

		float n1,n2,n3,n4,Dif;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor de n1: ");
		n1 = leia.nextFloat();
		System.out.println("Digite o valor de n2: ");
		n2 = leia.nextFloat();
		System.out.println("Digite o valor de n3: ");
		n3 = leia.nextFloat();
		System.out.println("Digite o valor de n4: ");
		n4 = leia.nextFloat();
		
		Dif = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença entre os produtos n1 e n2 pelo produto n3 e n4 é de: "+Dif);
	}

}
