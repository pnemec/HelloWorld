package com.pnemec;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AverageTest {
    @Test
    public void computeAverage() throws Exception {

        int[] numbers = {1,2,3,4,5};
        Average avgEngine = new Average();
        int avg = avgEngine.computeAverage(numbers);

        assertEquals(3, avg);
    }
}