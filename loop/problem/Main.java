class Main {
  public static void main(String[] args) {
    int[] arr = {5, 2, 7, 1, 3};
    
    // Find the index of the value 3
    int indexOf_3 = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 3) {
        indexOf_3 = i;
      }
    }
    System.out.printf("Index of 3: %d\n", indexOf_3);
    
    // Find the index of the value 7
    int indexOf_7 = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 7) {
        indexOf_7 = i;
      }
    }
    System.out.printf("Index of 7: %d\n", indexOf_7);

    // Find the index of the value 10
    int indexOf_10 = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 10) {
        indexOf_7 = i;
      }
    }
    System.out.printf("Index of 10: %d\n", indexOf_10);
  }
}
