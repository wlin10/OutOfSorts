import java.util.Random;
import java.util.Arrays;

public class Tester{

  public static int[] newArray(int sizeOfArray) {
    int[] newArray = new int[sizeOfArray];
    Random rng = new Random();
    for(int i =  0; i < sizeOfArray; i++ ){
      newArray[i] = (rng.nextInt() % 1000);
    }
    return newArray;
  }


  public static void main(String[]args){

  }
}
