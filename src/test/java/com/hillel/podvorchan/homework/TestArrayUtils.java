package com.hillel.podvorchan.homework;

import com.hillel.podvorchan.homework16.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArrayUtils {
    int[][] array = {{1, 2, 3}, {4, 5, 6}};

    @Test
    public void averageTest() {
        ArrayUtils.average(array);
        Assertions.assertEquals(3.5, ArrayUtils.average(array));

    }

    @Test
    public void notAverge() {
        Assertions.assertNotEquals(2, ArrayUtils.average(array));
    }

    @Test
    public void rowcolumn() {
        Assertions.assertFalse(ArrayUtils.rowСolumn(array));
    }
}
