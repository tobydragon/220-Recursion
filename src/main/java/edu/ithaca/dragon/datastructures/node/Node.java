package edu.ithaca.dragon.datastructures.node;

public class Node<T> {
    private T item;
    private Node<T> next;

    public Node(T item){
        this(item, null);
    }

    public Node(T item, Node<T> next){
        this.item = item;
        this.next = next;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

    public T getItem(){
        return item;
    }

    public Node<T> getNext(){
        return next;
    }

}
