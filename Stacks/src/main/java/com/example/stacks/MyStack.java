package com.example.stacks;

public class MyStack <T>{

    public SNode<T> bottom;
    public SNode<T> top;
    int size;

    public boolean isEmpty(){
        return bottom == null;
    }
    public void push(T item){
        SNode<T> node = new SNode<>(item);
    }
}
