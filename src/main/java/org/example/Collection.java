package org.example;

import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.lang.*;

public class Collection {
    /**
     * Given a list of integers, return the highest integer
     * @param numbers - a list of integers
     * @return the largest integer
     */
    public static int findMax(List<Integer> numbers) {
        return numbers.stream().max(Integer::compare).get();
    }

    /**
     * Given a list of integers, return the lowest integer
     * @param numbers - a list of integers
     * @return the smallest integer
     */
    public static int findMin(List<Integer> numbers) {
        return numbers.stream().min(Integer::compare).get();
    }

    /**
     * Given a set of integers, remove all integers which are less than target
     * @param numbers - a list of integers
     * @param target - the threshold by which to remove integers
     */
    public static void removeLessThan(Set<Integer> numbers, int target) {
        List<Integer> unwanted = numbers.stream().filter(x -> x < target).collect(Collectors.toList());
        numbers.removeAll(unwanted);
    }

    /**
     * Given a set of integers, remove all integers which are greater than target
     * @param numbers - a list of integers
     * @param target - the threshold by which to remove integers
     */
    public static void removeGreaterThan(Set<Integer> numbers, int target) {
        List<Integer> unwanted = numbers.stream().filter(x -> x > target).collect(Collectors.toList());
        numbers.removeAll(unwanted);
    }

    /**
     * Given a queue of strings, remove half of all strings
     * Specifically, the size of the queue after the method is invoked should be equal to
     * floor(N/2) where N is the original size
     * @param strings - the queue of strings to mutuate
     */
    public static void removeHalf(Queue<String> strings) {
        int halfsize = strings.size() / 2;

        for (int i = 0; i < halfsize; i++) strings.remove();

    }
}
