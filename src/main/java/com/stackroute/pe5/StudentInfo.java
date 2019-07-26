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

    /**Create object for studentSorter class*/
    StudentSorter studentSorter = new StudentSorter();
    List<Student> studentList = new ArrayList<>();

    /**Implement setter to set students details*/
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    /**Sort the students info and return*/
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
        /**If name is null throw null pointer exception*/
        if (name == null) {
            throw new NullPointerException();
        } else if (age <= 0) {
            /**If age is less than 0 throw exception*/
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

    /**Implement getter*/
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

 /**Created a `StudentSorter` class that implements `Comparator interface`*/
class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student student, Student studentNext) {
//        int ageDifference = student.getAge() - studentNext.getAge();
//        if (ageDifference == 0) {
//            if (student.getName().contentEquals(studentNext.getName())) {
//                return student.getId() - studentNext.getId();
//            }
//            int nameDifference = student.getName().compareTo(studentNext.getName());
//            if (nameDifference < 0) {
//                nameDifference = nameDifference * -1;
//            } else if (nameDifference > 0) {
//                nameDifference = nameDifference * -1;
//            }
//            return nameDifference;
//        }
//
        //  return ageDifference;
        //  }
        return 0;
    }
}

