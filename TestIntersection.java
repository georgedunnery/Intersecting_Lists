import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * A JUnit test class to demonstrate the algorithm.
 */
public class TestIntersection {

  @Test
  public void testListsLongerA() {
    // List A is longer in this case
    // Create the shared "tail" for the linked lists, starting at 42
    Node shared = new Node(42, new Node(27, new Node(105, new Node(59, null))));
    // List A = 1, 2, 3, 42, 27, 105, 59
    // List B =      23, 42, 27, 105, 59
    Node headA = new Node(1, new Node(2, new Node(3, new Node(42, shared))));
    Node headB = new Node(23, shared);
    // Perform the algorithm and check that the returned node is in fact 42
    Intersection algo = new Intersection(headA, headB);
    Node convergence = algo.find();
    assertEquals(shared, convergence);
    System.out.println(convergence.getVal());
  }

  @Test
  public void testListsLongerB() {
    // List B is longer in this case
    // Create shared tail
    Node shared = new Node(5800, new Node(5200, new Node(6000, null)));
    // List A =          15, 7, 5800, 5200, 6000
    // List B = 22, 23, 24, 25, 5800, 5200, 6000
    Node headA = new Node(15, new Node(7, shared));
    Node headB = new Node(22, new Node(23, new Node(24, new Node(25, shared))));
    // Run the algorithm
    Intersection algo = new Intersection(headA, headB);
    Node convergence = algo.find();
    assertEquals(shared, convergence);
    System.out.println(convergence.getVal());
  }

  @Test
  public void testListsEqualLength() {
    // The lists are equal length in this case
    // Create shared tail
    Node shared = new Node(99, new Node(101, new Node(102, null)));
    // List A =  30, 31, 32, 99, 101, 102
    // List B = 981, -3, 71, 99, 101, 102
    Node headA = new Node(30, new Node(31, new Node(32, shared)));
    Node headB = new Node(981 , new Node(-3, new Node(71, shared)));
    // Run the algorithm
    Intersection algo = new Intersection(headA, headB);
    Node convergence = algo.find();
    assertEquals(shared, convergence);
    System.out.println(convergence.getVal());
  }
}
