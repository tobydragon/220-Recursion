package edu.ithaca.dragon.datastructures.node;

public interface NodeUtil {

    public int total(Node<Integer> aNode);

    public boolean contains(Node<Integer> aNode, int itemToFind);

    public int countOccurrences(Node<Integer> aNode, int itemToFind);

    public String nodesToString(Node<Integer> aNode);
}
