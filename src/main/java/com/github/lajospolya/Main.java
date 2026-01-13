package com.github.lajospolya;

import java.util.Set;

public class Main {
    static void main() {

        // Using Integer.MAX_VALUE to prevent use of cached integers
        int[] ints = new int[]{ Integer.MAX_VALUE, Integer.MAX_VALUE -  1, Integer.MAX_VALUE -  2, Integer.MAX_VALUE -  3, Integer.MAX_VALUE -  4, Integer.MAX_VALUE -  5, Integer.MAX_VALUE -  6, Integer.MAX_VALUE -  7, Integer.MAX_VALUE -  8, Integer.MAX_VALUE -  9,
                0, Integer.MAX_VALUE -  1, Integer.MAX_VALUE -  2, Integer.MAX_VALUE -  3, Integer.MAX_VALUE -  4, Integer.MAX_VALUE -  5, Integer.MAX_VALUE -  6, Integer.MAX_VALUE -  7, Integer.MAX_VALUE -  8, Integer.MAX_VALUE -  9,
                0, Integer.MAX_VALUE -  1, Integer.MAX_VALUE -  2, Integer.MAX_VALUE -  3, Integer.MAX_VALUE -  4, Integer.MAX_VALUE -  5, Integer.MAX_VALUE -  6, Integer.MAX_VALUE -  7, Integer.MAX_VALUE -  8, Integer.MAX_VALUE -  9,
                0, Integer.MAX_VALUE -  1, Integer.MAX_VALUE -  2, Integer.MAX_VALUE -  3, Integer.MAX_VALUE -  4, Integer.MAX_VALUE -  5, Integer.MAX_VALUE -  6, Integer.MAX_VALUE -  7, Integer.MAX_VALUE -  8, Integer.MAX_VALUE -  9,
                0, Integer.MAX_VALUE -  1, Integer.MAX_VALUE -  2, Integer.MAX_VALUE -  3, Integer.MAX_VALUE -  4, Integer.MAX_VALUE -  5, Integer.MAX_VALUE -  6, Integer.MAX_VALUE -  7, Integer.MAX_VALUE -  8, Integer.MAX_VALUE -  9,
                0, Integer.MAX_VALUE -  1, Integer.MAX_VALUE -  2, Integer.MAX_VALUE -  3, Integer.MAX_VALUE -  4, Integer.MAX_VALUE -  5, Integer.MAX_VALUE -  6, Integer.MAX_VALUE -  7, Integer.MAX_VALUE -  8, Integer.MAX_VALUE -  9,
                0, Integer.MAX_VALUE -  1, Integer.MAX_VALUE -  2, Integer.MAX_VALUE -  3, Integer.MAX_VALUE -  4, Integer.MAX_VALUE -  5, Integer.MAX_VALUE -  6, Integer.MAX_VALUE -  7, Integer.MAX_VALUE -  8, Integer.MAX_VALUE -  9,
                0, Integer.MAX_VALUE -  1, Integer.MAX_VALUE -  2, Integer.MAX_VALUE -  3, Integer.MAX_VALUE -  4, Integer.MAX_VALUE -  5, Integer.MAX_VALUE -  6, Integer.MAX_VALUE -  7, Integer.MAX_VALUE -  8, Integer.MAX_VALUE -  9,
                0, Integer.MAX_VALUE -  1, Integer.MAX_VALUE -  2, Integer.MAX_VALUE -  3, Integer.MAX_VALUE -  4, Integer.MAX_VALUE -  5, Integer.MAX_VALUE -  6, Integer.MAX_VALUE -  7, Integer.MAX_VALUE -  8, Integer.MAX_VALUE -  9,
                0, Integer.MAX_VALUE -  1, Integer.MAX_VALUE -  2, Integer.MAX_VALUE -  3, Integer.MAX_VALUE -  4, Integer.MAX_VALUE -  5, Integer.MAX_VALUE -  6, Integer.MAX_VALUE -  7, Integer.MAX_VALUE -  8, Integer.MAX_VALUE -  9,
                0, Integer.MAX_VALUE -  1, Integer.MAX_VALUE -  2, Integer.MAX_VALUE -  3, Integer.MAX_VALUE -  4, Integer.MAX_VALUE -  5, Integer.MAX_VALUE -  6, Integer.MAX_VALUE -  7, Integer.MAX_VALUE -  8, Integer.MAX_VALUE -  9,
                0, Integer.MAX_VALUE -  1, Integer.MAX_VALUE -  2, Integer.MAX_VALUE -  3, Integer.MAX_VALUE -  4, Integer.MAX_VALUE -  5, Integer.MAX_VALUE -  6, Integer.MAX_VALUE -  7, Integer.MAX_VALUE -  8, Integer.MAX_VALUE -  9};
        IntToHashMap intToHashMap = new IntToHashMap();
        for(int a = 0; a < 1_000_000; a++){
            Set<Integer> unique = intToHashMap.intToHashMap(ints);
            if(unique.isEmpty()) {
                return;
            }
        }
    }
}
