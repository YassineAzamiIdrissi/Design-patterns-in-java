package org.example.Observer;

import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {
    String name;
    private double pouvoirAchat;
    Article article;

    public Client(String name,double pouvoirAchat,Article article) {
        this.name = name;
        this.pouvoirAchat = pouvoirAchat;
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
    }

    public double getPouvoirAchat() {
        return pouvoirAchat;
    }

    public void setPouvoirAchat(double pouvoirAchat) {
        this.pouvoirAchat = pouvoirAchat;
    }

//    @Override
//    public void update(double price) {
//        if (price > pouvoirAchat) {
//            System.out.println("Expensive price for client...");
//        }
//    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Article) {
            double newPrice = (double) arg;
            if(newPrice > pouvoirAchat) {
                System.out.println("Prix n'est plus supportable pour le client "+name);
            } else {
                System.out.println(name+" : Ok c'est obtenable ");
            }
        }
    }
}
