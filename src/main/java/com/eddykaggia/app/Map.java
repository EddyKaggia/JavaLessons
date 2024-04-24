package com.eddykaggia.app;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        // <String, Integer> -> Key to hashmap indicating the keys of the map will be strings and the values will be integers.
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("Eddy", 12345);
        empIds.put("Louie", 123456);
        empIds.put("Claudia", 1234567);

        // Print out entire map
        System.out.println(empIds);
        // Print out specific value
        System.out.println(empIds.get("Louie"));
        // Check if specific key exists in map
        System.out.println(empIds.containsKey("Claudia"));
        // Check if specific value exists in map
        System.out.println(empIds.containsValue(7));
    }
}
