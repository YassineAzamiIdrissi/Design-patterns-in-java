package org.example.Medator;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    List<Exam> correctedPapers = new ArrayList<>();
    List<Student> students = new ArrayList<>();

    Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
