package homeWork.Transport;

public class Taxi extends Transport {
    int tariff;


    Taxi(double speed, int passenger) {
        super(speed, passenger);
    }

    Taxi(double speed, int passenger, int tariff) {
        super(speed, passenger);
        this.tariff = tariff;
    }

    public int getTariff() {
        return tariff;
    }

    @Override
    public int compareTo(Object o) {
        Taxi t = (Taxi) o;
        if (this.tariff > t.tariff) {
            return 1;
        } else if (this.tariff == t.tariff) {
            return 0;
        } else return -1;
    }
    @Override
    public void print(){
        System.out.println("Это такси со скоростью " + getSpeed() + " с пассажирами " + getPassenger() + " и тарифом " + getTariff());
    }

}
