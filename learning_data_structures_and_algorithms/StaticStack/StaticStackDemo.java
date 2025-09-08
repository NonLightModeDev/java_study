class StaticStack<T> {
  private T[] items;
  private int top;
  private int size;

  public StaticStack(int len) {
    items = (T[]) new Object[len];
    top = -1;
    size = 0;
  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == items.length;
  }

  public boolean push(T element) throws Exception {
    if(isFull()) throw new Exception("Stack is full!");

    items[++top] = element;
    size++;
    return true;
  }

  public T pop() throws Exception {
    if(isEmpty()) throw new Exception("Stack is empty!");

    size--;
    return items[top--];
  }

  public T peek() throws Exception {
    if(isEmpty()) throw new Exception("Stack is empty!");

    return items[top];
  }

  @Override
  public String toString() {
    if(isEmpty()) return "[]";

    StringBuilder str = new StringBuilder("[");

    for(int i = 0; i < size - 1; i++) {
      str.append(items[i] + ", ");
    }

    str.append(items[top] + "]");
    return str.toString();
  }
}

public class StaticStackDemo {
  public static void main(String args[]) {
    try {
      StaticStack<Integer> stack = new StaticStack<>(5);
      System.out.printf("Is stack empty? %b\n", stack.isEmpty());
      System.out.printf("Is stack full? %b\n", stack.isFull());
      System.out.printf("Size: %d\n", stack.getSize());
      System.out.printf("Stack: %s\n", stack.toString());

      System.out.printf("\nPush: 1\n", stack.push(1));
      System.out.printf("Is stack empty? %b\n", stack.isEmpty());
      System.out.printf("Is stack full? %b\n", stack.isFull());
      System.out.printf("Size: %d\n", stack.getSize());
      System.out.printf("Stack: %s\n", stack.toString());

      System.out.printf("\nPush: 2\n", stack.push(2));
      System.out.printf("Is stack empty? %b\n", stack.isEmpty());
      System.out.printf("Is stack full? %b\n", stack.isFull());
      System.out.printf("Size: %d\n", stack.getSize());
      System.out.printf("Stack: %s\n", stack.toString());

      System.out.printf("\nPeek: %d\n", stack.peek());
      System.out.printf("Pop: %d\n", stack.pop());
      System.out.printf("Is stack empty? %b\n", stack.isEmpty());
      System.out.printf("Is stack full? %b\n", stack.isFull());
      System.out.printf("Size: %d\n", stack.getSize());
      System.out.printf("Stack: %s\n", stack.toString());

      System.out.printf("\nPush: 3\n", stack.push(3));
      System.out.printf("Peek: %d\n", stack.peek());
      System.out.printf("Is stack empty? %b\n", stack.isEmpty());
      System.out.printf("Is stack full? %b\n", stack.isFull());
      System.out.printf("Size: %d\n", stack.getSize());
      System.out.printf("Stack: %s\n", stack.toString());

      System.out.printf("\nPeek: %d\n", stack.peek());
      System.out.printf("Pop: %d\n", stack.pop());
      System.out.printf("Is stack empty? %b\n", stack.isEmpty());
      System.out.printf("Is stack full? %b\n", stack.isFull());
      System.out.printf("Size: %d\n", stack.getSize());
      System.out.printf("Stack: %s\n", stack.toString());
    } catch(Exception e) {
      System.out.printf("\n |* %s *| \n", e.getMessage());
    }
  }
}