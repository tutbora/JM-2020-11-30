package homeWork.TransportList;

public class Taxi extends Transport {

    private int tariff;
    public int getTariff() {
        return tariff;
    }

    Taxi(double speed, int passenger) {
        super(speed, passenger);
    }

    Taxi(double speed, int passenger, int tariff) {
        super(speed, passenger);
        this.tariff = tariff;
    }

    @Override
    public int compareTo(Object o) {
        Taxi f = (Taxi) o;
        if (this.tariff > f.tariff){
            return 1;
        }
        else if (this.tariff == f.tariff){
            return 0;
        }
        else return -1;
    }
    @Override
    public void printT(){
        System.out.println();
    }

}
