package homeWork.Transport;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] speed = {3410, 2730, 2780, 3390, 4410, 5630};
        int[] passenger = {41, 273, 178, 739, 441, 752};
        double[] maxAltitude = {13401, 19073, 12708, 13039, 14210, 14002};
        int[] tariff = {1, 3, 8, 9, 4, 7};

        Flight[] flights = Helper.createFlight(speed, passenger, maxAltitude);
        Taxi[] taxis = Helper.createTaxi(speed, passenger, tariff);

        Helper.print(flights);
        Helper.print(taxis);
        Arrays.sort(flights);
        Arrays.sort(taxis);
        Helper.print(flights);
        Helper.print(taxis);

    }
}
