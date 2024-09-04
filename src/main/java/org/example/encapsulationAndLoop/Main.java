package org.example.encapsulationAndLoop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Джон", 2, 20);
//        student.setAge(22);
//        student.setGroup(1);


        Integer[] arrGrades = {1, 2, 3, 4, 5, 6};
        student.setGrades(arrGrades);
        System.out.println(Arrays.toString(student.getGrades()));
    }
}
