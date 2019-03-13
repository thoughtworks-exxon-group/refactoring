package com.thoughtworks.oobootcamp.refactoring.encapsulatedowncast;

public class Reading {

  private final String label;

  public Reading(String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }
}
