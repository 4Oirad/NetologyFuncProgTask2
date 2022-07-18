public class Deal {

    private double width;
    private double length;
    private int price;

    public Deal(double width, double length, int price) {
        this.width = width;
        this.length = length;
        this.price = price;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "width=" + width +
                ", length=" + length +
                ", price=" + price +
                '}';
    }
}