public class BubbleSortAlgorithm {
  public static void main(String args[]) {
    int nums[] = new int[25];
    init(nums);
    System.out.printf("Original array: ");
    print(nums);

    bubbleSort(nums);
    System.out.printf("\nSorted array: ");
    print(nums);
  }

  public static void bubbleSort(int[] arr) {
    for(int i = 0, lenI = arr.length, lenJ = lenI; i < lenI; i++, lenJ--) {
      for(int j = 0; j < lenJ - 1; j++) {
        if(arr[j] > arr[j+1]) {
          int aux = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = aux;
        }
      }
    }
    // A cada iteração do "for" externo (i), um elemento já estará ordenado, logo a quantidade de iteração do "for" interno (j) será decrementada em 1 a cada iteração do "for" externo.
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