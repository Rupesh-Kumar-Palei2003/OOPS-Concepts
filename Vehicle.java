package Abstraction;

public class Vehicle {
    public static void main(String[] args) {
        VehicleMaking car = new Car();
        car.setInitialSpeed(50);
        car.accelerate(80);
        car.decelerate(30);
        Bike bike = new Bike();
        bike.setInitialSpeed(20);
        bike.accelerate(90);
        bike.decelerate(10);
    }
    public static abstract class VehicleMaking{

        public abstract void accelerate(int speed);
        public abstract void decelerate(int speed);

        private int initialSpeed;

        public void setInitialSpeed(int initialSpeed){
            this.initialSpeed = initialSpeed;
        }
        public int getInitialSpeed() {
            return initialSpeed;
        }
    }
   static class Car extends VehicleMaking{
        @Override
        public void accelerate(int speed){
            System.out.println("speed is : "+(this.getInitialSpeed() + speed));
        }

        @Override
        public void decelerate(int speed) {
            System.out.println("speed is : "+(this.getInitialSpeed()-speed));
        }
    }

    static class Bike extends VehicleMaking{
        @Override
        public void accelerate(int speed){
            System.out.println("speed is : "+(this.getInitialSpeed() + speed));
        }

        @Override
        public void decelerate(int speed){
            System.out.println("speed is : "+(this.getInitialSpeed()-speed));
        }
    }

}
