package Repetitii;

public class Student {
	int averageGrade;
	String name;
	public Student(String name,int averageGrade) {
		super();
		this.averageGrade = averageGrade;
		this.name = name;
	}
	public int getAverageGrade() {
		return averageGrade;
	}
	public void setAverageGrade(int averageGrade) {
		this.averageGrade = averageGrade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
