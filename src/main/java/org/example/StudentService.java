package org.example;

import java.sql.SQLException;
import java.util.List;

public class StudentService {

    private StudentDAO studentDAO;

    public StudentService() {
        studentDAO = new StudentDAO();
    }


    // CREATE
    public void addStudent(Student student) throws SQLException {

        // Validate name
        if (student.getName() == null ||
                student.getName().trim().isEmpty()) {

            System.out.println("Name cannot be empty.");
            return;
        }


        // Validate age
        if (student.getAge() <= 0) {

            System.out.println("Age must be greater than 0.");
            return;
        }


        // Validate department
        if (student.getDepartment() == null ||
                student.getDepartment().trim().isEmpty()) {

            System.out.println("Department cannot be empty.");
            return;
        }


        // If validation passes, call DAO
        studentDAO.addStudent(student);
    }


    // READ
    public List<Student> getAllStudents() throws SQLException {

        return studentDAO.getAllStudents();
    }


    // UPDATE
    public void updateStudent(Student student) throws SQLException {

        // Validate ID
        if (student.getId() <= 0) {

            System.out.println("Invalid student ID.");
            return;
        }


        // Validate name
        if (student.getName() == null ||
                student.getName().trim().isEmpty()) {

            System.out.println("Name cannot be empty.");
            return;
        }


        // Validate age
        if (student.getAge() <= 0) {

            System.out.println("Age must be greater than 0.");
            return;
        }


        // Validate department
        if (student.getDepartment() == null ||
                student.getDepartment().trim().isEmpty()) {

            System.out.println("Department cannot be empty.");
            return;
        }


        // If validation passes, call DAO
        studentDAO.updateStudent(student);
    }


    // DELETE
    public void deleteStudent(int id) throws SQLException {

        if (id <= 0) {

            System.out.println("Invalid student ID.");
            return;
        }

        studentDAO.deleteStudent(id);
    }
}
