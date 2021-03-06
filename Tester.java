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

  public static boolean bArrayChecker(int seedValue, int sizeOfArray) {
    int[] arr1 = newArray(seedValue, sizeOfArray);
    Sorts.bubbleSort(arr1);
    int[] arr2 = newArray(seedValue, sizeOfArray);
    Arrays.sort(arr2);
    return (Arrays.equals(arr1, arr2));
  }

  public static boolean sArrayChecker(int seedValue, int sizeOfArray) {
    int[] arr1 = newArray(seedValue, sizeOfArray);
    Sorts.selectionSort(arr1);
    int[] arr2 = newArray(seedValue, sizeOfArray);
    Arrays.sort(arr2);
    return (Arrays.equals(arr1, arr2));
  }

  public static boolean iArrayChecker(int seedValue, int sizeOfArray) {
    int[] arr1 = newArray(seedValue, sizeOfArray);
    Sorts.insertionSort(arr1);
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

  public static boolean bReverseArrayChecker(int seedValue, int sizeOfArray) {
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

  public static boolean sReverseArrayChecker(int seedValue, int sizeOfArray) {
    int[] arr1 = newArray(seedValue, sizeOfArray);
    Sorts.selectionSort(arr1);
    reverse(arr1);
    Arrays.sort(arr1);
    int[] arr2 = newArray(seedValue, sizeOfArray);
    Arrays.sort(arr2);
    reverse(arr2);
    Sorts.selectionSort(arr2);
    return (Arrays.equals(arr1, arr2));
  }

  public static boolean iReverseArrayChecker(int seedValue, int sizeOfArray) {
    int[] arr1 = newArray(seedValue, sizeOfArray);
    Sorts.insertionSort(arr1);
    reverse(arr1);
    Arrays.sort(arr1);
    int[] arr2 = newArray(seedValue, sizeOfArray);
    Arrays.sort(arr2);
    reverse(arr2);
    Sorts.insertionSort(arr2);
    return (Arrays.equals(arr1, arr2));
  }

  public static void main(String[]args){
    Random x = new Random();
    int limit = (Math.abs(x.nextInt() % 250));
    for (int i = 0; i < limit; i++) {
      for (int j = 0; j < limit; j++) {
        if (!bArrayChecker(i, j) ||
        !sArrayChecker(i, j) ||
        !iArrayChecker(i, j)) {
          System.out.println("Tests Failed");
        }
        if (!bReverseArrayChecker(i, j) ||
        !bReverseArrayChecker(i, j) ||
        !iReverseArrayChecker(i, j)) {
          System.out.println("Tests Failed");
        }
        if (bArrayChecker(i, j) != sArrayChecker(i, j) ||
        bArrayChecker(i, j) != iArrayChecker(i, j) ||
        iArrayChecker(i, j) != sArrayChecker(i, j)) {
          System.out.println("Tests Failed");
        }
        if (bReverseArrayChecker(i, j) != sReverseArrayChecker(i, j) ||
        bReverseArrayChecker(i, j) != iReverseArrayChecker(i, j) ||
        iReverseArrayChecker(i, j) != sReverseArrayChecker(i, j)) {
          System.out.println("Tests Failed");
        }
      }
    }
    System.out.println("Tests Passed");

    int[] a = {1, 1, 3, 1, 2, 5};
    int[] b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] c = {8,8,8,8};
    int[] d = {4};
    int[] e = {};
    Sorts.bubbleSort(a);
    Sorts.insertionSort(b);
    Sorts.selectionSort(c);
    Sorts.insertionSort(d);
    Sorts.bubbleSort(e);
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(c));
    System.out.println(Arrays.toString(d));
    System.out.println(Arrays.toString(e));
  }
}
