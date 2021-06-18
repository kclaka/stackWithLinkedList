package com.company;


public class Stacks<T>
{
    private Node first;
    private int N;

    private class Node{
        T item;
        Node next;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void push(T item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public T pop(){
        T item = first.item;
        first = first.next;
        N--;
        return item;
    }
}


