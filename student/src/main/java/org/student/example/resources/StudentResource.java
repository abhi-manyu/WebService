package org.student.example.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.student.example.beans.Student;
import org.student.example.database.StudentDatabase;

@XmlRootElement
public class StudentResource
{
   private Map<Integer,Student> students=StudentDatabase.getStudents();
   
   public StudentResource() {
	Student st=new Student(101,"abhi","marathahalli");
	students.put(1,st);
}
   
   public List<Student> getAllStudents()
   {
	   return new ArrayList<>(students.values());
   }
   
   public List<Student> addStudent(Student student)
   {
	   student.setRollno(students.size()+1);
	   students.put(student.getRollno(),student);
	   return new ArrayList<>(students.values());
   }
}
