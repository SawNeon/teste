package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;
        while (true) {
            if(atual == N){
                System.out.println("Numero é da sequencia fIbonacci");
                break;
            }
            if(atual> N){
                System.out.println("Numero não é da sequencia fIbonacci");
                break;
            }
        	proximo = anterior + atual;
        	anterior = atual;
        	atual = proximo;
        }
        leitor.close();
    }
	
}