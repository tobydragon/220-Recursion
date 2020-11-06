package edu.ithaca.dragon.datastructures.node;

public class RecursiveNodeUtil implements NodeUtil {
    
    public int total(Node<Integer> aNode){
        if (aNode == null){
            return 0;
        }
        else {
            int totalOfRest = total(aNode.getNext());
            int myTotal = totalOfRest + aNode.getItem();
            return myTotal;
        }
    }
    
}
