package com.eddykaggia.app;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        // Initializing a new Array
        // Arrays have a FIXED size -> Can't GROW or SHRINK
        String[] friendsArray = new String[4];
        String[] friendsArray2 = {"Issa", "Molly", "Kelli", "Tiffany"};
        System.out.println(Arrays.toString(friendsArray2));

        // Accessing elems in Array
        System.out.println(friendsArray2[3]); // Tiffany

        // Checking the size/length of an Array
        System.out.println(friendsArray2.length); // 4

        // Set an element
        friendsArray2[0] = "Lawrence";
        System.out.println(Arrays.toString(friendsArray2));

        // Have to swap Lawrence out coz ...
        friendsArray2[0] = "Issa";
        System.out.println(Arrays.toString(friendsArray2));

        System.out.println();

        // Initializing a new ArrayList
        // Arraylists have a DYNAMIC size
        ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList2 =
                new ArrayList<>(Arrays.asList("Earn", "Van", "Paper Boi", "Darius"));
        System.out.println(friendsArrayList2);

        // Accessing elems in ArrayList
        System.out.println(friendsArrayList2.get(3)); // Darius

        // Checking the size/length of an ArrayList
        System.out.println(friendsArrayList2.size()); // 4

        // Add an element
        friendsArrayList2.add("Earnest Marks");
        System.out.println(friendsArrayList2);

        // Set an element
        friendsArrayList2.set(0, "Tracy");
        System.out.println(friendsArrayList2);

        // Remove an element
        friendsArrayList2.remove("Tracy");
        System.out.println(friendsArrayList2);

        // Have to add Earn back in coz ...
        friendsArrayList2.add("Earn");
        System.out.println(friendsArrayList2);
    }
}
