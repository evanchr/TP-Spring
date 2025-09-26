package sample.simple.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.simple.bank.IBank;
import sample.simple.provider.IProvider;

@Component
public class Store implements IFastLane, IJustHaveALook, ILane {
    @Autowired
    IBank bank;
    @Autowired
    IProvider provider;

    @Override
    public double getPrice(String productName) {
        return 2;
    }

    @Override
    public boolean isAvalaible(String productName) {
        return true;
    }

    @Override
    public void oneShotOrder(String productName, int quantity, String compteClient) {
        System.out.println("Le stock du magasin est diminué de " + quantity + " " + productName + "(s).");
        bank.transfert(compteClient, "IBAN Store", this.getPrice(productName)*quantity);
        provider.getPrice("Banana");
        provider.order("Banana", quantity);
    }

    @Override
    public void addItemToCart(String productName, int quantity) {
        System.out.println("Le client ajoute " + quantity + " " + productName + " dans son panier.");
    }

    @Override
    public void pay(String compteClient, double montantTotal) {
        System.out.println(compteClient + " doit payer " + montantTotal);
        bank.transfert(compteClient, "IBAN Store", montantTotal);
    }
}
