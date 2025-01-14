package org.example.multiThreading.task3;

public class Main {
    public static void main(String[] args) {
        Questions questions = new Questions();

        while (true) {
            questions.questions();
            questions.answer();
        }
    }
}
