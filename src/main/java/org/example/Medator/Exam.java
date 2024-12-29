package org.example.Medator;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    List<Student> students = new ArrayList<>();
    List<Professor> correctedBy = new ArrayList<>();

    Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
