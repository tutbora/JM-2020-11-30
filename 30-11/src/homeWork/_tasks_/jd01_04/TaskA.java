package homeWork._tasks_.jd01_04;

public class TaskA {
    public static void main(String[] args) {
        printMulTable();
    }
    static void printMulTable(){
        int firstNum = 2;
        int secondNum = 2;
        for (int i = 2; i < 10; i++) {


            System.out.println(firstNum + "*" + secondNum + "=" + firstNum * secondNum + " ");
            firstNum++;
            for (int j = 0; j < 10; j++) {
                System.out.println();
            }
        }

    }
}
