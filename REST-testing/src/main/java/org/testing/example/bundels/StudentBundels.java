package org.testing.example.bundels;

import java.util.ArrayList;
import java.util.List;

import org.testing.example.beans.Student;

public class StudentBundels
{
	Student st1= new Student(46415616,"Maharaja","Hydrabad","78.96","32533156599");
	Student st2= new Student(57641063,"Maharani","Bhubaneswar","96.52","56846158968");
	Student st3= new Student(45685245,"Prince","Bangalore","89.74","684150689566");
	public List<Student> getAllStudents()
	{
		List<Student> li=new ArrayList<Student>();
		li.add(st1);
		li.add(st2);
		li.add(st3);
		return li;
	}
	
}
