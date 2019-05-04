package com.hackerrank.practice.java.dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
	
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
	
}

public class JavaSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(((Double) o2.getCgpa()).compareTo((Double) o1.getCgpa()) == 0) 
					if(o1.getFname().compareTo(o2.getFname()) == 0) 
						return ((Integer) o1.getId()).compareTo((Integer) o2.getId());
					else 
						return o1.getFname().compareTo(o2.getFname());
				else 
					return ((Double) o2.getCgpa()).compareTo((Double) o1.getCgpa());
			}			
		});

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
		in.close();
	}

}
