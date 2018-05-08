package Arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ExArrList {

	public static void main(String[] args) {
		ArrayList<Integer> val = new ArrayList<Integer>();
		val.add(-113);
		val.add(-113);
		val.add(-113);
		val.add(-113);
		val.add(-113);
		val.add(-113);
		val.add(-113);
		val.add(-113);
		val.add(-113);
		val.add(-113);
		System.out.println(val);
		
		for (int i=0;i<val.size();i++) {
			System.out.println(val.get(i));
		}
		
		ArrayList<Integer> arrList1 = new ArrayList<Integer>();
		Random rnd = new Random();
		for (int i=0;i<10;i++) {
			arrList1.add(rnd.nextInt(100));
		}
		System.out.println(arrList1);
		ArrayList<Integer> arrList1Copiat = new ArrayList<Integer>(arrList1);
		arrList1Copiat.remove(9);
		arrList1Copiat.add(-7);
		
		arrList1Copiat.set(arrList1Copiat.size()-1, 12222);
		arrList1Copiat.add(12222);
		System.out.println(arrList1Copiat);
		Integer a = 12222;
		arrList1Copiat.remove(a);
		System.out.println(arrList1Copiat);
		
	}
	
	// folosind metoda de sortare din clasa Collections
	//Collections.sort(words);
	 
	// sau convertim intr-un array simplu, sortam cu metoda Arrays.sort, apoi convertim inapoi in ArrayList
	//String[] cuvinte = words.toArray(new String[words.size()]);
	//Arrays.sort(cuvinte);
	//words = new ArrayList<>(Arrays.asList(cuvinte));

}
