package com.arop.mapOperations;

import org.junit.jupiter.api.Test;


class RepeatingElementsTest {
    @Test
    public void testRepeating() {
        RepeatingElements.outputUnique("1,2,3,4,4,5");
    }

    @Test
    public void testRepeatingError() {
        RepeatingElements.outputUnique("1,2,3,4,4,u,5");
    }
}