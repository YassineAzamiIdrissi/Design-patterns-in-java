package org.example.Mediator;

import org.example.Medator.ConcreteMediator;

public class Main {

    public static void main(String[] args) {
        ConcreteFriendMediator mediator = new ConcreteFriendMediator();

        Friend_1 friend_1 = new Friend_1();
        Friend_2 friend_2 = new Friend_2();
        Friend_3 boss = new Friend_3();

        mediator.setFriend_1(friend_1);
        mediator.setFriend_2(friend_2);
        mediator.setFriend_3(boss);

        friend_1.setMediator(mediator);
        friend_2.setMediator(mediator);
        boss.setMediator(mediator);

        friend_1.send("Wech le gros");
    }
}
