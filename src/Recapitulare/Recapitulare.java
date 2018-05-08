package Recapitulare;

public class Recapitulare {

	public static void main(String[] args) {
		System.out.println(NrDivizori(10));
		System.out.println(IsPrim(7));
		int n=20;
		int nrDeNrPrim = 1;
		for(int i=3;i<=n;i++) {
			if(i==3) {
				System.out.println(2);
			}
			if(IsPrim(i)) {
				System.out.println(i);
				nrDeNrPrim++;
			}
		}
	}

	public static int NrDivizori(int n) {
		int nrDiv = 2;
		for (int i=2;i<=n/2;i++) {
			if (n%i==0)
				nrDiv++;
		}
		return nrDiv;
	}
	
	public static boolean IsPrim(int n) {
		if(NrDivizori(n)==2)
			return true;
		return false;
	}
}
