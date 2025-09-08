class StaticCircularQueue<T> {
  private T[] items;
  private int head;
  private int tail;
  private int size;

  public StaticCircularQueue(int len) {
    items = (T[]) new Object[len];
    head = tail = -1;
    size = 0;
  }

  public int getSize() {
    return size;
  }

  public boolean clear() {
    head = tail = -1;
    size = 0;
    return true;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == items.length;
  }

  public T peek() throws Exception {
    if(isEmpty()) throw new Exception("Queue is empty!");

    return items[head];
  }

  public boolean add(T element) throws Exception {
    if(isFull()) throw new Exception("Queue is full!");

    if(head == -1) {
      head = 0;
    }

    tail++;
    tail %= items.length;
    items[tail] = element;
    size++;

    return true;
  }

  public T remove() throws Exception {
    if(isEmpty()) throw new Exception("Queue is empty!");

    T element = items[head];
    head++;
    head %= items.length;
    size--;

    return element;
  }

  @Override
  public String toString() {
    if(isEmpty()) return "[]";

    StringBuilder str = new StringBuilder("[");
    if(head <= tail) {
      for(int i = head; i < tail; i++) {
        str.append(items[i] + ", ");
      }
      str.append(items[tail]);
    } else {
      for(int i = head; i < items.length; i++) {
        str.append(items[i] + ", ");
      }
      for(int i = 0; i < tail; i++) {
        str.append(items[i] + ", ");
      }
      str.append(items[tail]);
    }

    str.append("]");
    return str.toString();
  }

  public String __inMemory__() {
    if(isEmpty()) return "[]";

    StringBuilder str = new StringBuilder("[");
    for(int i = 0; i < items.length - 1; i++) {
      str.append(items[i] + ", ");
    }
    str.append(items[items.length - 1] + "]");
    return str.toString();
  }
}

public class StaticCircularQueueDemo {
  public static void main(String args[]) {
    try {
      StaticCircularQueue<Integer> queue = new StaticCircularQueue<>(3);

      System.out.printf("Is queue empty? %b\n", queue.isEmpty());
      System.out.printf("Is queue full? %b\n", queue.isFull());
      System.out.printf("Queue: %s\n", queue.toString());
      System.out.printf("In memory: %s\n", queue.__inMemory__());

      System.out.printf("\nAdd 1: %b\n", queue.add(1));
      System.out.printf("Peek: %d\n", queue.peek());
      System.out.printf("Is queue empty? %b\n", queue.isEmpty());
      System.out.printf("Is queue full? %b\n", queue.isFull());
      System.out.printf("Queue: %s\n", queue.toString());
      System.out.printf("In memory: %s\n", queue.__inMemory__());

      System.out.printf("\nAdd 2: %b\n", queue.add(2));
      System.out.printf("Peek: %d\n", queue.peek());
      System.out.printf("Is queue empty? %b\n", queue.isEmpty());
      System.out.printf("Is queue full? %b\n", queue.isFull());
      System.out.printf("Queue: %s\n", queue.toString());
      System.out.printf("In memory: %s\n", queue.__inMemory__());

      System.out.printf("\nAdd 3: %b\n", queue.add(3));
      System.out.printf("Peek: %d\n", queue.peek());
      System.out.printf("Is queue empty? %b\n", queue.isEmpty());
      System.out.printf("Is queue full? %b\n", queue.isFull());
      System.out.printf("Queue: %s\n", queue.toString());
      System.out.printf("In memory: %s\n", queue.__inMemory__());

      // System.out.printf("\nAdd 4: %b\n", queue.add(4));
      // System.out.printf("Peek: %d\n", queue.peek());
      // System.out.printf("Is queue empty? %b\n", queue.isEmpty());
      // System.out.printf("Is queue full? %b\n", queue.isFull());
      // System.out.printf("Queue: %s\n", queue.toString());
      // System.out.printf("In memory: %s\n", queue.__inMemory__());

      System.out.printf("\nRemoving %d...\n", queue.remove());
      System.out.printf("Peek: %d\n", queue.peek());
      System.out.printf("Is queue empty? %b\n", queue.isEmpty());
      System.out.printf("Is queue full? %b\n", queue.isFull());
      System.out.printf("Queue: %s\n", queue.toString());
      System.out.printf("In memory: %s\n", queue.__inMemory__());

      System.out.printf("\nAdd 4: %b\n", queue.add(4));
      System.out.printf("Peek: %d\n", queue.peek());
      System.out.printf("Is queue empty? %b\n", queue.isEmpty());
      System.out.printf("Is queue full? %b\n", queue.isFull());
      System.out.printf("Queue: %s\n", queue.toString());
      System.out.printf("In memory: %s\n", queue.__inMemory__());
    } catch(Exception e) {
      System.out.printf("\n |* %s *| \n", e.getMessage());
    }
  }
}