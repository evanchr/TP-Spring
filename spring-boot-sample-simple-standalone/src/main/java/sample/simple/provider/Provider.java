package sample.simple.provider;

import org.springframework.stereotype.Component;

@Component
public class Provider implements IProvider {

    @Override
    public double getPrice(String productName) {
        return 1;
    }

    @Override
    public void order(String productName, int quantity) {
        System.out.println("Le magasin est réapprovisionné de " + quantity + " " + productName + "(s).");
    }
}
