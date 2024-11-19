package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MultiplicationTableBuilderTest {
    @Test
    void should_return_true_when_isInRange_given_a_number_5() {
        // Given
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 5;

        // When
        boolean isInRange = multiplicationTableBuilder.isInRange(number);

        // Then
        assertTrue(isInRange);
    }

    // TODO: add more tests for isInRange
    @Test
    void should_return_true_when_isInRange_given_a_number_0() {
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 0;
        boolean isInRange = multiplicationTableBuilder.isInRange(number);
        assertTrue(isInRange);
    }

    @Test
    void should_return_true_when_isInRange_given_a_number_1001() {
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        int number = 1001;
        boolean isInRange = multiplicationTableBuilder.isInRange(number);
        assertTrue(isInRange);
    }
}
