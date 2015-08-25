// A fixed-size queue class for characters
class FixedQueue implements ICharQ {
  private char q[];           // This array holds the queue
  private int putloc, getloc; // The put and get indicies

  // Construct an empty queue given its size.
  public FixedQueue(int size) {
    q = new char[size]; // allocate memory for queue
    putloc = getloc = 0;
  }

  // Put a character into the queue
  public void put(char ch) {
    if(putloc == q.length) {
      System.out.println(" - Queue is full.");
      return;
    }

    q[putloc++] = ch
  }

  // Get a character from the queue
  public char get() {
    if(putloc == getloc) {
      System.out.println(" - Queue is empty.");
      return (char) 0;
    }

    return q[getloc++];
  }
}

// A circular queue
class CircularQueue implements ICharQ{
  
}
