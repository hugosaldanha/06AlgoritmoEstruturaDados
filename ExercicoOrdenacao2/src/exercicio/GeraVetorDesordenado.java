package exercicio;

import java.util.Random;

public class GeraVetorDesordenado {
	// metodo que gera o vetor desordenado
	static int[] gerar(int minimo, int tamanho, int valorMaximo) {
		Random random = new Random();
		int[] vet = new int[tamanho];
		for (int i = minimo; i < tamanho; i++) {
			vet[i] = random.nextInt(valorMaximo);
		}
		return vet;
	}
}
