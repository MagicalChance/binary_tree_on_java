package by.exercise.interview.entity;

/**
 * Created by aleh on 9.2.17.
 */
public class Node {

    public Node(Long data)
    {
        this.data = data;
    }

    private Long data;
    // references to children nodes
    private Node leftNode;
    private Node rightNode;

    public Long getData()
    {
        return this.data;
    }

    /**
     * Set left node pointer for this Node
     *
     *
     * @param node Left node for this Node
     */
    protected void setLeft(Node node)
    {
        this.leftNode = node;
    }

    /**
     * Set right node pointer for this Node
     *
     *
     * @param node Right node for this Node
     */
    protected void setRight(Node node)
    {
        this.rightNode = node;
    }

    /**
     * Set data for this Node
     *
     *
     * @param data Value for this Node
     */
    public void setValue(Long data){
        this.data = data;
    }


    /**
     * @return Right node for this Node
     */
    protected Node getRight()
    {
        if (rightNode != null)
        {
            return leftNode;
        }
        else
        {
            return null;
        }
    }

    /**
     * @return Left node for this Node
     */
    protected Node getLeft()
    {
        if (leftNode != null)
        {
            return leftNode;
        }
        else
        {
            return null;
        }
    }

    @Override
    public String toString()
    {

        String result = data.toString();
        if (leftNode != null)
        {
            result = leftNode.toString() + "<<" + result;
        }
        if (rightNode != null)
        {
            result = result + ">>" + rightNode.toString();
        }
        return result;
    }
}
