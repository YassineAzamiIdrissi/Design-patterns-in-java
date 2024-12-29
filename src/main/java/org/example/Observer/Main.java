package org.example.Observer;

public class Main {
    public static void main(String[] args) {
        Article article_1 = new Article(150);
        Organism o_1 = new Organism("o_1",100,article_1);

        article_1.addObserver(o_1);
        article_1.plusCher();
    }
}
