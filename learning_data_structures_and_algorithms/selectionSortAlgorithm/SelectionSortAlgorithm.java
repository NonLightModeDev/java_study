public class SelectionSortAlgorithm {
  public static void main(String args[]) {
    int nums[] = new int[25];
    init(nums);
    System.out.printf("Original array: ");
    print(nums);

    selectionSort(nums);
    System.out.printf("\nSorted array: ");
    print(nums);
  }

  public static void selectionSort(int[] arr) {
    for(int i = 0, lenI = arr.length; i < lenI; i++) {
      int minor = i;
      
      for(int j = i + 1, lenJ = arr.length; j < lenJ; j++) {
        if(arr[j] < arr[minor]) {
          minor = j;
        }
      }

      if(minor != i) {
        int aux = arr[i];
        arr[i] = arr[minor];
        arr[minor] = aux;
      }
    }
  }

  public static void print(int[] arr) {
    System.out.printf("[");
    for(int i = 0; i < arr.length - 1; i++) {
      System.out.printf("%s, ", arr[i]);
    }
    System.out.printf("%s]", arr[arr.length - 1]);
  }

  public static void init(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      arr[i] = (int) Math.floor(Math.random() * 101);
    }
  }
}