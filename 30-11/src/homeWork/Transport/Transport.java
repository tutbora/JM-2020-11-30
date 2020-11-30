package homeWork.Transport;

public abstract class Transport implements Comparable {
    private double speed;
    private int passenger;


    Transport(double speed, int passenger){
        this.speed = speed;
        this.passenger = passenger;
    }

    public void print() {
        System.out.println("Это объект транспорт");
    }

    public double getSpeed() {
        return speed;
    }

    public int getPassenger() {
        return passenger;
    }
}
