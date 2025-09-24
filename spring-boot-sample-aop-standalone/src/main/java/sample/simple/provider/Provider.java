package sample.simple.provider;

import org.springframework.stereotype.Component;

@Component
public class Provider implements IProvider {

    @Override
    public double getPrice(String productName) {
        return 0;
    }

    @Override
    public void order(int quantity) {

    }
}
