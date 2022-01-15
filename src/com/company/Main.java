package com.company;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        City c = new City(1, "NYC");
        c.getCode();
        City c1 = new City(2, "Sidney");
        City c2 = new City(3, "Tokyo");
        City c3 = new City(7, "London");
        City c4 = new City(312, "Bishkek");

        TreeSet<City> treeSet = new TreeSet();
        treeSet.add(new City(1, "NYC"));
        treeSet.add(new City(599, "Sidney"));
        treeSet.add(new City(3, "Tokyo"));
        treeSet.add(new City(7, "London"));
        treeSet.add(new City(312, "Bishkek"));

        Iterator iterator = treeSet.descendingIterator();

        while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

        for (City c0 : treeSet) {
            if (c0.getCode() % 2 != 0) {
                treeSet.add(c0);
                System.out.println("Tak san" + c0);
//            } else {
//                System.out.println("All" + c0);
//            }
            }

        }
    }
}

