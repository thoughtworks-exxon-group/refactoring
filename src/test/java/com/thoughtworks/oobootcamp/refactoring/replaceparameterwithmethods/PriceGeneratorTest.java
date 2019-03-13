package com.thoughtworks.oobootcamp.refactoring.replaceparameterwithmethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PriceGeneratorTest {

  @Test
  void should_get_final_price__when_call_getFinalPrice_given_price_is_2_and_quality_is_99() {
    int quality = 99;
    PriceGenerator priceGenerator = new PriceGenerator(quality);
    double finalPrice = priceGenerator.getFinalPrice(2, priceGenerator.getDiscountLevel());

    Assertions.assertEquals(2 * 0.85, finalPrice);
  }
}
