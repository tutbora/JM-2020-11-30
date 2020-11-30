package homeWork.TransportList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Double[] speed = {3410.00, 2730.00, 2780.00, 3390.00, 4410.00, 5630.00};
        List<Double> speedArr = Arrays.asList(speed);

        List<Integer> passengerArr = new ArrayList<>(){{
            add(341);
            add(273);
            add(178);
            add(739);
            add(441);
            add(752);
        }};

        List<Integer> tariffArr = new ArrayList<>();
        tariffArr.add(134);
        tariffArr.add(190);
        tariffArr.add(127);
        tariffArr.add(130);
        tariffArr.add(142);
        tariffArr.add(140);

        int element = 6;
        List<Double> maxAltitudeArr = new ArrayList<>();
        for (int i = 0; i < element; i++)
        {
            Double b = (Math.random() * 31 + 1);
            maxAltitudeArr.add(i, b);
        }

        List<Transport> flight = Helper.createFlight(speedArr, passengerArr, maxAltitudeArr);
        List<Transport> taxis = Helper.createTaxi(speedArr, passengerArr, tariffArr);
        Helper.printT(flight);
        Helper.printT(taxis);


        Helper.printT(flight);
        Helper.printT(taxis);


    }
}
