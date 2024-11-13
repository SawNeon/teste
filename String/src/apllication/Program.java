package apllication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		int quantityA = 0;
		char caracter;
		
		for(int i = 0; i < line.length(); i++) {
			caracter = line.charAt(i);
			
			if(caracter == 'A' || caracter == 'a' ) {
				quantityA ++;
			}
			
		}
		if(quantityA != 0) {
			System.out.println("A quantidade de A é: " + quantityA);
		}else {
			System.out.println("A string não tem A");
		}
		
		
		
		
		sc.close();
		
	}

}
