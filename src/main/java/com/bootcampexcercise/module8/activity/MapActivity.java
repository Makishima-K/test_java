package com.bootcampexcercise.module8.activity;

import java.util.HashMap;
import java.util.Map;

public class MapActivity {

    public static void main(String[] args) {
        // 1 - Create a HashMap of key-value pairs
        // where key is id of type String and value is a name
        Map<String, String> employees = new HashMap<>();
        employees.put("E101", "John");
        employees.put("E102", "Harry");
        employees.put("E103", "Daniel");
        employees.put("E104", "John");    // duplicate VALUES are allowed
        employees.put("E102", "Stacie");  // duplicate KEY: replaces "Harry" with "Stacie"

        // 2 - Call print method to print the map passed as its parameter
        // print() is non-static, so create an instance of MapActivity
        MapActivity activity = new MapActivity();
        activity.print(employees);
    }

    void print(Map map) {
        // 3 - Print this map (keys and values)
        for (Object id : map.keySet()) {
            System.out.println("ID: " + id + " -> Name: " + map.get(id));
        }
    }
}
