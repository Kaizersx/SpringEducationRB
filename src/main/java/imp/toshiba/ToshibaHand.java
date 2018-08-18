package imp.toshiba;

import interfaces.Hand;

public class ToshibaHand implements Hand {

    @Override
    public void catchSome() {
        System.out.println("Catch by Toshiba");
    }
}
