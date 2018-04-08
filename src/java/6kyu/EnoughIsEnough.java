import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * # Enough is enough!
 *
 * Alice and Bob were on a holiday. Both of them took many pictures of the
 * places they've been, and now they want to show Charlie their entire
 * collection. However, Charlie doesn't like this sessions, since the motive
 * usually repeats. He isn't fond of seeing the Eiffel tower 40 times. He tells
 * them that he will only sit during the session if they show the same motive
 * at most N times. Luckily, Alice and Bob are able to encode the motive as a
 * number. Can you help them to remove numbers such that their list contains
 * each number only up to N times, without changing the order?
 *
 * Task
 * Given a list lst and a number N, create a new list that contains each number
 * of lst at most N times without reordering. For example if N = 2, and the
 * input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since
 * this would lead to 1 and 2 being in the result 3 times, and then take 3,
 * which leads to [1,2,3,1,2,3].
 */

public class EnoughIsEnough {

    /**
     *
     * @param elements : int[] of elements to be filtered
     * @param maxOccurrences : maximum number of occurrences of each element
     *                       in the filtered array
     * @return int[] with redundant elements (> maxOccurrences) removed
     */
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        ArrayList<Integer> filteredElements = new ArrayList<Integer>();

        // count occurrences of each number in elements array
        for (int el = 0; el < elements.length; el++) {
            int num = elements[el];
            if (count.containsKey(num)) {
                count.put(num, (count.get(num) + 1));
            }
            else {
                count.put(num, 1);
            }

            // add number to output list if maxOccurrences is not exceeded
            int newCount = count.get(num);
            if (newCount <= maxOccurrences) {
                filteredElements.add(num);
            }
        }

        int[] filteredArray = listToArray(filteredElements);

        return filteredArray;
    }

    /**
     * Convert List<Integer> into int[] array
     *
     * @param toBeConverted : List<Integer>
     * @return int[]
     */
    public static int[] listToArray(List<Integer> toBeConverted) {
        int listSize = toBeConverted.size();
        int[] converted = new int[listSize];
        for (int iElement = 0; iElement < listSize; iElement++) {
            converted[iElement] = toBeConverted.get(iElement);
        }
        return converted;
    }
}
