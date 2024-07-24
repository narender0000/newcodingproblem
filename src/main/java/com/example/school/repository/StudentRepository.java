// Write your code here
package com.example.school.repository;

import java.util.*;
import com.example.school.model.*;

public interface StudentRepository {
    ArrayList<Student> getStudents();

    Student getStudentById(int studentId);

    Student addStudent(Student student);

    String addStudentList(ArrayList<Student> studentList);

    Student updateStudent(int studentId, Student student);

    void deleteStudent(int studentId);

}