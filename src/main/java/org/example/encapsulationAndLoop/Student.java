package org.example.encapsulationAndLoop;

import java.util.Arrays;

public class Student {
    private String name;
    private int group;
    private int age;
    private Integer[] grades = {1, 2, 3, 4, 5};

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    public Integer[] getGrades() {
        return grades;
    }



    public void setGroup(int group) {
        if(group != 0 && group >= this.group-1) {
            this.group = group;
            System.out.println("Группа изменена на: " + this.group);
        } else {
            System.out.println("Изменить группу можно только на положительное значение");
        }
    }

    public void setAge(int age) {
        if(age - 1 <= this.age && age > this.age) {
            this.age = age;
            System.out.println("Возраст изменен на: " + this.age);
        } else {
            System.out.println("Измезнить возраст можно только на 1 больше текущего");
        }
    }

     public void setGrades(Integer[] grades) {
        for(int i = 0; i < grades.length; i++) {
            if(Arrays.equals(grades, this.grades)) {
                this.grades = grades;
                System.out.println(Arrays.toString(this.grades));
            }
        }
    }

    public Student(String name, int group, int age) {
        this.name = name;
        this.group = group;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student: " +  "name = " + name + ", group = " + group + ", age = " + age + ", grades = "
                + Arrays.toString(grades);
    }
}
