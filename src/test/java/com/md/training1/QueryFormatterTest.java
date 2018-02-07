package com.md.training1;

import com.md.training1.QueryFormatter;
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
    public void should_not_escape_escaped_minus() {
        String actual = QueryFormatter.format("some\\-thing");
        String expected = "some\\-thing";
        assertEquals(expected, actual);
    }

    @Test
    public void should_not_escape_with_quotation_mark() {
        String actual = QueryFormatter.format("\"some-thing\"");
        String excepted = "\"some-thing\"";
        assertEquals(excepted, actual);
    }
}
