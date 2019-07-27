/**
 * Class to represent a node in a linked list.
 */
public class Node {
  private int val;
  private Node next;

  /**
   * Method to construct a node of a linked list.
   *
   * @param val Integer, value stored in this node.
   * @param next Node, the next node in the linked list (end with null).
   */
  public Node(int val, Node next) {
    this.val = val;
    this.next = next;
  }

  /**
   * Method to get the next node in the linked list.
   *
   * @return Node, the next node in the linked list, or null when the end is reached.
   */
  public Node next() {
    return this.next;
  }

  /**
   * Method to get the value stored in this node.
   *
   * @return Integer, value stored in this node.
   */
  public int getVal() {
    return this.val;
  }
}
