/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StudentModel {
    public  List<Student> students;


    public StudentModel() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void sortStudentsByName() {
    Collections.sort(students, new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getName().compareTo(student2.getName());
        }
    });
}


    public List<Student> getStudents() {
        return students;
    }

   

  


}
