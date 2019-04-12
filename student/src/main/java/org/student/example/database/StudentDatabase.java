package org.student.example.database;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.student.example.beans.Student;

@XmlRootElement
public class StudentDatabase
{
   private static Map<Integer,Student> students=new HashMap<>();
   
   public static void setStudents(Map<Integer, Student> students) {
	StudentDatabase.students = students;
}
   public static Map<Integer, Student> getStudents() {
	return students;
}
}
