package homeWork.Transport;

public class Helper {

    private static Flight createFlight(double speed, int passenger, double maxAltitude) {
        Flight boing = new Flight(speed, passenger, maxAltitude);
        return boing;
    }

    private static Taxi createTaxi(double speed, int passenger, int tariff) {
        Taxi bus = new Taxi(speed, passenger, tariff);
        return bus;
    }

    public static Flight[] createFlight(double[] speed, int[] passenger, double[] maxAltitude) {
        Flight[] f = new Flight[speed.length];
        for (int i = 0; i < f.length; i++) {
            Flight tempF = createFlight(speed[i], passenger[i], maxAltitude[i]);
            f[i] = tempF;

        }
        return f;
    }

    public static Taxi[] createTaxi(double[] speed, int[] passenger, int[] tariff) {
        Taxi[] t = new Taxi[speed.length];
        for (int i = 0; i < t.length; i++) {
            Taxi tempT = createTaxi(speed[i], passenger[i], tariff[i]);
            t[i] = tempT;

        }
        return t;

    }

    public static void print(Transport[] printTransport) {

        for (int i = 0; i < printTransport.length; i++) {
            printTransport[i].print();
        }

    }


}
