public class Node <T> {
  // data fields

  // reference to the current node's parent node
  private Node<T> parent;
  // value stored in this node
  private T val;

  // constructor

  /**
   * This two-argument constructor creates a Node storing the given value with the given node as a parent.
   * @param val - value to be stored in this Node
   * @param parent - parent Node that this Node stems from (can be null if this is a root)
   */
  public Node(T val, Node<T> parent) {
    // initialize data fields
    this.val = val;
    this.parent = parent;
  }

  /**
   * This one-argument constructor creates a node with the given value and a null parent node. This
   * constructor is intended for creating a root of a binary tree.
   * @param val - value to be stored in this Node
   */
  public Node(T val) {
    // initialize val and set this node's parent to null by default
    this(val, null);
  }

  // accessors

  /**
   * Accessor method to return the value stored in this Node
   * @return the value stored in this Node
   */
  public T getVal() {
    return this.val;
  }

  /**
   * Accessor method to return this Node's parent node.
   * @return this Node's parent node
   */
  public Node<T> getParent() {
    return this.parent;
  }

  // mutators

  /**
   * Mutator method to set the stored value of this Node
   * @param val - the new value to be stored in this Node
   */
  public void setVal(T val) {
    this.val = val;
  }

  /**
   * Mutator method to set the parent node for this Node
   * @param parent - the Node to be set as this Node's parent
   */
  public void setParent(Node<T> parent) {
    this.parent = parent;
  }
}
