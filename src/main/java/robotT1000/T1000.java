package robotT1000;


import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;

public class T1000 implements Robot{

    Hand hand;
    Head head;
    Leg leg;

    String color;
    int year;
    boolean soundEnabled;

    public T1000() {
    }

    public T1000(Hand hand, Head head, Leg leg, String color, int year, boolean soundEnabled) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public T1000(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }




    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }


    @Override
    public void dance() {

        System.out.println("Dance by t1000");
    }

    @Override
    public void action() {

        head.calc();
        hand.catchSome();
        leg.run();

    }
}
