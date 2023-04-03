import java.util.ArrayList;
import java.util.Arrays;

public class StringListSearch {

    public static int unorderedSearch(ArrayList<String> items, String term) {
        int index = 0;
        boolean identified = false;
        while (index < items.size()) {
            System.out.println("currently looking at index " + index);
            String curSection = "";

            for (int i = 0; i < items.size(); i++) {
                curSection = items.get(i);
                if (term.equals(curSection)) {
                    identified = true;
                }
                if (identified == false) {
                    index++;
                } else {
                    return index;
                }
            }
        }
        return -1;
    }

    public static int orderedLinearSearch(ArrayList<String> items, String term) {
        int index = 0;
        boolean identified = false;
        while (index < items.size() && items.get(index).compareTo(term) <= 0) {

            for (int i = 0; i < items.size(); i++) {
                String curSection = items.get(i);
                if (term.equals(curSection)) {
                    identified = true;
                }
                if (identified == false) {
                    index++;
                } else {
                    return index;
                }
            }
        }
        return -1;
    }

    public static int orderedBinarySearch(ArrayList<String> items, String term) {
        int index = 0;
        boolean identified = false;
        int midpoint = items.size() / 2;
        int min = 0;
        int max = items.size();
        if (term.compareTo(items.get(midpoint)) <= 0) {
            for (int i = min; i < midpoint; i++) {
                String curSection = items.get(i);
                if (term.equals(curSection)) {
                    identified = true;
                }
                if (identified == false) {
                    index++;
                } else {
                    return index;
                }
            }
        } else {
            for (int i = midpoint; i < max; i++) {
                String curSection = items.get(i);
                if (term.equals(curSection)) {
                    identified = true;
                }
                if (identified == false) {
                    index++;
                } else {
                    return index;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<String> inputItems;
        String inputTerm;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList("there", "is", "the", "mountain"));
        inputTerm = "the";
        expectedOutput = 2;
        actualOutput = StringListSearch.unorderedSearch(inputItems, inputTerm);
    }
}