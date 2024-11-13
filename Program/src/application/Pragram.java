package application;

import java.util.Scanner;

public class Pragram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int indice = 12;
		int soma = 0;
		int k = 1;
		
		while(k < indice) {
			k++;
			soma += k;
		}
		
		System.out.println(soma);
		sc.close();
	}

}
