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
            return index;
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