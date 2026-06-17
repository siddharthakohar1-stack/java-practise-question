//Siddhartha Kohar - 116234
class Electronics implements Discountable {
    private String name;
    private double price;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void applyDiscount(double percentage) {
        // Protect logic against invalid or unrealistic discount rates
        if (percentage > 0 && percentage <= 100) {
            double discountAmount = this.price * (percentage / 100.0);
            this.price -= discountAmount;
            System.out.println(name + ": Applied " + percentage + "% discount. New Price: $" + String.format("%.2f", this.price));
        }
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}