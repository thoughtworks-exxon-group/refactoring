package com.thoughtworks.oobootcamp.refactoring.encapsulatedowncast;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EBookTest {

  @Test
  void should_return_last_reading_when_call_function_lastReading_given_an_EBook_with_two_readings() {
    EBook eBook = new EBook(Arrays.asList(new Reading("1"), new Reading("2")));
    Reading lastReading = (Reading) eBook.lastReading();

    assertEquals("2", lastReading.getLabel());
  }
}
