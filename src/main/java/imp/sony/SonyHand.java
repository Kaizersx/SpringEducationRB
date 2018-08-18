package imp.sony;

import interfaces.Hand;

public class SonyHand implements Hand {

    @Override
    public void catchSome() {
        System.out.println("catch by Sony");
    }
}
