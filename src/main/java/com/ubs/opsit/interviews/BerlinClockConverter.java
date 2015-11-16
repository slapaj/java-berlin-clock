package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.data.BerlinClock;
import com.ubs.opsit.interviews.data.Time;
import com.ubs.opsit.interviews.validator.Time24hFormatValidator;
import com.ubs.opsit.interviews.validator.TimeValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Slawek on 2015-11-16.
 */
public class BerlinClockConverter implements  TimeConverter {
    private static final Logger LOG = LoggerFactory.getLogger(BerlinClockConverter.class);

    private final TimeValidator timeValidator;

    public BerlinClockConverter() {
        timeValidator = new Time24hFormatValidator();
    }

    public BerlinClockConverter(TimeValidator timeValidator) {
        this.timeValidator = timeValidator;
    }


    public String convertTime(String time) {
        LOG.info("Converting time {} to Berlin Clock", time);

        if(!timeValidator.isValid(time)) {
            throw new IllegalArgumentException("Provided time format is incorrect. Expected 24h format, given: " + time);
        }

        Time givenTime = new Time(time);
        BerlinClock berlinClock = new BerlinClock();
        berlinClock.setTopLamp(getTopLamp(givenTime.getSeconds()));
        berlinClock.setFiveHoursLamp(getFiveHoursLamp(givenTime.getHours()));
        berlinClock.setOneHoursLamp(getOneHourLamp(givenTime.getHours()));
        berlinClock.setFiveMinutesLamp(getFiveMinutesLamp(givenTime.getMinutes()));
        berlinClock.setOneMinuteLamp(getOneMinuteLamp(givenTime.getMinutes()));

        LOG.debug("BerlinClock = {}", berlinClock.toString());
        return berlinClock.toString();
    }

    private String getTopLamp(int seconds) {
        return seconds % 2 == 0 ? "Y" : "O";
    }

    private String getFiveHoursLamp(int hours) {
        StringBuilder lamp = new StringBuilder("OOOO");
        int howManyLamps = hours / 5;
        for (int i = 0; i < howManyLamps; i++) {
            lamp.replace(i, i + 1, "R");
        }

        return lamp.toString();
    }

    private String getOneHourLamp(int hours) {
        StringBuilder lamp = new StringBuilder("OOOO");
        int howManyLamps = hours % 5;

        for (int i = 0; i < howManyLamps; i++) {
            lamp.replace(i, i + 1, "R");
        }

        return lamp.toString();
    }

    private String getFiveMinutesLamp(int minutes) {
        StringBuilder lamp = new StringBuilder("OOOOOOOOOOO");
        int howManyLamps = minutes / 5;

        for (int i = 0; i < howManyLamps; i++) {
            if ( (i + 1) % 3 == 0) {
                lamp.replace(i, i + 1, "R");
            } else {
                lamp.replace(i, i + 1, "Y");
            }
        }

        return lamp.toString();
    }

    private String getOneMinuteLamp(int minutes) {
        StringBuilder lamp = new StringBuilder("OOOO");
        int howManyLamps = minutes % 5;

        for (int i = 0; i < howManyLamps; i++) {
            lamp.replace(i, i + 1, "Y");
        }

        return lamp.toString();
    }
}
