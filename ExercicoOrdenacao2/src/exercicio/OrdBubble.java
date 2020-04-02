package exercicio;

public class OrdBubble {
	
	public static void OrdenacaoBubble(int iVet[]) {

		int iA, iB;
		int iT;

		for (iA = 1; iA < iVet.length; iA++) {
			for (iB = iVet.length - 1; iB >= iA; iB--) {
				if (iVet[iB - 1] > iVet[iB]) {
					iT = iVet[iB - 1];
					iVet[iB - 1] = iVet[iB];
					iVet[iB] = iT;
				}
			}
		}
	}
}
