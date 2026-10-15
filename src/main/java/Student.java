package org.example;

public class Student {

    private int id;
    private String name;
    private int age;
    private String department;


    // Constructor for existing student
    public Student(int id, String name, int age, String department) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }


    // Constructor for new student
    public Student(String name, int age, String department) {

        this.name = name;
        this.age = age;
        this.department = department;
    }


    // Getter for ID
    public int getId() {
        return id;
    }


    // Getter for name
    public String getName() {
        return name;
    }


    // Getter for age
    public int getAge() {
        return age;
    }


    // Getter for department
    public String getDepartment() {
        return department;
    }


    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }


    // Setter for name
    public void setName(String name) {
        this.name = name;
    }


    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }


    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }
}
