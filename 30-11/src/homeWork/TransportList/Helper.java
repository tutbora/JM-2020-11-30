package homeWork.TransportList;

import java.util.ArrayList;
import java.util.List;

public class Helper {

    private static Flight createFlight(double speed, int passenger, Double maxAltitude){
        Flight boeing = new Flight(speed, passenger, maxAltitude);
        return boeing;
    }

    private static Taxi createTaxi(double speed, int passenger, int tariff) {
        Taxi sedan = new Taxi(speed, passenger, tariff);
        return sedan;
    }

    public static List<Transport> createFlight(List<Double> speed, List<Integer> passenger, List<Double> maxAltitude){
        List<Transport> flightList = new ArrayList<>();
        for(int i = 0; i < maxAltitude.size(); i++ ){
            Transport temp = createFlight(speed.get(i), passenger.get(i), maxAltitude.get(i));
            flightList.add(temp);
        }
        return flightList;
    }

    public static List<Transport> createTaxi(List<Double> speed, List<Integer> passenger, List<Integer> tariff) {
        List<Transport> taxiList = new ArrayList<>();
        for (int i = 0; i < speed.size(); i++) {
            Transport temp = createTaxi(speed.get(i), passenger.get(i), tariff.get(i));
            taxiList.add(temp);
        }
        return taxiList;
    }

    public static void printT(List<Transport> printTransport) {

        for (int i = 0; i < printTransport.size(); i++)
        {
            printTransport.get(i).print();
        }
    }


}
