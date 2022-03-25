package com.example.iterable;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Bag<T> implements Container<T>{

    private List<T> bag;

    public Bag(){
        this.bag = new ArrayList<T>();
    }

    //ArrayList<String> Bag = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return bag.isEmpty();
    }

    @Override
    public int size() {
        return bag.size();
    }

    @Override
    public void add(T item) {
        bag.add(item);
    }

    @Override
    public Iterator iterator() {
        return bag.iterator();
    }


}
