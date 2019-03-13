package com.thoughtworks.oobootcamp.refactoring.replaceparameterwithmethods;

public class PriceGenerator {

  private final int quality;

  public PriceGenerator(int quality) {
    this.quality = quality;
  }

  public double getDiscountLevel() {
    return quality < 100 ? 0.85 : 1;
  }


  public double getFinalPrice(double itemPrice, double discountLevel) {
    return itemPrice * discountLevel;
  }
}
