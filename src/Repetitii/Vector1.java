package Repetitii;

public class Vector1 {

	public static void main(String[] args) {
		int[] sir1 = new int[5];
		sir1[0]=2;
		sir1[1]=2;
		sir1[2]=2;
		sir1[3]=2;
		sir1[4]=2;
		
		int[] sir2 = new int[5];
		sir2[0]=sir1[0];
		for (int i=0;i<5;i++) {
			System.out.println(sir1[i] + " ///" + sir2[i]);
		}
		
		
		

	}

}
