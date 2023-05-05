package tw.org.iii.myclasses;

public class Student {
	private String name;
	private int ch, eng, math;
	public Student(String name,int ch,int eng,int math) {
		this.name = name ;
		this.ch =ch;
		this.eng = eng;
		this.math = math;
	
//		int sum = this.ch+ this.eng+this.math;
//		double avg = sum/3;
	}
	
	public int sum() {
		
		return this.ch+ this.eng+this.math;
	}

	public double avg() {
		// TODO Auto-generated method stub
		return (this.ch+ this.eng+this.math)/3;
	}
}
