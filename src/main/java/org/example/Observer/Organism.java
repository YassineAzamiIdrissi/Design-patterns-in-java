package org.example.Observer;

import java.util.Observable;
import java.util.Observer;

public class Organism implements Observer {
    String name;
    private double seuil;
    Article article;

    public Organism(String name, double seuil, Article article) {
        this.name = name;
        this.seuil = seuil;
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
        this.article.addObserver(this);
    }

    public double getSeuil() {
        return seuil;
    }

    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

//    @Override
//    public void update(double price) {
//        if (price < seuil) {
//            System.out.println("Alert");
//        }
//    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Article) {
            double newPrice = (double) arg;
            if (newPrice >= seuil) {
                System.out.println(name + " alerts: Le prix est " + newPrice);
            } else {
                System.out.println(name + " pass: Le prix est " + newPrice);
            }
        }
    }
}
