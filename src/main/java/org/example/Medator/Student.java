package org.example.Medator;

import java.util.ArrayList;
import java.util.List;

public class Student {
    List<Exam> examsPassed = new ArrayList<>();
    List<Professor> taughtBy = new ArrayList<>();

    Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
