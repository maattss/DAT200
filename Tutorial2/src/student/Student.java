package student;

import java.io.Serializable;

public class Student implements Serializable {
	private int studentnumber;
	private String firstName;
	private String lastName;
	private String stdyDirection;
	private int year;
	
	private static int nextStudentnumber = 1;
	
	public Student(String firstName, String lastName, String stdyDirection) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.stdyDirection = stdyDirection;
		studentnumber = nextStudentnumber;
		nextStudentnumber++;
		year = 1;
	}
	
	public Student(int id, String firstName, String lastName, String stdyDirection, int currentYear) {
		this.studentnumber = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.stdyDirection = stdyDirection;
		this.year = currentYear;
		if (nextStudentnumber <= id) nextStudentnumber = id+1;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public int getStudentnumber() {
		return studentnumber;
	}

	public void setStudentnumber(int studentnumber) {
		this.studentnumber = studentnumber;
		if (studentnumber >= nextStudentnumber) nextStudentnumber = studentnumber+1;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStdyDirection() {
		return stdyDirection;
	}

	public void setStdyDirection(String stdyDirection) {
		this.stdyDirection = stdyDirection;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static int getNextStudentnumber() {
		return nextStudentnumber;
	}
	
	@Override public String toString() {
		return studentnumber + ": " + lastName + ", " + firstName + ": " + stdyDirection + " " + year;
	}
}
