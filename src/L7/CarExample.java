package L7;

public class CarExample {
    public static void main(String[] args) {
        Car bmw = new Car("X5", "a777aa", 0);

        System.out.println(bmw.getModel() + " " + bmw.getNum());
        bmw.speedUp(100);
        System.out.println(bmw.getVelocity());
        bmw.slowDown(20);
        System.out.println(bmw.getVelocity());
        System.out.println(bmw);
        bmw.setVelocity(299);
        Parking garage = new Parking();
        garage.parkCar(bmw);

        System.out.println(garage);


    }
}
