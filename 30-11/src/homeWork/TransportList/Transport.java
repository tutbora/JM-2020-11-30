package homeWork.TransportList;

public abstract class Transport implements Comparable{
    private int passenger;
    private double speed;

    Transport (double speed, int passenger){
        this.passenger = passenger;
        this.speed = speed;
    }

    public void print() {
        System.out.println("Это объект транспорт ");
    }

    public int getPassenger() {
        return passenger;
    }

    public double getSpeed() {
        return speed;
    }

    public abstract void printT();
}
