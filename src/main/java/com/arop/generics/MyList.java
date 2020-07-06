package com.arop.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Comparable<T>> {
    private List<T> list = new ArrayList<>();

    public void add(T t){
        list.add(t);
    }

    public T getMax(){
        return Collections.max(list);
    }

    public T getMin(){
        return Collections.min(list);
    }
}
