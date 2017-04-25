package org.workshop.tdd.sample;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;


public class HelloWorldTests {
    @Test
    public void shouldReturnTrueGivenTwoIdenticalObjects() {
        assertThat("hello, world", is("hello, world"));
        assertThat("hello, world", equalTo("hello, world"));
        assertThat(156, is(156));
        assertThat(156, is(not(158)));
        assertThat(156, not(equalTo(158)));
        assertThat(156, is(not(equalTo(158))));
        assertThat(null, nullValue());
    }

    @Test
    public void shouldReturnTrueGivenArrayContainsElement()
    {
        assertThat(Arrays.asList(1, 3, 5), hasItem(3));
        assertThat(Arrays.asList(1, 3, 5), not(hasItem(2)));
    }

    @Test
    public void shouldReturnTrueGivenParameters(){
        int number = 3;
        boolean isOdd = false;
        if (number % 2 == 0) {
            isOdd = false;
        }else {
            isOdd = true;
        }

        assertThat(isOdd, is(true));
        assertTrue(isOdd);
    }
}
