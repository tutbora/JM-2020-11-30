package lection;

public class Main {
    public static void main(String[] args) {
    String line = "51 12 36 87 12 96 55 10 369 54 789";
   // int v[] = InOut.stringLineToIntArray(line);
        System.out.printf("%1$+020.10f", Math.PI);
        System.out.printf("%1$+020.10f", Math.PI);
        System.out.println();
        System.out.println();
        System.out.printf("%-5s%-12s%-25s%-10s%n", "Код", "За единиц", "Валюты", "Бел. рублей");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-5s%-12d%-25s%-10.4f%n", "RUR", 100, "Российский рубль", 3.48);
        System.out.printf("%-5s%-12d%-25s%-10.4f%n", "EUR", 1, "Евро", 3.10123);
        System.out.printf("%-5s%-12d%-25s%-10.4f%n", "USD", 1, "Доллар США", 2.6103);
        System.out.printf("%-5s%-12d%-25s%-10.4f%n", "GBP", 1, "Фунт стерлингов", 3.3502);
        System.out.printf("%-5s%-12d%-25s%-10.4f%n", "DKK", 10, "Датская крона", 4.162);
        System.out.printf("%-5s%-12d%-25s%-10.4f%n", "AUD", 1, "Австралийский доллар", 1.901);
        System.out.printf("%-5s%-12d%-25s%-10.4f%n", "KZT", 100, "Казахский тенге", 0.61);
    }
}