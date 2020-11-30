package homeWork.list;

import java.util.List;

public class MainList {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("ввод строк:");
        List<String> listForSort = StringHelper.listString(x);
        String stringLongForPrint = StringHelper.getLongString(listForSort);
        String stringShortForPrint = StringHelper.getShortString(listForSort);
        int indexLongForPrint = StringHelper.getIndexLong(listForSort);
        int indexShortForPrint = StringHelper.getIndexShort(listForSort);
        int indexShortForPrint2 = listForSort.indexOf(stringShortForPrint);
        int indexLongForPrint2 = listForSort.indexOf(stringLongForPrint);
        System.out.println(
                "\nвывод всех строк листа:\n" + listForSort +
                "\nсамая длинная строка:\n" + stringLongForPrint +
                "\nсамая короткая строка:\n" + stringShortForPrint +
                "\nиндекс самой длинной строки:\n" + indexLongForPrint +
                "\nиндекс самой короткой строки:\n" + indexShortForPrint +
                "\nиндекс самой длинной строки:\n" + indexLongForPrint2 +
                "\nиндекс самой короткой строки:\n" + indexShortForPrint2);
    }
}