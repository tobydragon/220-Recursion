package edu.ithaca.dragon.datastructures.node;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NodeUtilTest {

    @Test
    public void totalTest(){
        Node<Integer> example = new Node<>(4, new Node<>(8, new Node<>(3, new Node<>(5))));
        
        RecursiveNodeUtil rec = new RecursiveNodeUtil();
        int total = rec.total(example);
        assertEquals(20, total);

        TailRecursiveNodeUtil recTail = new TailRecursiveNodeUtil();
        total = recTail.total(example);
        assertEquals(20, total);
    }
    
    @Test
    public void testNodeUtil(){
        //TODO: instantiate your implementation here
        NodeUtil toTest = null; //new MyRecursiveNodeUtil();
        totalTest(toTest);
        containsTest(toTest);
        countOccurrencesTest(toTest);
        nodesToStringTest(toTest);
    }

    public void totalTest(NodeUtil toTest){
        Node<Integer> example = new Node<>(4, new Node<>(8, new Node<>(3, new Node<>(5))));
        assertEquals(20, toTest.total(example));
        assertEquals(16, toTest.total(example.getNext()));

        assertEquals(12, toTest.total(new Node<Integer>(12)));
        assertEquals(0, toTest.total(null));
    }

    public void containsTest(NodeUtil toTest){
        Node<Integer> example = new Node<>(8, new Node<>(4, new Node<>(8, new Node<>(3, new Node<>(5)))));
        assertEquals(true, toTest.contains(example, 8));
        assertEquals(true, toTest.contains(example, 4));
        assertEquals(true, toTest.contains(example, 3));
        assertEquals(true, toTest.contains(example, 5));
        assertEquals(false, toTest.contains(example, 12));
        assertEquals(false, toTest.contains(example, 0));

        assertEquals(true, toTest.contains(example.getNext(), 8));
        assertEquals(false, toTest.contains(example.getNext().getNext(), 4));
        
        assertEquals(true, toTest.contains(new Node<Integer>(12), 12));
        assertEquals(false, toTest.contains(new Node<Integer>(12), 13));
        assertEquals(false, toTest.contains(null, 22));
    }

    public void countOccurrencesTest(NodeUtil toTest){
        Node<Integer> example = new Node<>(8, new Node<>(4, new Node<>(8, new Node<>(3, new Node<>(5, new Node<>(5, new Node<>(2, new Node<>(5))))))));
        assertEquals(2, toTest.countOccurrences(example, 8));
        assertEquals(1, toTest.countOccurrences(example, 4));
        assertEquals(1, toTest.countOccurrences(example, 3));
        assertEquals(3, toTest.countOccurrences(example, 5));
        assertEquals(1, toTest.countOccurrences(example, 2));
        assertEquals(0, toTest.countOccurrences(example, 0));
        assertEquals(0, toTest.countOccurrences(example, 6));

        assertEquals(1, toTest.countOccurrences(example.getNext(), 8));
        assertEquals(0, toTest.countOccurrences(example.getNext().getNext(), 4));
        
        assertEquals(1, toTest.countOccurrences(new Node<Integer>(12), 12));
        assertEquals(0, toTest.countOccurrences(new Node<Integer>(12), 13));
        assertEquals(0, toTest.countOccurrences(null, 22));
    }

    public void nodesToStringTest(NodeUtil toTest){
        Node<Integer> example1 = new Node<>(8, new Node<>(4, new Node<>(8, new Node<>(3, new Node<>(5, new Node<>(5, new Node<>(2, new Node<>(5))))))));
        assertEquals("8, 4, 8, 3, 5, 5, 2, 5", toTest.nodesToString(example1));
        assertEquals("4, 8, 3, 5, 5, 2, 5", toTest.nodesToString(example1.getNext()));
        assertEquals("8, 3, 5, 5, 2, 5", toTest.nodesToString(example1.getNext().getNext()));

        Node<Integer> example2 = new Node<>(4, new Node<>(8, new Node<>(3)));
        assertEquals("4, 8, 3", toTest.nodesToString(example2));
        assertEquals("8, 3", toTest.nodesToString(example2.getNext()));
        assertEquals("3", toTest.nodesToString(example2.getNext().getNext()));

        assertEquals("12", toTest.nodesToString(new Node<Integer>(12)));
        assertEquals("", toTest.nodesToString(null));
    }
    
}
