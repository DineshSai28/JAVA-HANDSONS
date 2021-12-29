package Handsons;
import java.util.*;
import java.util.Scanner;
public class Student {
	
	
	
	private int studentId;
	private String studentName, studentAddress, collegeName;
public Student(int studentId, String studentName, String studentAddress)
	{
	this.studentAddress=studentAddress;
	this.studentName=studentName;
	this.studentId=studentId;
	this.collegeName="NIT";
	}
	public Student(int studentId, String studentName, String studentAddress, String collegeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
}
	


