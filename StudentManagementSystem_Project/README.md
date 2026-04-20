# 🎓 Student Management System (Java)

---

## 📌 Problem Statement

Design a Java program to manage student information using inheritance. Create a base class Person that stores common details like name and age. Derive a class Student that includes additional attributes such as roll number and marks. Further extend it into another class GraduateStudent with specialization details. The program should display complete student information using inherited properties.

---

## ⚙️ Execution Flow Explanation

The program demonstrates multilevel inheritance in Java. It begins by creating an object of the GraduateStudent class, which inherits properties from both Student and Person classes. First, personal details such as name and age are assigned using methods from the base class. Then, student-specific details like roll number and marks are set using the derived class. Finally, specialization is added in the GraduateStudent class. When the display method is called, it follows a hierarchical structure where methods from parent classes are invoked step-by-step, ensuring all inherited data is printed in an organized manner.

---

## 🔄 Execution Flow Diagram

*(Replace the image below with your generated flowchart)*

![Execution Flow Diagram](./flowchart.png)

---

## 💻 Source Code

### 🧾 Person.java

```java
package com.student;

class Person {
    String name;
    int age;

    void getPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

---

### 🧾 Student.java

```java
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
```

---

### 🧾 GraduateStudent.java

```java
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
```

---

### 🧾 Main.java

```java
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
```

---

## 🖥️ Output

```text
---- Student Details ----
Name: Rishab
Age: 20
Roll No: 101
Marks: 85.5
Specialization: Computer Science
```

---

## 🧩 IDE Screenshot

*(Replace the image below with your Eclipse screenshot)*

![IDE Screenshot](./eclipse_screenshot.png)

---

## 🚀 Technologies Used

* Java
* Eclipse IDE

---

## 📚 Concepts Covered

* Inheritance (Single & Multilevel)
* Method Calling Hierarchy
* Object-Oriented Programming (OOP)

---
