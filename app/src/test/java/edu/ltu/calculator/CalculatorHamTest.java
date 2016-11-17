package edu.ltu.calculator;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import org.junit.Before;

public class CalculatorHamTest {

    private Calculator mCalculator;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Test
    public void calculator_CorrectHamAdd_ReturnsTrue() {
        int res = (int) mCalculator.add(3,4);
        assertThat(res, both(greaterThan(6)).and(lessThan(8)));
    }
}