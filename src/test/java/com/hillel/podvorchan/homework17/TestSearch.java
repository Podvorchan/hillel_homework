package com.hillel.podvorchan.homework17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSearch {

    static int[] array = {1, 2, 3, 4, 5, 6};

    @Test
    public void search1() {
        int j = 6;
        Search.searchIndex(array, 6);
        Assertions.assertEquals(array.length, j);
    }
    @Test
    public void sorted() {
        int[] array = {1, 2, 3, 4, 5};
        Assertions.assertTrue(Search.isSorted(array));
    }
}
