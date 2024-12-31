package org.example.Mediator;

public class ConcreteFriendMediator implements FriendMediator {
    private Friend_1 friend_1;
    private Friend_2 friend_2;
    private Friend_3 boss;

    public ConcreteFriendMediator() {
    }

    public void setFriend_1(Friend_1 friend_1) {
        this.friend_1 = friend_1;
    }

    public void setFriend_2(Friend_2 friend_2) {
        this.friend_2 = friend_2;
    }

    public void setFriend_3(Friend_3 boss) {
        this.boss = boss;
    }

    @Override
    public void sendMessage(Friend friend, String message) {
        if (friend == friend_1) {
            friend_2.notify_(message);
            boss.notify_("friend_1 sent " + message + " to friend_2");
        } else if (friend == friend_2) {
            friend_1.notify_(message);
            boss.notify_("friend_2 sent " + message + " to friend_1");
        } else if (friend == boss) {
            friend_1.notify_(message);
            friend_2.notify_(message);
        }
    }
}
