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


  public static void main(String[]args){
    Random x = new Random();
    int limit = (Math.abs(x.nextInt() % 250));
    for (int i = 0; i < limit; i++) {
      for (int j = 0; j < limit; j++) {
        if (!arrayChecker(i, j)) {
          System.out.println("Tests Failed");
        }
      }
    }
    System.out.println("Tests Passed");
  }
}
