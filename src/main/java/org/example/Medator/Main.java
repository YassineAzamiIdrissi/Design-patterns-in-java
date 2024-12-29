package org.example.Medator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Professor professor = new Professor();
        Student student = new Student();
        Exam exam = new Exam();
        
    }
}
