package by.exercise.interview.entity;

/**
 * Created by aleh on 9.2.17.
 */

public class BinaryTree {

    private Node rootNode;

    /**
     * Create new Node with value and insert into this Tree
     *
     * @param data Initial value for new Node
     * @return the reference to the new node
     */
    public Node insertValueToNode(Long data) {
        Node node = new Node(data);
        insertNode(node);

        return node;
    }

    /**
     * Insert new Node into this Tree
     *
     * @param newNode Node to be inserted into this Tree
     */
    public void insertNode(Node newNode) {
        if (rootNode == null) {
            rootNode = new Node(newNode.getData());
        } else {
            insertNode(rootNode, newNode);
        }
    }

    /**
     * Insert a new node into this tree
     *
     * @param currentNode Current node we are comparing to newNode
     * @param newNode     New node that is to be inserted
     */
    private void insertNode(Node currentNode, Node newNode) {
        if (newNode.getData() < currentNode.getData()) {
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(newNode);
            } else {
                insertNode(currentNode.getLeft(), newNode);
            }
        }
        if (newNode.getData() > currentNode.getData()) {
            if (currentNode.getRight() == null) {
                currentNode.setRight(newNode);
            } else {
                insertNode(currentNode.getRight(), newNode);
            }
        }
    }


    @Override
    public String toString() {
        if (rootNode != null) {
            return rootNode.toString();
        }
        return "";
    }

}
