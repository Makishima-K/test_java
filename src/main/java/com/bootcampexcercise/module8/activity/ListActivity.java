package com.bootcampexcercise.module8.activity;

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        // 1 - Create a list of names using ArrayList
        // and add "John", "John", "Harry" and "Daniel" to the list
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("John");
        names.add("Harry");
        names.add("Daniel");

        // 2 - Call print method to print the list passed as its parameter
        print(names);
    }

    static void print(List list) {
        // 3 - Print this list
        // Elements are printed in the same order they were added (insertion order),
        // and duplicates ("John" twice) are kept.
        for (Object name : list) {
            System.out.println(name);
        }
    }
}
