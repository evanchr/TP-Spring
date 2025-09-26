package sample.simple.provider;

public interface IProvider {
    double getPrice(String productName);
    void order(String productName, int quantity);
}
