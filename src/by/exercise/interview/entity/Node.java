package by.exercise.interview.entity;

/**
 * Created by aleh on 9.2.17.
 */

public class Node {

    private Long data;
    // references to children nodes
    private Node leftNode;
    private Node rightNode;

    public Node(Long data) {
        this.data = data;
    }

    public Long getData() {
        return this.data;
    }

    /**
     * Set data for this Node
     *
     * @param data Value for this Node
     */
    public void setValue(Long data) {
        this.data = data;
    }

    /**
     * @return Left node for this Node
     */
    protected Node getLeft() {
        return leftNode;
    }

    /**
     * @return Right node for this Node
     */
    protected Node getRight() { return rightNode; }

    /**
     * Set left node pointer for this Node
     *
     * @param node Left node for this Node
     */
    protected void setLeft(Node node) {
        this.leftNode = node;
    }


    /**
     * Set right node pointer for this Node
     *
     * @param node Right node for this Node
     */
    protected void setRight(Node node) {
        this.rightNode = node;
    }

    @Override
    public String toString() {

        String result = data.toString();
        if (leftNode != null) {
            result = leftNode.toString() + "<<" + result;
        }
        if (rightNode != null) {
            result = result + ">>" + rightNode.toString();
        }
        return result;
    }
}
