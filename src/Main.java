import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> sortedList = new ArrayList<>();

        sortedList = sortList(intList);
        printList(sortedList);
    }

    public static void printList(List<Integer> list) {

        for (Integer a : list) {
            System.out.println(a);
        }
    }

    public static List<Integer> sortList(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>();

        for (Integer a : list) {
            if (a > 0 && a % 2 == 0) {
                sortedList.add(a);
            }
        }
        Collections.sort(sortedList);
        return sortedList;
    }
}