package com.tsystems.sbs;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DefaultRegexpPairsTest {
    @Test
    public void testDefaultPairs() {
        List<RegexpPair> defaultRegexpPairs = DefaultRegexpPairs.getDefaultRegexes();
        assertThat(defaultRegexpPairs.size(), is(2));

    }
}