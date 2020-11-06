package edu.ithaca.dragon.datastructures.node;

public class TailRecursiveNodeUtil implements NodeUtil {
    
    @Override
    public int total(Node<Integer> aNode){
        int myTotal = total(aNode, 0);
        return myTotal;
    }
    
    public int total(Node<Integer> aNode, int totalSoFar){
        if (aNode == null){
            return totalSoFar;
        }
        else {
            int newTotal = totalSoFar + aNode.getItem();
            int myTotal = total(aNode.getNext(), newTotal);
            return myTotal;
        }
    }
}
