package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();
        for (String s1 : firstSet) {
            if (secondSet.contains(s1)) {
                result.add(s1);
            }
        }
        if (!thirdSet.isEmpty()) {
            for (String s : thirdSet) {
                if (result.contains(s)) {
                    result.remove(s);
                }
            }
        }

        for (String s : thirdSet) {
            if (!firstSet.contains(s) && !secondSet.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }
}
