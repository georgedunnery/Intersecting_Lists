/**
 * A class to find the intersection of two linked lists that intersect at some node. Written for
 * CS 5800 using the pseudo code from lecture.
 */
public class Intersection {
  private Node headA;
  private Node headB;

  /**
   * Method to construct an Intersection object.
   *
   * @param headA Node, the first node in one linked list.
   * @param headB Node, the first node in the other linked list.
   */
  public Intersection(Node headA, Node headB) {
    this.headA = headA;
    this.headB = headB;
  }

  /**
   * Method to run the algorithm from CS 5800 lecture to find the node where the two linked lists
   * intersect.
   *
   * @return Node, the node at which the linked lists intersect.
   */
  public Node find() {
    // Copy the head nodes to preserve the original headA and headB (so re-runs will still work)
    Node tempA = this.headA;
    Node tempB = this.headB;
    // Measure the length of the linked lists
    int lengthA = getLength(tempA);
    int lengthB = getLength(tempB);
    // Traverse the longer list by the difference in length
    if(lengthA > lengthB) {
      tempA = travel(tempA, lengthA - lengthB);
    }
    else {
      tempB = travel(tempB, lengthB - lengthA);
    }
    // Iterate until the two nodes are equal, then return the intersecting node
    while(tempA != tempB) {
      tempA = tempA.next();
      tempB = tempB.next();
    }
    return tempA;
  }

  /**
   * Method to measure the length of a linked list by traversing it.
   *
   * @param node Node, the first node in a linked list.
   * @return Integer, the length of the linked list
   */
  private int getLength(Node node) {
    int count = 0;
    while(node != null) {
      count++;
      node = node.next();
    }
    return count;
  }

  /**
   * Method to travel a certain number of nodes in a linked list. Intended to iterate through the
   * longer list to even out the lengths.
   *
   * @param node Node, the first node of the longer linked list.
   * @param diff Integer, the difference in length between the two linked lists.
   * @return Node, new starting node of longer linked list to begin comparing to the shorter list.
   */
  private Node travel(Node node, int diff) {
    for(int i = 0; i < diff; i++) {
      node = node.next();
    }
    return node;
  }
}
