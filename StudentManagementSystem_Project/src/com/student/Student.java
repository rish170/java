package com.student;

class Student extends Person {
    int rollNo;
    double marks;

    void getStudentDetails(int rollNo, double marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}