package com.thoughtworks.oobootcamp.refactoring.preservewholeobjectcase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PlanFactoryTest {

  @Test
  void should_return_a_plan_when_call_function_withRange_given_a_range_with_low_and_high() {
    PlanFactory planFactory = new PlanFactory();
    DayRange dayRange = new DayRange("low", "high");
    Plan plan = planFactory.generatePlan(dayRange.getHigh(), dayRange.getLow());

    assertNotNull(plan);
  }
}
