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
        return 0;
    }

    @Override
    public boolean isAvalaible(String productName) {
        return false;
    }

    @Override
    public void oneShotOrder(int quantity) {

    }

    @Override
    public void addItemToCart(String productName, int quantity) {

    }

    @Override
    public void pay() {

    }
}
