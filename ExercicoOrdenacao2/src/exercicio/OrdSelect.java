package exercicio;

public class OrdSelect {
	public static void OrdenacaoSelect(int iVet[]) {
		int iA, iB, iC;
		int iT;

		for (iA = 0; iA < iVet.length - 1; iA++) {
			iC = iA;
			iT = iVet[iA];
			for (iB = iA + 1; iB < iVet.length; iB++) {
				if (iVet[iB] < iT) {
					iC = iB;
					iT = iVet[iB];
				}
			}
			iVet[iC] = iVet[iA];
			iVet[iA] = iT;
		}
	}
}
