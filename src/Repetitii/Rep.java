package Repetitii;
import java.util.Scanner;



public class Rep {
	static void modificaReferinta(Student st) {
	    st = new Student("Gigel", 10);
	    st.averageGrade = 10;
	}

	static void modificaObiect(Student s) {
	    s.averageGrade = 10;
	}
	
	public static void main(String[] args) {
		
		Student s = new Student("Andrei", 5);
        modificaReferinta(s);
        /*
         * In stiva el creeaza o noua referinta la o alta instanta de student
         * In momentul cand termina cu metoda respectiva modificaReferinta(s)
         *  se intoarce pe stiva... uita de noua referinta Student("Gigel", 10)
         *  si va vedea doar prima referinta la instanta student 
         * cu valoarea Student("Andrei", 5)
         * 
         * 
         */
        //s = new Student("Gigel", 10);// 1
        System.out.println(s.getName()); // 1'
        System.out.println(s.averageGrade);
        modificaObiect(s); // 2
        System.out.println(s.averageGrade); // 2'
		
		
		
		
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduceti un nr de la tastatura:");
		int nr = sc.nextInt();
		for (int i=0; i<nr;i++) {
			System.out.println(i);
		}*/
		
	}
}