package Varargs;

public class VarArgs {

	public static void main(String[] args) {
		metoda1(34, 363, 546, 235345);
	    metoda1(45, 43543, 577, 655, 2134, 21, 67, 8747, 134234, 25372);
	 
	    metoda2("asdg", "fdgfd", "hhads", "hsed");
	    metoda2("asdg", "fdgfd", "hhads", "hsed", "dfgv", "fdgr", "fdyerfa", "dsgjkse");
	 
	   

	}
	
	public static void metoda1 (int... numere){  //adică număr variabil de int-uri
	    //la rulare se formeaza un array de tip int[] numere care contine parametrii
	    for (int numar : numere){
	        System.out.println(numar);
	    }
	}
	 
	public static void metoda2 (String... siruri){  //adică număr variabil de string-uri
	    for (int i = 0; i < siruri.length; i++){
	        System.out.println(siruri[i]);
	    }
	}
	 
	public static void metoda3 (Object... obiecte){  //adică număr variabil de obiecte
	    //la rulare se formeaza un array de tip Object[] obiecte care contine parametrii
	    for (Object obiect : obiecte){
	        System.out.println(obiect);
	    }
	}
}
