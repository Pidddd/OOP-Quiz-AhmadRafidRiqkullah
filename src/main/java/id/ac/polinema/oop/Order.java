package id.ac.polinema.oop;

public class Order {
    private Customer customer;
    private OrderItem[] orderItems;
    private int itemCount;

    public Order(Customer customer, int itemCount) {
        this.customer = customer;
        this.orderItems = new OrderItem[10]; //  10 ini batas max arraynya 
        this.itemCount = itemCount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addItem(MenuItem item, int quantity) { // fugsi menambahkan item 
        if (this.itemCount < 10) {
            this.orderItems[this.itemCount] = new OrderItem(item, quantity);
            this.itemCount++;
        }
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotal() { // ini untuk total haraga
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += orderItems[i].getSubtotal();
        }
        return total;
    }

    public double getFinalTotal() { // hitung diskon kalo lebih dari 100000
        double total = getTotal();
        if (total >= 100000) {
            return total - (total * 0.10); 
        }
        return total;
    }
}
