package by.exercise.interview;

import by.exercise.interview.entity.BinaryTree;
import by.exercise.interview.entity.Node;

/**
 * Created by aleh on 9.2.17.
 */
public class Main {

    public static void main(String args[]) {

        BinaryTree binaryTree = new BinaryTree();

        Node firstNode = binaryTree.insertValueToNode(8L);
        Node secondNode = binaryTree.insertValueToNode(45L);
        Node thirdNode = binaryTree.insertValueToNode(4L);
        Node fourthNode = binaryTree.insertValueToNode(6L);

        Node fifthNode = new Node(2L);
        Node sixthNode = new Node (8L);

        binaryTree.insertNode(fifthNode);
        binaryTree.insertNode(sixthNode);

        System.out.println(binaryTree.toString());
    }
}

