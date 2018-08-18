package imp.sony;

import interfaces.Leg;

public class SonyLeg implements Leg{

    @Override
    public void run() {
        System.out.println("Run by Sony");
    }
}
