package com.ubs.opsit.interviews;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Slawek on 2015-11-16.
 */
public class BerlinClockConverterTest {
    private TimeConverter timeConverter;

    @Before
    public void init() {
        timeConverter = new BerlinClockConverter();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidTimeFormat() {
        String invalidTimeFormat = "11:00:70";
        timeConverter.convertTime(invalidTimeFormat);
    }
}