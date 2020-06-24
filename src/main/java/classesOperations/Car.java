package classesOperations;

public class Car {
    public boolean start;
    public double speed;

    public Car(){
        this.start = false;
        this.speed = 0;
    }

    public void turnOn(){
        this.start = true;
    }

    public void turnOff(){
        this.start = false;
    }

    public void ride(double speed){
        if (this.start == true){
            this.speed = speed;
        }
    }
}
