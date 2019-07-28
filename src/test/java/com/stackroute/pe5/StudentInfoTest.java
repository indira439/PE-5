//package com.stackroute.pe5;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//public class StudentInfoTest {
//
//    StudentInfo studentInfo;
//    StudentSorter studentSorter;
//
//    @Before
//    public void setUp() {
//        this.studentInfo = new StudentInfo();
//        this.studentSorter = new StudentSorter();
//    }
//
//    @After
//    public void tearDown() {
//        studentInfo = null;
//        studentSorter = null;
//    }
//
//
//    @Test
//    public void givenStudentInfoListShouldReturnTheSortedListBasedOnAge() {
//        //act
//        List<Student> studentList = new ArrayList<>();
//
//        Student student1 = new Student(1, "indu",23);
//        Student student2 = new Student(2, "shiva", 30);
//        Student student3 = new Student(3, "preethi", 21);
//
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//
//        studentInfo.setStudentList(studentList);
//        List<Student> expectedResult = new ArrayList<>();
//        expectedResult.add(student2);
//        expectedResult.add(student1);
//        expectedResult.add(student3);
//        //assert
//        assertEquals(expectedResult, studentInfo.getStudentList());
//    }
//
//    @Test
//    public void givenStudentInfoListShouldReturnTheSortedListBasedOnAgeFailure() {
//        //act
//        List<Student> studentList = new ArrayList<>();
//
//        Student student1 = new Student(1, "indu",23);
//        Student student2 = new Student(2, "shiva", 30);
//        Student student3 = new Student(3, "preethi", 21);
//
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//
//        studentInfo.setStudentList(studentList);
//        List<Student> expectedResult = new ArrayList<>();
//        expectedResult.add(student2);
//        expectedResult.add(student1);
//        //assert
//        assertNotEquals(expectedResult, studentInfo.getStudentList());
//    }
//
//    @Test(expected = NullPointerException.class)
//    public void givenNullShouldReturnTheNullPointerException() {
//        //act
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student(1, null,23));
//
//        studentInfo.setStudentList(studentList);
//    }
//
//
////    @Test
////    public void givenNegativeIntegerShouldReturnTheRuntimeException() {
////        //act
////        List<Student> studentList = new ArrayList<>();
////        studentList.add(new Student(1, null,-23));
////        //assert
////        assertEquals("Invalid age",Student(studentList));
////    }
//
//
//}
