package org.example.Medator;

public interface Mediator {
    void writeExam(Student student, Exam exam);

    void correctExam(Professor prof, Exam exam);

    void teach(Professor prof, Student student);
}
