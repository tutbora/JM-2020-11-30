
//need parameters in command line
public class PrintArgumentMain  {
    public static void main(String[] args) {

        for (String str : args) {
            System.out.printf("Argument--> %s%n", str);
        }
       // System.out.println("Hi everyone!!!");

    }
}
