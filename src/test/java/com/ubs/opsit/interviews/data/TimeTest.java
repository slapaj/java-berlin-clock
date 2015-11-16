package com.ubs.opsit.interviews.data;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Slawek on 2015-11-16.
 */
public class TimeTest {
    @Test
    public void testParseTime() {
        String timeString = "17:35:10";
        Time time = new Time(timeString);

        assertThat(time.getHours()).isEqualTo(17);
        assertThat(time.getMinutes()).isEqualTo(35);
        assertThat(time.getSeconds()).isEqualTo(10);
    }
}