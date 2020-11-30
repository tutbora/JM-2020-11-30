package homeWork._tasks_.jd01_03;

public class InOut {
    static double[ ] getArray(String line){
       String[] elemString = line.split(" ");
       double[] mas = new double[elemString.length];
        for (int i = 0; i < elemString.length; i++) {
            mas[i] = Double.parseDouble(elemString[i]);
        }
        return mas;
    }
    static void printArray(double[ ] arr){
        for (double element : arr) {
            System.out.print(element + " ");
        }
    }
    static void printArray(double[ ] arr, String name, int columnCount){
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d] = %-4.2f ", name, i, arr[i]);
            col++;
            if ((0 == col%columnCount) || (arr.length-1 == i)){
                System.out.println();
            }
        }
    }
}
