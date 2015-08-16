/**
 * A Queue class adapted from Java A Beginner's guide
 * @author Luke Hodnett
 */
// An improved queue class for characters
class Queue {
  private char q[];
  private int putloc, getloc;

  Queue (int size) {
    q = new char[size]; //allocate memory for queue
    putloc = getloc = 0;
  }

  // Put a character into the queue.
  void put(char ch) {
    if(putloc == q.length) {
      System.out.println(" - Queue is full.");
      return;
    }

    q[putloc++] = ch;
  }

  // Get a character from the queue.
  char get() {
    if(getloc == putloc) {
      System.out.println(" - Queue is empty.");
      return (char) 0;
    }

    return q[getloc++];
  }
}

class QDemo {
  public static void main(String args[]) {
    Queue BigQueue = new Queue(100);
    // Queue SmallQueue = new Queue(4);
    char ch;
    int i;

    System.out.println("Use BigQueue to store the alphabet.");
    // put some numbers into BigQueue
    for(i=0; i < 26; i++) {
      BigQueue.put((char) ('A' + i));
    }
    // retrieve and display elements from BigQueue
    System.out.print("Contents of BigQueue: ");
    for(i=0; i < 26; i++) {
      ch = BigQueue.get();
      if (ch != (char) 0) System.out.print(ch);
    }

    System.out.println("\n");
  }
}
