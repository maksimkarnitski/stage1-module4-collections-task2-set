package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer i : sourceList) {
            if (i % 2 == 0) {
                result.add(i);
                do {
                    i /= 2;
                    result.add(i);
                } while (i % 2 == 0);
            } else {
                result.add(i);
                result.add(i*2);
            }
        }
        return result;
    }
}
