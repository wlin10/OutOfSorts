import java.util.Random;
import java.util.Arrays;

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

  }
}
