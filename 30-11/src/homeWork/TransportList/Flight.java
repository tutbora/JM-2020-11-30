package homeWork.TransportList;

public class Flight extends Transport {

    private int maxAltitude;
    public int getMaxAltitude (){
        return maxAltitude;
    }

    Flight(double speed, int passenger, Double maxAltitude) {
        super(speed, passenger);
    }

    Flight(double speed, int passenger, int maxAltitude) {
        super(speed, passenger);
        this.maxAltitude = this.maxAltitude;
    }


    @Override
    public int compareTo(Object o) {
        Flight f = (Flight) o;
        if (this.maxAltitude > f.maxAltitude){
            return 1;
        }
        else if (this.maxAltitude == f.maxAltitude){
            return 0;
        }
        else return -1;
    }

    @Override
    public void printT() {
        System.out.println("Это");
    }
}
