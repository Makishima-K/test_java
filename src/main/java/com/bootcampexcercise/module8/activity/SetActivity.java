package com.bootcampexcercise.module8.activity;

import java.util.HashSet;
import java.util.Set;

public class SetActivity {

    public static void main(String[] args) {
        // 1 - Create a set of names using HashSet
        // and add "John", "John", "Harry", "Daniel" plus a few more duplicate entries
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("John");
        names.add("Harry");
        names.add("Daniel");
        names.add("Harry");
        names.add("Daniel");
        names.add("John");

        // add() returns false when the element is already in the set
        System.out.println("Adding \"Harry\" again returns: " + names.add("Harry"));
        System.out.println("Set size: " + names.size());
        System.out.println("-----------------------------");

        // 2 - Call print method to print the set passed as its parameter
        print(names);
    }

    static void print(Set set) {
        // 3 - Print this set
        // Duplicates do not appear: a Set stores each element only once.
        // HashSet does not keep insertion order, so the order may differ from the order of add() calls.
        for (Object name : set) {
            System.out.println(name);
        }
    }
}
