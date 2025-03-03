public class Question1 {
    public static void main(String[] args) {
        Vehicle mode1 = new Car("Toyota", 10, "petrol");
        Vehicle mode2 = new Bike("Honda", 5, "Yes");

        System.out.println("Car Operations : ");
        mode1.accelerate();
        mode1.accelerate();
        mode1.brake();

        System.out.println("Bike Opeations");
        mode2.accelerate();
        mode2.accelerate();
        mode2.brake();
    }    
}

abstract class Vehicle {
    private String model;
    private int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    } 

    public abstract void accelerate();
    public abstract void brake();
}

class Car extends Vehicle {
    private String fuelType;
    private String model;
    private int speed;
    public Car(String model, int speed, String fuelType) {
        super(model, speed);
        this.fuelType = fuelType;
    }

    @Override
    public void accelerate() {
        this.speed += 10;
        System.out.println("Accelearted applied");
        System.out.println("Current speed : " + this.speed);
    }

    @Override
    public void brake() {
       if(this.speed == 0) {
        System.out.println("The car stopped!");
       } else {
        this.speed -= 10;
        System.out.println("Brake applied");
        System.out.println("Current speed : " + this.speed);
       }
    }
}


class Bike extends Vehicle {
    private String helmetRequired;
    private String model;
    private int speed;
    public Bike(String model, int speed, String helmetRequired) {
        super(model, speed);
        this.helmetRequired = helmetRequired;
    }

    @Override
    public void accelerate() {
        this.speed += 5;
        System.out.println("Accelearted applied"); 
        System.out.println("Current speed : " + this.speed);
    }

    @Override
    public void brake() {

        if(this.speed == 0) {
            System.out.println("Bike stopped!");
        } else {
            this.speed -= 5;
            System.out.println("Brake applied");
            System.out.println("Current speed : " + this.speed);
        }
    }
}
