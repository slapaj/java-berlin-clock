package com.ubs.opsit.interviews.data;

/**
 * Created by Slawek on 2015-11-16.
 */
public class BerlinClock {
    private String topLamp;
    private String fiveHoursLamp;
    private String oneHoursLamp;
    private String fiveMinutesLamp;
    private String oneMinuteLamp;

    public String getTopLamp() {
        return topLamp;
    }

    public void setTopLamp(String topLamp) {
        this.topLamp = topLamp;
    }

    public String getFiveHoursLamp() {
        return fiveHoursLamp;
    }

    public void setFiveHoursLamp(String fiveHoursLamp) {
        this.fiveHoursLamp = fiveHoursLamp;
    }

    public String getOneHoursLamp() {
        return oneHoursLamp;
    }

    public void setOneHoursLamp(String oneHoursLamp) {
        this.oneHoursLamp = oneHoursLamp;
    }

    public String getFiveMinutesLamp() {
        return fiveMinutesLamp;
    }

    public void setFiveMinutesLamp(String fiveMinutesLamp) {
        this.fiveMinutesLamp = fiveMinutesLamp;
    }

    public String getOneMinuteLamp() {
        return oneMinuteLamp;
    }

    public void setOneMinuteLamp(String oneMinuteLamp) {
        this.oneMinuteLamp = oneMinuteLamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BerlinClock that = (BerlinClock) o;

        if (topLamp != null ? !topLamp.equals(that.topLamp) : that.topLamp != null) return false;
        if (fiveHoursLamp != null ? !fiveHoursLamp.equals(that.fiveHoursLamp) : that.fiveHoursLamp != null)
            return false;
        if (oneHoursLamp != null ? !oneHoursLamp.equals(that.oneHoursLamp) : that.oneHoursLamp != null) return false;
        if (fiveMinutesLamp != null ? !fiveMinutesLamp.equals(that.fiveMinutesLamp) : that.fiveMinutesLamp != null)
            return false;
        return !(oneMinuteLamp != null ? !oneMinuteLamp.equals(that.oneMinuteLamp) : that.oneMinuteLamp != null);

    }

    @Override
    public int hashCode() {
        int result = topLamp != null ? topLamp.hashCode() : 0;
        result = 31 * result + (fiveHoursLamp != null ? fiveHoursLamp.hashCode() : 0);
        result = 31 * result + (oneHoursLamp != null ? oneHoursLamp.hashCode() : 0);
        result = 31 * result + (fiveMinutesLamp != null ? fiveMinutesLamp.hashCode() : 0);
        result = 31 * result + (oneMinuteLamp != null ? oneMinuteLamp.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(getTopLamp()).append("\r\n")
                .append(getFiveHoursLamp()).append("\r\n")
                .append(getOneHoursLamp()).append("\r\n")
                .append(getFiveMinutesLamp()).append("\r\n")
                .append(getOneMinuteLamp())
                .toString();
    }
}
