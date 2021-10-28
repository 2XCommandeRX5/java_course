package hw7;

public class Container {
    private String name;
    private int quant;
    private double price;

    public Container(String name, int quant, double price) {
        this.name = name;
        this.quant = quant;
        this.price = price;
    }

    public void setQuant(int quant) {

        this.quant = quant;
        //check for -
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuant() {
        return quant;
    }

    public double getPrice() {
        return price;
    }
}
