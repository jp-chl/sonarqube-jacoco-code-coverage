package com.tom.service;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MathServiceTest {
    private MathService mathService;

    @Before
    public void setUp() {
        mathService = new MathService();
    }

    @Test
    public void multipliesNumbers() {
        int result = mathService.multiply(2, 4);

        assertThat(result, equalTo(8));
    }

    @Test
    public void subtractNumbers() {
        int result = mathService.subtract(3, 2);

        assertThat(result, equalTo(1));
    }

    @Test
    public void divideNumbers() {
        int result = mathService.divide(6, 3);

        assertThat(result, equalTo(2));
    }
}
