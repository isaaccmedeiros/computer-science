package dev.isaaccmedeiros.searching;

import java.util.List;

public class BinarySearch implements Search {

    @Override
    public Integer find(List<Integer> numbers, int value) {
        int start, middle, end;

        start = 0;
        middle = numbers.size() / 2;
        end = numbers.size() - 1;

        while (numbers.size() > 1) {
            if (numbers.get(middle) == value)
                return middle;
            else if (numbers.get(middle) > value) {
                end = middle;
                middle = (middle - start) / 2;
            } else {
                start = middle;
                middle = (end - middle) / 2;
            }

            numbers = numbers.subList(start, end);
        }

        return null;
    }

}
