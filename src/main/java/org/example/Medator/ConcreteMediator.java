package org.example.Medator;

public class ConcreteMediator implements Mediator {
    @Override
    public void writeExam(Student student, Exam exam) {
        exam.students.add(student);
        student.examsPassed.add(exam);
    }

    @Override
    public void correctExam(Professor prof, Exam exam) {
        prof.correctedPapers.add(exam);
        exam.correctedBy.add(prof);
    }

    @Override
    public void teach(Professor prof, Student student) {
        prof.students.add(student);
        student.taughtBy.add(prof);
    }
}
