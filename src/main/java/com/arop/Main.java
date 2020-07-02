package com.arop;

import com.arop.generics.MyList;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.Add(322);
        list.Add(54);
        list.Add(245);
        list.Add(654);
        list.Add(123);
        list.Add(746);
        list.Add(85);
        list.Add(15);

        System.out.println(list.GetMax());
        System.out.println(list.GetMin());
    }
}
