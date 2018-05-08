package Foreach;

import java.util.Scanner;
import java.util.Random;

public class Exercitii {

	public static void main(String[] args) {
		int[] vector1 = new int[] {11,131,223,44,33,56,77,88,99,120};
		for (int x : vector1) {
			System.out.println(x);
		}
	Scanner sc = new Scanner(System.in);
	System.out.println("dati n:");
	int n = sc.nextInt();
	int[] vector2 = new int[n];
	Random rnd = new Random();
	
	for (int i=0;i<n;i++) {
		vector2[i]=  rnd.nextInt(100);
		System.out.println(vector2[i]);
	}
	
	int[] vect3 = {0,1,3};

	}

}
