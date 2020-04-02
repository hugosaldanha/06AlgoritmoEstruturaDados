package exercicio;

import exercicio.OrdBubble;

public class Ordenacao {
	OrdBubble OrdenacaoBubble = new OrdBubble();

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		GeraVetorDesordenado gerar = new GeraVetorDesordenado();
		int[] v = GeraVetorDesordenado.gerar(0, 1000, 1000);
		OrdBubble b = new OrdBubble();
		OrdSelect s = new OrdSelect();
		OrdInsert i = new OrdInsert();

		long tempoInicialBubble;
		long tempoFinalBubble;
		long[] tempoBubble = new long[10];

		long tempoInicialSelect;
		long tempoFinalSelect;
		long[] tempoSelect = new long[10];

		long tempoInicialInsert;
		long tempoFinalInsert;
		long[] tempoInsert = new long[10];

		long somaB = 0;
		long somaS = 0;
		long somaI = 0;
		int indice = 0;

		for (int j = 0; j < 10; j++) {
			tempoInicialBubble = System.nanoTime();
			OrdBubble.OrdenacaoBubble(v);
			tempoFinalBubble = System.nanoTime();

			tempoInicialSelect = System.nanoTime();
			OrdSelect.OrdenacaoSelect(v);
			tempoFinalSelect = System.nanoTime();

			tempoInicialInsert = System.nanoTime();
			OrdInsert.OrdenacaoInsert(v);
			tempoFinalInsert = System.nanoTime();

			tempoBubble[indice] = tempoFinalBubble - tempoInicialBubble;
			tempoSelect[indice] = tempoFinalSelect - tempoInicialSelect;
			tempoInsert[indice] = tempoFinalInsert - tempoInicialInsert;

			somaB = somaB + tempoBubble[indice];
			somaS = somaS + tempoSelect[indice];
			somaI = somaI + tempoInsert[indice];
			indice++;
		}

		long mediaB = somaB / 10;
		System.out.println();
		System.out.println("Bubble Sort");
		for (int j = 0; j < 10; j++) {
			System.out.println("Rodada: " + j + " tempo: " + tempoBubble[j]);
		}
		System.out.println("Média de tempo: " + mediaB);

		long mediaS = somaS / 10;
		System.out.println();
		System.out.println("Select Sort");
		for (int j = 0; j < 10; j++) {
			System.out.println("Rodada: " + j + " tempo: " + tempoSelect[j]);
		}
		System.out.println("Média de tempo: " + mediaS);

		long mediaI = somaI / 10;
		System.out.println();
		System.out.println("Insert Sort");
		for (int j = 0; j < 10; j++) {
			System.out.println("Rodada: " + j + " tempo: " + tempoInsert[j]);
		}
		System.out.println("Média de tempo: " + mediaI);

	}

}
