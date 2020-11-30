package lection;

import java.util.Arrays;


public class TaskLambda {
    public static void main(String[] args) {
        String m = "174,3,67,3,4,777,3,34,5,641,8,3,213,6,7,4,3";
        String[] array = m.split(",");
        //Arrays.sort(m, (o1, o2) -> (o2 - o1));
        Arrays.stream(array)
                .limit(array.length-3)
                .skip(3)
                .map(Integer::valueOf)
                .sorted((o1, o2) -> (o2 - o1))
        .forEach(i-> System.out.print(i + " "));
    }
}
