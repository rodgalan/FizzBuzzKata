package kata.tdd.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

  @Test
  public void should_return_the_number() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String response = fizzBuzz.applyRule(2);
    assertEquals("2", response);
  }
}
