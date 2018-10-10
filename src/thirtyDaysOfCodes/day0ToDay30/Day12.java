package day0ToDay30;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    
    void setTestScores(int[] testScores) {
        this.testScores = testScores;
    }
    
    int[] getTestScores() {
        return testScores;
    }
    
    String calculate() {
        String result;
        int size = this.testScores.length;
        int a = 0;
        int total = 0;
        for (int i = 0; i < size; i++) {
            total = total + this.testScores[i];
        }
        a = total / size;
        if ((a >= 90) && (a <= 100)) {
            result = "O";
        } else if ((a >= 80) && (a < 90)) {
            result = "E";
        } else if ((a >= 70) && (a < 80)) {
            result = "A";
        } else if ((a >= 55) && (a < 70)) {
            result = "P";
        } else if ((a >= 40) && (a < 55)) {
            result = "D";
        } else {
            result = "T";
        }
        return result;
    }
    
}

public class Day12 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}

}
