package com.thoughtworks.oobootcamp.refactoring.encapsulatedowncast;


import java.util.ArrayList;
import java.util.List;

public class EBook {
  private List readings = new ArrayList<>();

  public EBook(List readings) {
    this.readings.addAll(readings);
  }

  public Object lastReading() {
    return readings.get(readings.size() - 1);
  }
}
