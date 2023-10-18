/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import java.util.Scanner;
import model.Student;
import model.StudentModel;

/**
 *
 * @author ADMIN
 */
public class StudentManager {

    public StudentModel model;
    private Scanner sc;

    public StudentManager() {
        model = new StudentModel();
        sc = new Scanner(System.in);
    }

    public void run() {
        System.out.println("====== Collection Sort Program ====== ");
        System.out.println("--------------------------");

        while (true) {
            System.out.println("Please input student information ");

            System.out.print("Name:");

            String name = sc.nextLine();
            System.out.print("Classes:");
            String classes = sc.nextLine();
            System.out.print("Mark:");
            float mark = sc.nextFloat();
          
            Student student = new Student(name, mark, classes);
            
            model.addStudent(student);
            
            System.out.println("Student added successfully.");

            System.out.print("Do you want to enter more student information? (Y/N): ");

            String choice = sc.nextLine().trim();
            
            if (choice.equalsIgnoreCase("N")) {
                break;
            }
          
        }

        model.sortStudentsByName();
        List<Student> students = model.getStudents();
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("Student List (Sorted by Name):");
            for (int i = 0; i < students.size(); i++) {
                System.out.println("-------------Student " + (i + 1) + "-------------");
                System.out.println(students.get(i));
            }
        }
    }
}
