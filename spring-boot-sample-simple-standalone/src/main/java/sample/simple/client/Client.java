package sample.simple.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.simple.store.IFastLane;
import sample.simple.store.IJustHaveALook;
import sample.simple.store.ILane;

@Component
public class Client implements IRun {
    @Autowired
    IFastLane fastLane;
    @Autowired
    ILane lane;
    @Autowired
    IJustHaveALook justHaveALook;
    @Override
    public void run() {
        System.out.println("C'est parti vavan");
    }
    @Override
    public void scenario1() {
        if (justHaveALook.isAvalaible("Banana") && justHaveALook.getPrice("Banana") < 3) {
            fastLane.oneShotOrder("Banana", 3, "IBAN Client");
        } else {
            System.out.println("Banana n'est pas disponible ou trop cher.");
        }
    }
    @Override
    public void scenario2() {
        if (justHaveALook.isAvalaible("Banana") && justHaveALook.getPrice("Banana") < 3) {
            lane.addItemToCart("Pomme", 3);
            double montantTotal = justHaveALook.getPrice("Pomme") * 3;
            lane.pay("IBAN Client", montantTotal);
        }
    }
}
