package org.example.typeofClasses.nestedClass.StudentList;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    List<Student> students = new ArrayList<Student>();

    static public class Student{
        String name;
        int grade;

        @Override
        public String toString() {
            return "Student: " + "name = " + name + ", grade = " + grade;
        }

        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    void getStudent(){
        students.add(new Student("Michael Brown", 2));
        students.add(new Student("Michael", 5));
        students.add(new Student("Brown", 3));

        for (Student student : students) {
            System.out.println(student);
        }
    }


    //для добавления объектов через Main
    void getStudent(Student s){
        students.add(s);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
