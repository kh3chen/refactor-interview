class Main {
  public static void main(String[] args) {
    int[] arr = {5, 2, 7, 1, 3};
    
    // Find the index of the value 3
    int indexOf_3 = indexOf(arr, 3);
    System.out.printf("Index of 3: %d\n", indexOf_3);
    
    // Find the index of the value 7
    int indexOf_7 = indexOf(arr, 7);
    System.out.printf("Index of 7: %d\n", indexOf_7);

    // Find the index of the value 10
    int indexOf_10 = indexOf(arr, 10);
    System.out.printf("Index of 10: %d\n", indexOf_10);
  }

  private static int indexOf(int[] arr, int value) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == value) {
         return i;  // Problem would continue looping here; return early
      }
    }
    return -1;
  }
}
