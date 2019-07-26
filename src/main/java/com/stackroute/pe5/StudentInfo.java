package com.stackroute.pe5;

/**
 * Create a Student class that represents the following information of a student: id, name, and age
 * all the member variables should be private .
 * a. Implement `getter and setter` .
 * b. Create a `StudentSorter` class that implements `Comparator interface` .
 * c. Write a class `MainTest` create Student class object(minimum 5)
 * d. Add these student object into a List of type Student .
 * e. Sort the list based on their age in decreasing order, for student having
 * same age, sort based on their name.
 * f. For students having same name and age, sort them according to their ID.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentInfo {

    StudentSorter studentSorter = new StudentSorter();
    List<Student> studentList = new ArrayList<>();

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        Collections.sort(this.studentList, Collections.reverseOrder(studentSorter));
        return this.studentList;
    }


}


class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        if (name == null) {
            throw new NullPointerException();
        } else if (age <= 0) {
            try {
                throw new Exception("Invalid age");
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student student, Student t1) {
        int ageDifference = student.getAge() - t1.getAge();
        if (ageDifference == 0) {
            if (student.getName().contentEquals(t1.getName())) {
                return student.getId() - t1.getId();
            }
            int nameDifference = student.getName().compareTo(t1.getName());
            if (nameDifference < 0) {
                nameDifference = nameDifference * -1;
            } else if (nameDifference > 0) {
                nameDifference = nameDifference * -1;
            }
            return nameDifference;
        }

        return ageDifference;
    }
}

