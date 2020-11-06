package edu.ithaca.dragon.datastructures.node;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NodeUtilTest {

    @Test
    public void totalTest(){
        Node<Integer> example = new Node<>(4, new Node<>(8, new Node<>(3, new Node<>(5))));
        
        NodeUtil rec = new RecursiveNodeUtil();
        int total = rec.total(example);
        assertEquals(20, total);

        NodeUtil recTail = new RecursiveNodeUtil();
        total = recTail.total(example);
        assertEquals(20, total);
    }
    
}
