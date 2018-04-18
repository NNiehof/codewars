/**
 * # Descending Order
 *
 * Your task is to make a function that can take any non-negative integer as a
 * argument and return it with its digits in descending order. Essentially, rearrange
 * the digits to create the highest possible number.
 * Examples:
 * Input: 21445 Output: 54421
 * Input: 145263 Output: 654321
 * Input: 1254859723 Output: 9875543221
 */

public class DescendingOrder {
  public static int sortDesc(final int num) {
    int[] numbers = intToArray(num);
    sort(numbers);
    int sortedNum = arrayToInt(numbers);
    return sortedNum;
  }
  
  public static int[] intToArray(int num) {
    String numAsString = Integer.toString(num);
    int[] numbers = new int[numAsString.length()];
      for (int index = 0; index < numAsString.length(); index++) {
          numbers[index] = Character.getNumericValue(numAsString.charAt(index));
      }
      return numbers;
  }
  
  public static int arrayToInt(int[] numbers) {
      String newNumAsString = new String();
      for (int digit : numbers) {
          newNumAsString += Integer.toString(digit);
      }
      return Integer.parseInt(newNumAsString);
  }
  
  public static void sort(int[] numbers) {
      // bubble sort: find the index of the next largest value, then swap
      // the largest value with the value at the current index
      for (int index = 0; index < numbers.length; index++) {
          int largestIndex = findLargestIndex(numbers, index);
          int currentValue = numbers[index];
          int largestValue = numbers[largestIndex];
          numbers[index] = largestValue;
          numbers[largestIndex] = currentValue;
      }
  }
  
  public static int findLargestIndex(int[] numbers, int startAt) {
      // Find index of largest value, starting at index startAt
      int largestValue = findLargestValue(numbers, startAt);
      for (int count = startAt; count < numbers.length; count++) {
          if (numbers[count] == largestValue) {
              return count;
          }
      }
      return -1;
  }
  
  public static int findLargestValue(int[] numbers, int startAt) {
      // Find largest value, starting at index startAt
      int largest = numbers[startAt];
      for (int count = startAt; count < numbers.length; count++) {
          if (largest < numbers[count]) {
              largest = numbers[count];
          }
      }
      return largest;
  }
}
