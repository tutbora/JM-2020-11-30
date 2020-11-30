package homeWork.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringHelper {
    public static List<String> listString(int x) {
        List<String> listSort = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x; i++) {
            String temp = sc.nextLine();
            listSort.add(temp);
        }
        return listSort;
    }

    public static String getLongString(List<String> listToSort) {
        String longString = listToSort.get(0);
        for (int i = 1; i < listToSort.size(); i++) {
            if (listToSort.get(i).length() > longString.length()) {
                longString = listToSort.get(i);
            }
        }
        return longString;
    }

    public static String getShortString(List<String> listToSort) {
        String shortString = listToSort.get(0);
        for (int i = 1; i < listToSort.size(); i++) {
            if (listToSort.get(i).length() < shortString.length()) {
                shortString = listToSort.get(i);
            }

        }
        return shortString;
    }

    public static int getIndexLong(List<String> listToSort) {
        String longString = listToSort.get(0);
        int indexLongString = 0;
        for (int i = 1; i < listToSort.size(); i++) {
            if (listToSort.get(i).length() > longString.length()) {
                longString = listToSort.get(i);
                indexLongString = i;
            }
        }
        return indexLongString;
    }

    public static int getIndexShort(List<String> listToSort) {
        String shortString = listToSort.get(0);
        int indexShortString = 0;
        for (int i = 1; i < listToSort.size(); i++) {
            if (listToSort.get(i).length() < shortString.length()) {
                shortString = listToSort.get(i);
                indexShortString = i;
            }
        }
        return indexShortString;
    }

    //здесь встречается первой самая длинная строка или >>
    //здесь встречается первой самая короткая строка
   /* public static boolean getLongOrShort() {
        if ()
    }
*/
}
