package Repetitii;

import java.util.Scanner;

public class Vector2 {

	public static void main(String[] args) {
		
		int[] sir = new int[10];
		for (int i = 0;i<10;i++) {
			sir[i]=(int)(Math.random()*100);
			System.out.println("" + i +" "+  sir[i]);
		}
		int[] sirRev = new int[10];
		for (int i=0; i<10;i++) {
			sirRev[i] = sir[sir.length-1-i];
			System.out.println("" + i +" "+ sirRev[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		int nr = sc.nextInt();
		
		double[] note = new double[5];
		String[] nume = new String[5];
		int[] id = new int[5];
		
		
		for (int  i=0;i<5;i++) {
			System.out.println("Studentul" + i + "nota:");
			note[i]=sc.nextDouble();
			System.out.println("Studentul" + i + "nume:");
			nume[i]=sc.next();
			System.out.println("Studentul" + i + "id:");
			id[i]=sc.nextInt();
		}
		
		String [] numes = {"Kirk", "Spock", "Bones", "Chekov", "Uhura"};
		double[] notes = {6.5, 6.9, 5.9, 6.6, 6.3};
		int[] ids = {12353, 11150, 12002, 12950, 12201};
	}

}
