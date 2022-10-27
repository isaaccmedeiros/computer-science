package dev.isaaccmedeiros.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BinarySearchTest {

    @Test
    void shouldReturnIndexWhenThereIsValueInList() {
        // given
        final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinarySearch bs = new BinarySearch();

        // when
        Integer index1 = bs.find(numbers, 3);
        Integer index2 = bs.find(numbers, 1);
        Integer index3 = bs.find(numbers, 9);

        // then
        Assertions.assertEquals(2, index1);
        Assertions.assertEquals(0, index2);
        Assertions.assertEquals(8, index3);
    }

    @Test
    void shouldReturnNullWhenThereIsNoValueInList() {
        // given
        final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinarySearch bs = new BinarySearch();

        // when
        Integer index = bs.find(numbers, 0);

        // then
        Assertions.assertNull(index);

    }

}