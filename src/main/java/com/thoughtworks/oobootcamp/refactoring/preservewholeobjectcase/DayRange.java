package com.thoughtworks.oobootcamp.refactoring.preservewholeobjectcase;

public class DayRange {

  private final String low;
  private final String high;

  public DayRange(String low, String high) {
    this.low = low;
    this.high = high;
  }

  public String getLow() {
    return low;
  }

  public String getHigh() {
    return high;
  }
}
