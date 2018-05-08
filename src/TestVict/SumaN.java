package TestVict;
import java.util.Scanner;
import java.lang.Math;

public class SumaN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti un numar:");
		int n = sc.nextInt();
		double s = 0.00;
		if(n <=0 ) {
			System.out.println(0);
		}
		else
		{
			for (double i=1.00; i<=4*n;i=i+4) {
				System.out.println(i);
				s = (double) (s + (double)(1/i) - (double)(1/(i+2)));
				System.out.println(s);
			}
		}
		System.out.println("Suma este egala cu pi/4?");
		System.out.println(Math.PI/4);
		System.out.println(s);
		System.out.println((double)(1.00 - 1.00/3.00 + 1.00/5.00 - 1.00/7.00));
		
	}

}
