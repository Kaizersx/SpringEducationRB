package robotT1000;


import interfaces.Hand;
import interfaces.Head;
import interfaces.Leg;
import interfaces.Robot;
import org.springframework.beans.factory.InitializingBean;

public class T1000 extends BaseModel implements InitializingBean{


    String color;
    int year;
    boolean soundEnabled;

    public T1000() {
    }

    public T1000(Hand hand, Head head, Leg leg, String color, int year, boolean soundEnabled) {
        super(hand,head,leg);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public T1000(Hand hand, Head head, Leg leg) {
        super(hand,head,leg);
    }

    @Override
    public void dance() {

        System.out.println("Dance by t1000");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

   public void initObject(){

        System.out.println("init object");
    }

   public void destroyObject(){
        System.out.println("Delete object");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this + " - method init");
    }

    @Override
    public void action() {
        getHand().catchSome();
        getHead().calc();
        getLeg().run();
        System.out.println("Color: "+color+"\n"+"Year: "+year+"\n"+"SoundEnabled: "+soundEnabled);


    }



}
