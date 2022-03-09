package controller;

public class ThreadMatriz extends Thread{
	private int linha;
	private int vetor[];
	
	public ThreadMatriz(int linha, int vetor[]) {
		this.linha = linha;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		int soma_vet = 0;
		
		for(int i=0; i < vetor.length; i++) {
			soma_vet = vetor[i];
		}
		
		System.out.println("A soma dos valores da linha "+ linha + " é de: " + soma_vet);
		
	}
}