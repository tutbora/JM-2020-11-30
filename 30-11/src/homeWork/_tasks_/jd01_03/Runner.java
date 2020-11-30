package homeWork._tasks_.jd01_03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("введите цифры через пробел для массива:");
        Scanner sc = new Scanner(System.in);
        String strLine = sc.nextLine();
        double[] arr = InOut.getArray(strLine);
        InOut.printArray(arr);
        System.out.println("\nМассив V");
        InOut.printArray(arr, "V", 5);


    }
}
