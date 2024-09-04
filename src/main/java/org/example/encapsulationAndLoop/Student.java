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

     public boolean setGrades(Integer[] grades) {
         if(grades.length <= this.grades.length) {
             return false;
         }
         for (int i = 0; i < this.grades.length; i++) {
             boolean count = false;
             block2:
             for(int j = 0; j < grades.length; j++) {
                 if(grades[i].equals(this.grades[j])) {
                     count = true;
                     break block2;
                 }
             }
             if(!count) {
                 return false;
             }
         }
         this.grades = grades;
         return true;
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




//         for (int i = 0; i < this.grades.length; i++) {
//             if(grades[i] != null && this.grades[i] != null){
//                 if(Arrays.equals(grades, this.grades) && grades.length > this.grades.length) {
//                     this.grades = grades;
//                     System.out.println(Arrays.toString(this.grades));
//                 }
//             }
//         }