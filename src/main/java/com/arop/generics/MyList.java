package com.arop.generics;

import java.util.ArrayList;
import java.util.Collections;

public class MyList<T extends Comparable<T>> {
    private ArrayList<T> list = new ArrayList<>();

    public void Add(T t){
        list.add(t);
    }

    public T GetMax(){
        return Collections.max(list);
    }

    public T GetMin(){
        return Collections.min(list);
    }
}
