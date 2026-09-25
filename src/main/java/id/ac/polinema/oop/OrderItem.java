package id.ac.polinema.oop;

public class OrderItem {
    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() { // mengambil harga menu dan menghitungnya dengan quantity 
        return menuItem.getPrice() * quantity;
    }
}
