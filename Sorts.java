public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for (int i = 0; i < data.length - 1; i++) {
      for (int j = 0; j < data.length - i - 1; j++) {
        if (data[j] > data[j + 1]) {
          int temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
        }
      }
    }
  }

  /**selection sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data - the elements to be sorted.
  */
   public static void selectionSort(int[] data){
     for (int i = 0; i < data.length - 1; i++) {
       int minIndex = i;
       for (int j = i; j < data.length; j++) {
         if (data[j] < data[minIndex]) {
           minIndex = j;
         }
       }
       int temp = data[i];
       data[i] = data[minIndex];
       data[minIndex] = temp;
     }
   }

   /**insertion sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data - the elements to be sorted.
  */
   public static void insertionSort(int[] data){
     for (int i = 1; i < data.length; i++) {
       int temp = data[i];
       int shifter = i - 1;
       while (shifter >= 0 && data[shifter] > temp) {
         data[shifter + 1] = data[shifter];
         shifter--;
       }
       data[shifter + 1] = temp;
     }
   }

}
