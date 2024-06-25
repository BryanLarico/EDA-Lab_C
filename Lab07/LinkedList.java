public class LinkedList<T> implements ListIt<T> {
  private Node<T> head;
	private int len;
  
  public LinkedList() {
    this.head = null;
  }
  
	public Node<T> getHead() {
		return head;
	}
	
  public void insertFirst(T x) {
    this.head = new Node<T>(x, this.head);
  }
  
  public void insertLast(T x) {
    if (isEmpty()) {
      insertFirst(x);
      return;
    }
    Node<T> i = this.head;
    while (i.getNext() != null) {
      i = i.getNext();
    }
    Node<T> n = new Node<T>(x, null);
    i.setNext(n);
  }
  
  public int search(T x) {
    int idx = 0;
    Node<T> i = this.head;
    while (i != null && !i.getData().equals(x))  {
      idx++;
      i = i.getNext();
    }
    if (i != null) 
      return idx;
    else 
      return -1;
  }
	
  public void remove( T x ) {
    Node<T> i = this.head;
    if (isEmpty()) return;
    if (i.getData().equals(x))  {
      this.head = i.getNext();
      return;
    }
    while (i.getNext() != null )  {
      if (i.getNext().getData().equals(x)) {
        i.setNext(i.getNext().getNext());
        return;
      }
      i = i.getNext(); 
    }
  }
  
  public boolean isEmpty() {
    return head == null;
  }
  
  @Override 
  public String toString() {
    String str = "";
    Node<T> i = this.head;
    for (; i != null; i = i.getNext()) {
      str += i.toString() + ", ";
    }
    return str;
  }
}