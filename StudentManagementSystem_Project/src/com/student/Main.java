package com.student;

public class Main {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();

        gs.getPersonDetails("Rishab", 20);
        gs.getStudentDetails(101, 85.5);
        gs.getGraduateDetails("Computer Science");

        System.out.println("---- Student Details ----");
        gs.displayGraduate();
    }
}