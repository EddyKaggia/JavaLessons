package com.eddykaggia.app;

import java.util.HashSet;
import java.util.Set;

public class SetAndHashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        // Adding elems to a set
        names.add("Tanjirou");
        names.add("Miles");
        names.add("Mark");
        names.add("Jinho");


        System.out.println(names); // [Tanjirou, Miles, Mark, Jinho]

        // Removing elems from set
        names.remove("Mark");
        System.out.println(names); // [Tanjirou, Miles, Jinho]
        // Check the size of the set
        System.out.println(names.size()); // 3
        // Check if a set is empty
        System.out.println(names.isEmpty()); // False
        // Check if it contains an elem
        System.out.println(names.contains("Mark")); // False
        // Remove all elems from a set
        names.clear();
        System.out.println(names); // []


        // Looping through all elems of a set
        names.add("Bubbles");
        names.add("Buttercup");
        names.add("Blossom");


    }
}
