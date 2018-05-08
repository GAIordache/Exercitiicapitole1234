package ExerTablouri;
import java.util.Scanner;
import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nr randuri matrice:");
		int n = sc.nextInt();
		System.out.println("Nr coloane matrice:");
		int m = sc.nextInt();
		int[][] tablou = new int[n][m];
		Random rnd = new Random();
		for (int i=0;i<tablou.length;i++) {
			System.out.print("|");
			for (int j=0;j<tablou[i].length;j++) {
				tablou[i][j]= rnd.nextInt(10);
				System.out.print(tablou[i][j]);
				System.out.print("|");
			}
			System.out.println("");
		}
		
	}
		
	
}
