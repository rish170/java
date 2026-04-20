package com.student;

class GraduateStudent extends Student {
    String specialization;

    void getGraduateDetails(String specialization) {
        this.specialization = specialization;
    }

    void displayGraduate() {
        displayStudent();
        System.out.println("Specialization: " + specialization);
    }
}