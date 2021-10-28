package L7;

public class Car {
    private String model;
    private String num;
    private double velocity;

    public Car(String model, String num, double velocity) {
        this.model = model;
        this.num = num;
        this.velocity = velocity;
    }

    public Car(String model, String num){
        this.model = model;
        this.num = num;
    }

    public void speedUp(double val){
        velocity += val;
    }

    public void slowDown(double val) {
        velocity -= val;
    }

    public void setVelocity(double velocity) {
        if (velocity > 200) {
            velocity = 200;
        }
        this.velocity = velocity;
    }

    public double getVelocity() {
        return velocity;
    }

    public String getModel() {
        return model;
    }

    public String getNum() {
        return num;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Model: " + model + " number " + num + " Velocity " + velocity;
    }


}
