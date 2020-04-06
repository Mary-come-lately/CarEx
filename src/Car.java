import java.util.Random;

public class Car{
    private String model;
    private int speed;
    private int price;

    public Car(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }
    public Car(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Random random = new Random();

    public Car start(String mod) throws IfPositiveExseption {
        if(random.nextInt(20) % 2 != 0){
            System.out.println("The car " + mod + " started up");
            return new Car();
        }
        else throw new IfPositiveExseption("Something went wrong. The car " + mod + " not started. Try again");

    }

}