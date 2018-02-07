package com.md;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueryFormatterTest {
    @Test
    public void should_transform_params_to_lowercase() {
        String actual = QueryFormatter.format("Something");
        String expected = "something";
        assertEquals(expected, actual);
    }

    @Test
    public void should_escape_minus() {
        String actual = QueryFormatter.format("some-thing");
        String expected = "some\\-thing";
        assertEquals(expected, actual);
    }

    @Test
    public void name() {
    }
}
