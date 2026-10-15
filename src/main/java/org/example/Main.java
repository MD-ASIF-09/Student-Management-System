package org.example;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();

        try {

            while (true) {

                System.out.println("\n========== STUDENT MANAGEMENT SYSTEM ==========");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                String choiceInput = scanner.nextLine();

                int choice;

                try {
                    choice = Integer.parseInt(choiceInput);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                    continue;
                }


                switch (choice) {

                    case 1:

                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter age: ");
                        String ageInput = scanner.nextLine();

                        int age;

                        try {
                            age = Integer.parseInt(ageInput);
                        } catch (NumberFormatException e) {
                            System.out.println("Age must be a valid number.");
                            break;
                        }

                        System.out.print("Enter department: ");
                        String department = scanner.nextLine();

                        Student student =
                                new Student(name, age, department);

                        studentService.addStudent(student);

                        break;


                    case 2:

                        List<Student> students =
                                studentService.getAllStudents();

                        System.out.println("\nID | Name | Age | Department");
                        System.out.println("--------------------------------");

                        for (Student s : students) {

                            System.out.println(
                                    s.getId() + " | " +
                                            s.getName() + " | " +
                                            s.getAge() + " | " +
                                            s.getDepartment()
                            );
                        }

                        break;


                    case 3:

                        System.out.print("Enter student ID: ");
                        String idInput = scanner.nextLine();

                        int id;

                        try {
                            id = Integer.parseInt(idInput);
                        } catch (NumberFormatException e) {
                            System.out.println("ID must be a valid number.");
                            break;
                        }


                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();

                        System.out.print("Enter new age: ");
                        String newAgeInput = scanner.nextLine();

                        int newAge;

                        try {
                            newAge = Integer.parseInt(newAgeInput);
                        } catch (NumberFormatException e) {
                            System.out.println("Age must be a valid number.");
                            break;
                        }


                        System.out.print("Enter new department: ");
                        String newDepartment = scanner.nextLine();

                        Student updatedStudent =
                                new Student(
                                        id,
                                        newName,
                                        newAge,
                                        newDepartment
                                );

                        studentService.updateStudent(updatedStudent);

                        break;


                    case 4:

                        System.out.print("Enter student ID to delete: ");
                        String deleteIdInput = scanner.nextLine();

                        int deleteId;

                        try {
                            deleteId = Integer.parseInt(deleteIdInput);
                        } catch (NumberFormatException e) {
                            System.out.println("ID must be a valid number.");
                            break;
                        }

                        studentService.deleteStudent(deleteId);

                        break;


                    case 5:

                        System.out.println("Exiting program...");
                        return;


                    default:

                        System.out.println("Invalid choice! Please choose 1-5.");
                }
            }

        } catch (SQLException e) {

            System.out.println("Database error: " + e.getMessage());

        } finally {

            scanner.close();
        }
    }
}
