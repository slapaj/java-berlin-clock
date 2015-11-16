package com.ubs.opsit.interviews.validator;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Slawek on 2015-11-16.
 */
public class Time24hFormatValidatorTest {
    private TimeValidator timeValidator = new Time24hFormatValidator();

    @Test
    public void timeShouldBeValid() {
        assertThat(timeValidator.isValid("11:34:45")).isTrue();
        assertThat(timeValidator.isValid("01:00:00")).isTrue();
        assertThat(timeValidator.isValid("23:04:25")).isTrue();
        assertThat(timeValidator.isValid("17:10:11")).isTrue();
        assertThat(timeValidator.isValid("24:00:00")).isTrue();
        assertThat(timeValidator.isValid("00:00:00")).isTrue();
    }

    @Test
    public void timeShouldBeNotValid() {
        assertThat(timeValidator.isValid("12:45:76")).isFalse();
        assertThat(timeValidator.isValid("-12:23:56")).isFalse();
        assertThat(timeValidator.isValid("22:54")).isFalse();
        assertThat(timeValidator.isValid("24:00:01")).isFalse();
    }
}