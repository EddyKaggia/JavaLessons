package com.eddykaggia.app;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        // Initializing a new Array
        // Arrays have a FIXED size
        String[] friendsArray = new String[4];
        String[] friendsArray2 = {"Issa", "Molly", "Kelly", "Tiffany"};
        System.out.println(Arrays.toString(friendsArray2));
        //
        System.out.println();

        // Initializing a new ArrayList
        // Arraylists have a DYNAMIC size
        ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList2 =
                new ArrayList<>(Arrays.asList("Earn", "Van", "Paper Boi", "Darius"));
        System.out.println(friendsArrayList2);
        System.out.println();
    }
}
