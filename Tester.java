import java.util.*;

public class Tester{

  public static int[] newArray(int seedValue, int sizeOfArray) {
    int[] newArray = new int[sizeOfArray];
    Random rng = new Random(seedValue);
    for(int i =  0; i < sizeOfArray; i++ ){
      newArray[i] = (rng.nextInt() % 1000);
    }
    return newArray;
  }

  public static boolean arrayChecker(int seedValue, int sizeOfArray) {
    int[] arr1 = newArray(seedValue, sizeOfArray);
    Sorts.bubbleSort(arr1);
    int[] arr2 = newArray(seedValue, sizeOfArray);
    Arrays.sort(arr2);
    return (Arrays.equals(arr1, arr2));
  }

  public static void reverse(int[] arr) {
    int[] arr1 = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      arr1[i] = arr[arr.length - i - 1];
    }
    arr = arr1;
  }

  public static boolean reverseArrayChecker(int seedValue, int sizeOfArray) {
    int[] arr1 = newArray(seedValue, sizeOfArray);
    Sorts.bubbleSort(arr1);
    reverse(arr1);
    Arrays.sort(arr1);
    int[] arr2 = newArray(seedValue, sizeOfArray);
    Arrays.sort(arr2);
    reverse(arr2);
    Sorts.bubbleSort(arr2);
    return (Arrays.equals(arr1, arr2));
  }


  public static void main(String[]args){
    Random x = new Random();
    int limit = (Math.abs(x.nextInt() % 250));
    for (int i = 0; i < limit; i++) {
      for (int j = 0; j < limit; j++) {
        if (!arrayChecker(i, j)) {
          System.out.println("Tests Failed");
        }
        if (!reverseArrayChecker(i, j)) {
          System.out.println("Tests Failed");
        }
      }
    }

    int[] a = {1, 1, 3, 1, 2, 5};
    int[] b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] c = {};
    Sorts.bubbleSort(a);
    Sorts.bubbleSort(b);
    Sorts.bubbleSort(c);
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(c));

    System.out.println("Tests Passed");
  }
}
