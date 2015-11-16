package com.ubs.opsit.interviews.validator;

import java.util.regex.Pattern;

/**
 * Created by Slawek on 2015-11-16.
 */
public class Time24hFormatValidator implements TimeValidator {
    private final String TIME_FORMAT_24H = "(([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9])|24:00:00";

    private Pattern pattern24h = Pattern.compile(TIME_FORMAT_24H);

    public boolean isValid(String time) {
        return pattern24h.matcher(time).matches();
    }
}
