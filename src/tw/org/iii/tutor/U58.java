package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import tw.org.iii.myclasses.Student;

public class U58 {
	public static void main(String[] args) {
		
		Student s1 = new Student("UUU", 10, 20, 30);
		System.out.println(s1.sum()+","+s1.avg());
		
	}
}