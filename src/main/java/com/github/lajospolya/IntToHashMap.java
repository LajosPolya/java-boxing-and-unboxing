package com.github.lajospolya;

import java.util.HashSet;
import java.util.Set;

public class IntToHashMap {

    public Set<Integer> intToHashMap(int[] array) {
        Set<Integer> unique = new HashSet<>(array.length);
        for (int j : array) {
            unique.add(j);
        }
        return unique;
    }
}
