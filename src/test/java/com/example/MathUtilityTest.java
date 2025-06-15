package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilityTest {
    @Test
    public void testCalculateProduct() {
        MathUtility util = new MathUtility();
        assertEquals(6L, util.calculateProduct(2, 3));
        assertEquals(0L, util.calculateProduct(0, 5));
    }

    @Test
    public void testDivideValues() {
        MathUtility util = new MathUtility();
        assertEquals(2, util.divideValues(4, 2));
    }
}