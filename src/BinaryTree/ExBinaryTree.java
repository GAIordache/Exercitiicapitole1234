// NETERMINAT

package BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class ExBinaryTree {

	public static void main(String[] args) {
		List<Integer> intList = new LinkedList<Integer>();
		if(intList.get(0)==null) {
			System.out.println("da");
		}
		

	}

	public static class BinaryTree{
		int indxCentru;
		public void addElemnt(List<Integer> lista, Integer element) {
			if (lista.size() == 0) {
				lista.add(element);
				
			} else {
				if (lista.get(indxCentru) < element && lista.get(indxCentru+1)==null) {
					
				}
			}
			
		}
	}
	
}
