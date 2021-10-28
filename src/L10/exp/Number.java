package L10.exp;

public class Number implements Executable {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    @Override
    public double execute() {
        return value;
    }
}

