package org.example.Builder;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        PersonCardIdBuilder cardBuilder = new PersonCardIdBuilder();
        Person person1 = personBuilder.id(1).
                age(20).
                name("yassine").
                height(1).build();
        System.out.println(person1);
        Director director = new Director();
        director.createUnknown(personBuilder);
        director.createUnknown(cardBuilder);
        Person unknown = personBuilder.build();
        PersonIdCard unknownCard = cardBuilder.build();
        System.out.println(unknown);
        System.out.println(unknownCard);
    }
}
