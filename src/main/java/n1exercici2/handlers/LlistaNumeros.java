package n1exercici2.handlers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class LlistaNumeros {

	private List<Integer> numeros1 = new ArrayList<Integer>();
	private List<Integer> numeros2 = new ArrayList<Integer>();
	
	private List<Integer> emplenarLlista(){
		
		numeros1.add(10);
		numeros1.add(20);
		numeros1.add(30);
		numeros1.add(40);
		
		return numeros1;
	}
	
	private List<Integer> invertirLlista(){
		
		Collections.reverse(numeros1);
		
		return numeros1;
	}
	
	private List<Integer> inserirLlista(){
		
		numeros2.addAll(numeros1);
		
		return numeros2;
	}
	
	private List<Integer> recorrerInserirLlista(){
		
		
		ListIterator<Integer> listIt = numeros1.listIterator();
		
		while(listIt.hasNext()) {
			
			numeros2.add(listIt.next())	;
		}
		
		return numeros2;
	}
	
	public void mostrarExercici() {
		
		System.out.println(emplenarLlista());
		System.out.println(invertirLlista());
		System.out.println(inserirLlista());
		System.out.println(recorrerInserirLlista());
		
	}
}
