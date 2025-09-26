package sample.simple.bank;

import org.springframework.stereotype.Component;

@Component
public class Bank implements IBank {
    @Override
    public void transfert(String compteClient, String compteStore, double montant) {
        System.out.println(compteClient + " verse " + montant + " à " + compteStore);
    }
}
