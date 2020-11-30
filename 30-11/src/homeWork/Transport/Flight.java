package homeWork.Transport;

public class Flight extends Transport {

    private double maxAltitude;

    Flight(double speed, int passenger) {
        super(speed, passenger);
    }

    public double getMaxAltitude() {
        return maxAltitude;
    }

    Flight(double speed, int passenger, double maxAltitude) {
        super(speed, passenger);
        this.maxAltitude = maxAltitude;
    }

    @Override
    public int compareTo(Object o) {
        Flight f = (Flight) o;
        if (this.maxAltitude > f.maxAltitude) {
            return 1;
        } else if (this.maxAltitude == f.maxAltitude) {
            return 0;
        } else return -1;
    }
    @Override
    public void print(){
        System.out.println("Это самолет со скоростью " + getSpeed() + " с пассажирами " + getPassenger() + " максимальной высотой " + getMaxAltitude());
    }
}

