package id.ac.polinema.oop;

public class Cashier {
    public double calculateChange(Order order, double cash) {
        double finalTotal = order.getFinalTotal();
        if (cash >= finalTotal) {
            return cash - finalTotal;
        } else {
            return -1;
        }
    }
}
