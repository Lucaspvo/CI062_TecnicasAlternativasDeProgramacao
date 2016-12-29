package ExAdapter;

import java.util.ArrayList;
import java.util.List;

public class Somador implements SomadorEsperado {
	
	SomadorExistente somadorex = new SomadorExistente();
	List<Integer> lista = new ArrayList<Integer>();
	
	public int somaVetor(int[] vetor){
		int i;
		
		for (i=0; i<10; i++){
			lista.add(vetor[i]);
		}
		return somadorex.somaLista(lista);
	}
}
